package CaseStudy.models.Person;

public class Employee extends Person {
    private String employeeId;
    private String academyLevel;
    private String posion;
    private String salary;

    public Employee() {
    }

    public Employee(String fullName, String birthday, String gender, String identityNUmb, String phoneNumb,
                    String email, String employeeId, String academyLevel, String posion, String salary) {
        super(fullName, birthday, gender, identityNUmb, phoneNumb, email);
        this.employeeId = employeeId;
        this.academyLevel = academyLevel;
        this.posion = posion;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        employeeId = employeeId;
    }

    public String getAcademyLevel() {
        return academyLevel;
    }

    public void setAcademyLevel(String academyLevel) {
        this.academyLevel = academyLevel;
    }

    public String getPosion() {
        return posion;
    }

    public void setPosion(String posion) {
        this.posion = posion;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + employeeId +
                ", academyLevel='" + academyLevel + '\'' +
                ", posion='" + posion + '\'' +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityNUmb=" + identityNUmb +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String formatCSVEmp() {
        final String COMMA = ",";
        return this.employeeId + COMMA + super.convertLine() + COMMA + this.academyLevel + COMMA + this.posion + COMMA + this.salary;
    }
}
