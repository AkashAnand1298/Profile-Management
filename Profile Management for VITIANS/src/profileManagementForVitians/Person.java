package profileManagementForVitians;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person
{
	private Name name;
	private String gender;
	private LocalDate dob;
	private String email;
	private String mobile;
	private Address adress;
	
	public Person(Name name, String gender, LocalDate dob, String email, String mobile, Address adress) {
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.adress = adress;
	}
	
	/* This method is used to get the age of the person.
	 */
	public Integer getAge()
	{
		Integer age = Period.between(this.dob, LocalDate.now()).getYears();
		return age;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}
}