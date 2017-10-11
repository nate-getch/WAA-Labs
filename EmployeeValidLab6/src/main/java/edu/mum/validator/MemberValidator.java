package edu.mum.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import edu.mum.domain.Member;

public class MemberValidator implements Validator {
	@Override
	public boolean supports(Class<?> c) {
		return Member.class.isAssignableFrom(c);
	}

	@Override
	public void validate(Object command, Errors errors) {
		String[] errorArgs = { "First Name" };
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty", errorArgs);
		errorArgs = new String[] { "Last Name" };
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty", errorArgs);
		Member member = (Member) command;

		if (member.getMemberNumber() == null || member.getMemberNumber() <= 0)
			errors.rejectValue("memberNumber", "Member.Number.lessthan");
		if (member.getAge() < 18)
			errors.rejectValue("age", "Member.age");
		
	}

}
