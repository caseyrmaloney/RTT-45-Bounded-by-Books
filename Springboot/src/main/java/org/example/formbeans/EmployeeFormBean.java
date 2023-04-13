package org.example.formbeans;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.validation.EmailUnique;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
public class EmployeeFormBean {

    private Integer id;
    @NotEmpty(message = "Email address is required.")
    @Length(max = 20, message= "Email can not be longer than 20 characters")
    @Pattern(regexp=".+@.+\\.[a-z]+", message = "Invalid email format")
    @EmailUnique(message="email already esits in the database")
    private String email;
    @NotEmpty(message = "first name is required.")
    private String firstName;
    @NotEmpty(message = "last name is required.")
    private String lastName;
    private String jobTitle;
    private String extension;
    @Max(value = 100 , message="Cannot exceed 100 hours")
    private Integer vacationHours;
    private Integer officeId;
    private String profileImg;

}
