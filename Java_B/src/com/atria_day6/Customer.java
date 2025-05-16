package com.atria_day6;

public class Customer 
{
	private String customerNmae;
	private int customerId;
	private String customercity;
	public String getCustomerNmae() {
		return customerNmae;
	}
	public void setCustomerNmae(String customerNmae) {
		this.customerNmae = customerNmae;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	@Override
	public String toString() {
		return "Customer [customerNmae=" + customerNmae + ", customerId=" + customerId + ", customercity="
				+ customercity + "]";
	}
}


