package org.example.formbeans;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class UserFormBean {

    private String email;
    private String password;
    private String confirmPassword;
    private String FullName;
}
