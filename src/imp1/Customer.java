package imp1;

import java.util.List;

public class Customer {
	
	
	private int customerId;
	private String customerName;
	private String mob;
	private String age;
	private String location;
	private String emailId;
	private double salary;
	private List<Address> address;
	
	public Customer() {
		
	}

	public Customer(int customerId, String customerName, String mob, String age, String location, String emailId,
			double salary, List<Address> address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.mob = mob;
		this.age = age;
		this.location = location;
		this.emailId = emailId;
		this.salary = salary;
		this.address = address;
	}
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mob=" + mob + ", age=" + age
				+ ", location=" + location + ", emailId=" + emailId + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	
	
	

}
