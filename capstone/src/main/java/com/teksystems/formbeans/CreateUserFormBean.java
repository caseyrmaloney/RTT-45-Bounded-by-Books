package com.teksystems.formbeans;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateUserFormBean {

    @NotEmpty(message = "Email must not be empty")
    private String email;

    @NotEmpty(message = "First name must not be empty")
    private String firstName;

    @NotEmpty(message = "Last name must not be empty")
    private String lastName;

    @NotEmpty(message = "Password must not be empty")
    private String password;

    @NotEmpty(message = "Confirm password must not be empty")
    private String confirmPassword;
}
