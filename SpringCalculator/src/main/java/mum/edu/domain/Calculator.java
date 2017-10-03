package mum.edu.domain;
import java.io.Serializable;
public class Calculator implements Serializable {
	private static final long serialVersionUID = 5784L;
	private String num1;
	private String num2;
	private String num3;
	private String num4;
	private String sum;
	private String product;
	
	public Calculator() {
	}

	public Calculator(String num1, String num2, String num3, String num4, String sum, String product) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.sum = sum;
		this.product = product;
	}
	
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
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
}
