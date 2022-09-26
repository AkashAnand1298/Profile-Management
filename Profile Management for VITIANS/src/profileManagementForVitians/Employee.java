package profileManagementForVitians;

import java.time.LocalDate;

public class Employee extends Person
{
    private String employeeID;
    private String qualification;
    private String responsiblity;
    private LocalDate dateOfJoining;
    
    public Employee(Name name, String gender, LocalDate dob, String email, String mobile, Address adress, String employeeID, String qualification, String responsiblity, LocalDate dateOfJoining)
    {
		super(name, gender, dob, email, mobile, adress);
		this.employeeID = employeeID;
		this.qualification = qualification;
		this.responsiblity = responsiblity;
		this.dateOfJoining = dateOfJoining;
	}
    
    public String getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    public String getQualification() {
        return qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public String getResponsiblity() {
        return responsiblity;
    }
    
    public void setResponsiblity(String responsiblity) {
        this.responsiblity = responsiblity;
    }
    
    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }
    
    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}