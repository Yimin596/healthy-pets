package com.example.demo.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.Record;
import com.example.demo.repository.UserRepository;
import com.example.demo.web.dto.UserRegistrationDto;

/**
 *  1.  This class implements UserService.java interface thus it must implements all of interface's methods
 *  2.  UserService.java extends the UserDetailsService interface from Spring security
 *  3.  The UserDetailsService interface will make this class also implements its methods.
 *  4.  This class basically just fetch user data from Dto package which in this case UserDao interface
 *  5.  As usual when @Autowired Spring will refer to the only one immediate implementation of the interface
 * @author zijun mei, yimin li
 *
 */
@Service
public class UserServiceImpl implements UserService {


	/**
	 * the object of userRepository.
	 */
    @Autowired
    private UserRepository userRepository;

    /**
     * the object of passwordEncoder.
     */
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
  


  

	/**
     * find User entity object by submitting username as key word.
     */
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    /**
     * save user registration information.
     */
    public User save(UserRegistrationDto registration){
    
        User user = new User();
 
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        
        user.setPassword(passwordEncoder.encode(registration.getPassword()));
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));
        
        return userRepository.save(user);
    }  

  

    /**
     *  Override the method from UserDetailsService.
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(),
                mapRolesToAuthorities(user.getRoles()));
    }

    /**
     * private method collect the role extend grantedAuthority.
     * @param roles the object of role entity.
     * @return a collection of list.
     */
    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
