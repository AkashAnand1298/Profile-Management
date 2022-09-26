package profileManagementForVitians;

import java.time.LocalDate;
import java.time.Period;

public class Faculty extends Person
{
	private String facultyId;
	private String responsibility;
	private LocalDate dateOfJoining;
	private String school;
	private String yearsOfExperience;
	
	
	
	public Faculty(Name name, String gender, LocalDate dob, String email, String mobile, Address adress,
			String facultyId, String responsibility, LocalDate dateOfJoining, String school, String yearsOfExperience)
	{
		super(name, gender, dob, email, mobile, adress);
		this.facultyId = facultyId;
		this.responsibility = responsibility;
		this.dateOfJoining = dateOfJoining;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	/* This method is used to get the no of years the faculty has been working in VIT.
	 */
	public int getYearsInVIT()
	{
		return Period.between(dateOfJoining, LocalDate.now()).getYears();
	}
	
	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
}