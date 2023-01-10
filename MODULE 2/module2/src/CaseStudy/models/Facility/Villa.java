package CaseStudy.models.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String numbOfFloor;

    public Villa() {
    }

    public Villa(String serviceName, String usableArea, String rentalCost, String maxiumNumbOfPeople, String rentalType,
                 String serviceCode, String roomStandard, String poolArea, String numbOfFloor) {
        super(serviceName, usableArea, rentalCost, maxiumNumbOfPeople, rentalType, serviceCode);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbOfFloor = numbOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumbOfFloor() {
        return numbOfFloor;
    }

    public void setNumbOfFloor(String numbOfFloor) {
        this.numbOfFloor = numbOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numbOfFloor=" + numbOfFloor +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxiumNumbOfPeople=" + maxiumNumbOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }

    public String formatCSVVilla() {
        final String COMMA = ",";
        return super.convertLine() + COMMA + this.roomStandard + COMMA + this.poolArea + COMMA + this.numbOfFloor;
    }
}
