package com.example.demo.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;
/**
 * FieldMatchValidator : Implementation of ConstraintValidator based on FieldMatch
 * @author Zijun Mei, Yimin Li
 *
 */
public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
	/**
	 * Define the name first field of name.
	 */
    private String firstFieldName;
    /**
     * Define the second field of name.
     */
    private String secondFieldName;

    /**
     * The initializer method sets the initial value of a variable.
     * @param The constraint annotation field instance field matches the names of the three fields that contain the fields to check.
     */
    @Override
    public void initialize(final FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
    }

    /**
     * Method verifies the specified value
     * @param The value object contains the name of the field to check. 
     * @param constraint context.
     * @return True or false.
     */
    @Override
    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        try {
            final Object firstObj = BeanUtils.getProperty(value, firstFieldName);
            final Object secondObj = BeanUtils.getProperty(value, secondFieldName);
            return firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
        } catch (final Exception ignore) {}
        return true;
    }
}