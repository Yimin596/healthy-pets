package com.example.demo.web.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.example.demo.constraint.FieldMatch;

@FieldMatch.List({
        @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
        @FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
})
/**
 * The detail test objective class for user registration.
 * @author zijun mei, yimin li
 *
 */
public class UserRegistrationDto {

	/**
	 * the registration information of first name.
	 */
    @NotEmpty
    private String firstName;
    /**
	 * the registration information of lastName.
	 */
    @NotEmpty
    private String lastName;
    /**
	 * the registration information of password.
	 */
    @NotEmpty
    private String password;
    /**
	 * the registration information of confirmPassword.
	 */
    @NotEmpty
    private String confirmPassword;
    /**
	 * the registration information of email.
	 */
    @Email
    @NotEmpty
    private String email;
    /**
	 * the registration information of confirmEmail.
	 */
    @Email
    @NotEmpty
    private String confirmEmail;
    /**
	 * the registration information of terms.
	 */
    @AssertTrue
    private Boolean terms;

    /**
     * the method of get firstname value.
     * @return the value firstname.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * the method of set up the firstname value.
     * @param firstName the information of firstname.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * the method of get lastName value.
     * @return the value lastName.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * the method of set up the lastName value.
     * @param lastName the information of lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * the method of get password value.
     * @return the value password.
     */
    public String getPassword() {
        return password;
    }
    /**
     * the method of set up the password value.
     * @param password the information of password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * the method of get confirmPassword value.
     * @return the value confirmPassword.
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }
    /**
     * the method of set up the confirmPassword value.
     * @param confirmPassword the information of confirmPassword.
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * the method of get email value.
     * @return the value email.
     */
    public String getEmail() {
        return email;
    }
    /**
     * the method of set up the email value.
     * @param email the information of email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * the method of get confirmEmail value.
     * @return the value confirmEmail.
     */
    public String getConfirmEmail() {
        return confirmEmail;
    }
    /**
     * the method of set up the confirmEmail value.
     * @param confirmEmail the information of confirmEmail.
     */
    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    /**
     * the method of get terms value.
     * @return the value terms.
     */
    public Boolean getTerms() {
        return terms;
    }
    /**
     * the method of set up the terms value.
     * @param terms the information of terms.
     */
    public void setTerms(Boolean terms) {
        this.terms = terms;
    }

}

