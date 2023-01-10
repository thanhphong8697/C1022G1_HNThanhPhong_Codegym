package CaseStudy.models.Facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, String usableArea, String rentalCost, String maxiumNumbOfPeople, String rentalType,
                String serviceCode, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCost, maxiumNumbOfPeople, rentalType, serviceCode);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxiumNumbOfPeople=" + maxiumNumbOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }

    public String formatCSVRoom() {
        final String COMMA = ",";
        return super.convertLine() + COMMA + this.freeServiceIncluded;
    }
}
