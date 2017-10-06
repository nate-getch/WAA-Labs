package mum.edu.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.domain.Calculator;
import mum.edu.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	public void sum(Calculator c) {
		long add1, add2;
		String sum;
		try {
			add1 = (!c.getNum1().equals("")) ? Long.parseLong(c.getNum1().toString()) : 0;
			add2 = (!c.getNum2().equals("")) ? Long.parseLong(c.getNum2().toString()) : 0;
			sum = Long.toString(add1 + add2);
		} catch (NumberFormatException e) {
			sum = "";
		}

		c.setSum(sum);

	}

	public void mul(Calculator c) {
		long mul1, mul2;
		String mul;
		try {
			mul1 = (!c.getNum3().equals("")) ? Long.parseLong(c.getNum3().toString()) : 0;
			mul2 = (!c.getNum4().equals("")) ? Long.parseLong(c.getNum4().toString()) : 0;
			mul = Long.toString(mul1 * mul2);
		} catch (NumberFormatException e) {
			mul = "";
		}
		c.setProduct(mul);
	}

}
