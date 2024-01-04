package com.java.ims.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MobileNumberValidator implements ConstraintValidator<MobileNumberValidation, Integer> {

	 @Override
	    public void initialize(MobileNumberValidation mobileNumberValidation) {
	        // Initialization, if needed
	    }

	    @Override
	    public boolean isValid(Integer mobileNo, ConstraintValidatorContext context) {
	        if (mobileNo == null) {
	            // Null values are considered invalid
	            return false;
	        }

	        // Customize this based on your actual mobile number validation criteria
	        String mobileNoString = String.valueOf(mobileNo);

	        // Check if the mobile number has a specific length (e.g., 10 digits)
	        return isValidMobileNumberLength(mobileNoString);
	    }

	    private boolean isValidMobileNumberLength(String mobileNoString) {
	        // Customize the length criterion based on your requirements
	        int expectedLength = 10;
	        return mobileNoString.length() == expectedLength;
	    }
	
	
}
