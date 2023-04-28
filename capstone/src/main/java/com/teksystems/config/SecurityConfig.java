package com.teksystems.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


/**
 *SecurtiyCongif is part of authenticating the user
 *
 *
 */

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Configuration
public class SecurityConfig {


    /**
     *
     * @param http
     * @return
     * @throws Exception
     *
     * HTTPSecuirty anyting in the URL that is going to require authentication so that if you try to type in path
     * in the URL there is no access unless you are authenticated
     * Request methods for the login page and logout URl that is implemented by spring secuirty
     *
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf().disable()
                // this line is saying anything with the URL /admin/** is going require authentication
                // you can put any number of URLS that you want to secure here with a comma sepearting them,
                .authorizeHttpRequests().requestMatchers("/admin/**","/books/**").authenticated()
                // everything else in the application is going to permitted
                .anyRequest().permitAll()
                .and()
                .formLogin()
                // this is the URL to the login page
                // the request method for this is implemented in the login controller
                // to display the login.jsp view
                .loginPage("/login/login")
                // this is the URL that the login page will submit to with a action="/user/loginpost" method="POST"
                // this controller method is implemented by spring security and you dont have to do anything to use it
                // other than set the method to post and set the action to this URL
                .loginProcessingUrl("/login/login")
                // this URL is where spring security will send the user IF they have not requested a secure URL
                // if they have requested a secure URL spring security will ignore this and send them to the
                // secured url they requested
                .defaultSuccessUrl("/")
                .and()
                .logout()
                .invalidateHttpSession(true)
                .logoutUrl("/login/logout")
                .logoutSuccessUrl("/index");
        return http.build();
    }

    /**
     *
     * @return
     * Returns a BCrypt password to the database so the passwords are encrytped
     */
    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     *
     * @param authConfig
     * @return
     * @throws Exception
     *
     * return the authenticated manager to make sure that the use is authenticated
     */

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }



}
