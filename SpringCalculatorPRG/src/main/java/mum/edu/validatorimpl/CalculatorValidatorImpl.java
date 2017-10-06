package mum.edu.validatorimpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import  mum.edu.domain.Calculator;
import  mum.edu.validator.calculatorValidator;

@Service
public class CalculatorValidatorImpl implements calculatorValidator{
	public List<String> validate(Object object) {

		List<String> errors = new ArrayList<String>();

		Calculator c = (Calculator) object;

		try {
			Integer.parseInt(c.getNum1());
			Integer.parseInt(c.getNum2());

		} catch (NumberFormatException e) {
			errors.add("Invalid Input for Addition.");
		}

		try {
			Integer.parseInt(c.getNum3());
			Integer.parseInt(c.getNum4());

		} catch (NumberFormatException e) {
			errors.add("Invalid Input for Multiplication.");
		}

		return errors;

	}
}
