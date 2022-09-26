package profileManagementForVitians;

import java.time.LocalDate;

public class Alumni extends Person
{
    private String alumniID;
    private Integer yearOfGraduation;
    private String degree;
    private String currentResidingPlace;
    
    public Alumni(Name name, String gender, LocalDate dob, String email, String mobile, Address adress, String alumniID, Integer yearOfGraduation, String degree, String currentResidingPlace)
    {
		super(name, gender, dob, email, mobile, adress);
		this.alumniID = alumniID;
		this.yearOfGraduation = yearOfGraduation;
		this.degree = degree;
		this.currentResidingPlace = currentResidingPlace;
	}
    
    public String getAlumniID() {
        return alumniID;
    }
    
    public void setAlumniID(String alumniID) {
        this.alumniID = alumniID;
    }
    
    public Integer getYearOfGraduation() {
        return yearOfGraduation;
    }
    
    public void setYearOfGraduation(Integer yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
    
    public String getDegree() {
        return degree;
    }
    
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    public String getCurrentResidingPlace() {
        return currentResidingPlace;
    }
    
    public void setCurrentResidingPlace(String currentResidingPlace) {
        thiis.currentResidingPlace = currentResidingPlace;
    }
}
