package annonymous;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import cucumber.api.java.en.Given;

public class Stepdefs {
	
	@Given("Customer {} orders {}")
	public void customerOrders(Customer customer, Beverage beverage) {
		System.out.println("Customer name is " + customer.getName() + " orders " + beverage);
	}
	
	@Given("the date value is {}")
	public void date(Date date) {
		System.out.println("Date - " + date);
	}
	
	@Given("the biginteger value is {}")
	public void theBigIntegerValueIs(BigInteger bigint) {
		System.out.println("BigInteger - " + bigint);
	}
	
	@Given("the bigdecimal value is {}")
	public void theBigDecimalValueIs(BigDecimal bigdec) {
		System.out.println("BigDecimal - " + bigdec);
	}

}
