package mum.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
	private static final long serialVersionUID = 748392348L;
	private String num1;
	private String num2;
	private String num3;
	private String num4;
	private long sum;
	private long product;

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getNum3() {
		return num3;
	}

	public void setNum3(String num3) {
		this.num3 = num3;
	}

	public String getNum4() {
		return num4;
	}

	public void setNum4(String num4) {
		this.num4 = num4;
	}

	public long getSum() {
		long add1, add2;
		try {
			add1 = (!this.num1.equals("")) ? Long.parseLong(this.num1.toString()) : 0;
			add2 = (!this.num2.equals("")) ? Long.parseLong(this.num2.toString()) : 0;
			this.sum = add1 + add2;
		} catch (NumberFormatException e) {
			this.sum = 0;
		}

		return this.sum;
	}

	public long getProduct() {
		try {
			long mul1 = (!this.num3.equals("")) ? Long.parseLong(this.num3.toString()) : 0;
			long mul2 = (!this.num4.equals("")) ? Long.parseLong(this.num4.toString()) : 0;
			this.product = mul1 * mul2;
		} catch (NumberFormatException e) {
			this.product = 0;
		}
		return this.product;
	}

	public void setProduct(long product) {
		this.product = product;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
}
