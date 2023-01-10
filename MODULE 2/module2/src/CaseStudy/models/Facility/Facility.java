package CaseStudy.models.Facility;

public class Facility {
    public String serviceName;
    public String usableArea;
    public String rentalCost;
    public String maxiumNumbOfPeople;
    public String rentalType;
    public String serviceCode;

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, String rentalCost, String maxiumNumbOfPeople, String rentalType, String serviceCode) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxiumNumbOfPeople = maxiumNumbOfPeople;
        this.rentalType = rentalType;
        this.serviceCode = serviceCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getMaxiumNumbOfPeople() {
        return maxiumNumbOfPeople;
    }

    public void setMaxiumNumbOfPeople(String maxiumNumbOfPeople) {
        this.maxiumNumbOfPeople = maxiumNumbOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxiumNumbOfPeople=" + maxiumNumbOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }

    public String convertLine() {
        final String COMMA = ",";
        return this.serviceName + COMMA + this.usableArea + COMMA + this.rentalCost + COMMA + this.maxiumNumbOfPeople + COMMA + this.rentalType + COMMA + this.serviceCode;
    }
}
