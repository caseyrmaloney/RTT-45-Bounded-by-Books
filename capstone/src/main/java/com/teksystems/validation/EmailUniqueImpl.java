package com.teksystems.validation;
import com.teksystems.database.dao.UserDAO;
import com.teksystems.database.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * fixed email validation see if the email exists in the database or null
 */
@Slf4j
public class EmailUniqueImpl implements ConstraintValidator<EmailUnique, String> {

    public static final Logger LOG = LoggerFactory.getLogger(EmailUniqueImpl.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    public void initialize(EmailUnique constraintAnnotation) {

    }

    /**
     *
     * @param value
     * @param context
     * @return
     * validates the email and returns true is the email is not in the database
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }

        boolean valid = existsExample2(value);

        log.debug("Email " + value + " exists = " + valid);

        // we want this validation to return true if the email is NOT in the database

        return valid;
    }

    /**
     *
     * @param value
     * @return
     * use spring data jpa function to see if the email exists
     */

    public boolean existsExample2(String value) {
        // in this method we have used a spring data jpa function to see if the email exists
        boolean exists = userDAO.existsByEmail(value);
        return !exists;
    }

    /**
     *
     * @param value
     * @return
     * if the record returns it means they exist in the database
     * if null then the user does not exist
     * if true validation passes
     */

    public boolean existsExample1(String value) {
        // if a record returns it means they exist in the database
        // if null then the user does not exist

        User employee = userDAO.findByEmail(value);

        // if the result is true then the validation passes
        // so if the user returned from the query is null then we pass the validation
        return (employee == null);
    }

}