package CaseStudy.models.Person;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String fullName, String birthday, String gender, String identityNUmb, String phoneNumb, String email, String customerId, String customerType, String address) {
        super(fullName, birthday, gender, identityNUmb, phoneNumb, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityNUmb=" + identityNUmb +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String formatCSVCus() {
        final String COMMA = ",";
        return this.customerId + COMMA + super.convertLine() + COMMA + this.customerType + COMMA + this.address;

    }
}
