package com.example.demo.service;



import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.model.User;
import com.example.demo.web.dto.UserRegistrationDto;

/**
 *  1.  This interface specify to find User entity object by submitting username as key word.
 *  2.  This interface specify to save registration object.
 *  3.  This interface extends UserDetailsService class from Spring Security
 * @author Zijun Mei, Yimin Li
 *
 */
public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
