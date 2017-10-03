package mum.service;

import mum.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService {
	public void sum(Calculator c) {
		c.getSum();
	}

	public void mul(Calculator c) {
		c.getProduct();
	}
}
