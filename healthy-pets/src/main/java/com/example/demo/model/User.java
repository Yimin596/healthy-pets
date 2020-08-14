package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Collection;
import java.util.List;

/**
 * The entity of the user table.
 * @author Zijun Mei, Yimin Li
 *
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

	/**
	 * the id attribute of the table.
	 */
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @Email
    private String email;
    /**
	 * the password attribute of the table.
	 */
    /**
	 * the firstName attribute of the table.
	 */
    private String firstName;
    /**
	 * the lastName attribute of the table.
	 */
    private String lastName;
  
    /**
	 * the password attribute of the table.
	 */
    private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Record> record;

  

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    /**
     * object of role entity.
     */
    private Collection<Role> roles;
    /**
     * construction method of the class.
     */
    public User() {
    }

    /**
     * construction method with series of parameters.
     * @param firstName the firstName attribute of the table.
     * @param lastName lastName attribute of the table.
     * @param email the email attribute of the table.
     * @param password the password attribute of the table.
     */
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    /**
     * construction method with series of parameters and role set.
     * @param firstName the firstName attribute of the table.
     * @param lastName lastName attribute of the table.
     * @param email the email attribute of the table.
     * @param password the password attribute of the table.
     * @param roles join with the role table.
     */
    public User(String firstName, String lastName, String email, String password, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    /**
     * method for get Id value.
     * @return id of the entity.
     */
    public Long getId() {
       return id;
    }

    /**
     * the method for set the id attribute.
     * @param id id of the entity.
     */
   public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * method for get firstName value.
     * @return firstName of the entity.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * the method for set the firstName attribute.
     * @param firstName the firstName of the entity.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * method for get lastName value.
     * @return lastName of the entity.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * the method for set the lastName attribute.
     * @param lastName the lastName of the entity.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * method for get email value.
     * @return email of the entity.
     */
    public String getEmail() {
        return email;
    }


    /**
     * the method for set the email attribute.
     * @param email email of the entity.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * method for get password value.
     * @return password of the entity.
     */
    public String getPassword() {
        return password;
    }


    /**
     * the method for set the password attribute.
     * @param password password of the entity.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * method for get roles object.
     * @return object of roles .
     */
    public Collection<Role> getRoles() {
        return roles;
    }


    /**
     * the method for set the roles object.
     * @param roles roles of the entity.
     */
    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public List<Record> getRecord() {
  		return record;
  	}

  	public void setRecord(List<Record> record) {
  		this.record = record;
  	}

    /**
     * return the certain format of a string which include user's registration information.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + "*********" + '\'' +
                ", roles=" + roles +
                '}';
    }
    
}
