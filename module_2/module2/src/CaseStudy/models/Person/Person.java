package CaseStudy.models.Person;

public abstract class Person {
    public String fullName;
    public String birthday;
    public String gender;
    public String identityNUmb;
    public String phoneNumb;
    public String email;

    public Person() {
    }

    public Person(String fullName, String birthday, String gender, String identityNUmb, String phoneNumb, String email) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.identityNUmb = identityNUmb;
        this.phoneNumb = phoneNumb;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityNUmb() {
        return identityNUmb;
    }

    public void setIdentityNUmb(String identityNUmb) {
        this.identityNUmb = identityNUmb;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityNUmb=" + identityNUmb +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String convertLine() {
        final String COMMA = ",";
        return this.fullName + COMMA + this.birthday + COMMA + this.gender + COMMA
                + this.identityNUmb + COMMA + this.phoneNumb + COMMA + this.email;
    }
}
