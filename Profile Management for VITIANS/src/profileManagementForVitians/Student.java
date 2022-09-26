package profileManagementForVitians;

public class Student
{
    private Integer expectedYearOfGraduation;
    private Integer registrationNumber;
    private String program;
    private String branch;
    private String school;
    private Boolean isHosteller;
    private Double creditsRequired;
    private Double creditsGot;

    public Integer getExpectedYearOfGraduation() {
        return expectedYearOfGraduation;
    }

    public void setExpectedYearOfGraduation(Integer expectedYearOfGraduation) {
        this.expectedYearOfGraduation = expectedYearOfGraduation;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Boolean getIsHosteller() {
        return isHosteller;
    }

    public void setIsHosteller(Boolean isHosteller) {
        this.isHosteller = isHosteller;
    }

    public Double getCreditsRequired() {
        return creditsRequired;
    }

    public void setCreditsRequired(Double creditsRequired) {
        this.creditsRequired = creditsRequired;
    }

    public Double getCreditsGot() {
        return creditsGot;
    }

    public void setCreditsGot(Double creditsGot) {
        this.creditsGot = creditsGot;
    }
}