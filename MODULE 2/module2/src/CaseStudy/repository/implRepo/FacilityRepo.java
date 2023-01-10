package CaseStudy.repository.implRepo;

import CaseStudy.models.Facility.Facility;
import CaseStudy.models.Facility.Room;
import CaseStudy.models.Facility.Villa;
import CaseStudy.repository.interfaceRepo.IFacilityRepo;
import CaseStudy.utils.ReadAndWriteRoom;
import CaseStudy.utils.ReadAndWriteVilla;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepo implements IFacilityRepo {
    static Map<Facility, Integer> availableFacilityMap = new LinkedHashMap<>();
    static Map<Facility, Integer> maintenanceFacilityMap = new LinkedHashMap<>();

//    static {
//        Facility room1 = new Room("Thuê phòng", "40", "350000", "2",
//                "Thuê ngày", "SVRO-1111", "Bộ bàn ủi");
//        Facility room2 = new Room("Thuê phòng", "40", "9000000", "2",
//                "Thuê tháng", "SVRO-1112", "Bộ bàn ủi");
//        Facility room3 = new Room("Thuê phòng", "40", "90000000", "2",
//                "Thuê năm", "SVRO-1113", "Bộ bàn ủi");
//        Facility villa1 = new Villa("Thuê villa", "75", "4000000", "6",
//                "Thuê ngày", "SVVL-1114", "Standard", "35.0", "1");
//        Facility villa2 = new Villa("Thuê villa", "100", "120000000", "9",
//                "Thuê tháng", "SVV-L1115", "Sup", "45.0", "2");
//        Facility villa3 = new Villa("Thuê villa", "200", "1440000000", "13"
//                , "Thuê năm", "SVVL-11116", "Vip", "55.0", "2");
//        availableFacilityMap.put(room1, 1);
//        availableFacilityMap.put(room2, 2);
//        availableFacilityMap.put(room3, 5);
//        availableFacilityMap.put(villa1, 1);
//        availableFacilityMap.put(villa2, 2);
//        availableFacilityMap.put(villa3, 5);
//    }

    @Override
    public void displayMaintenance() {
        for (Map.Entry<Facility, Integer> facilityMaintenance : maintenanceFacilityMap.entrySet()) {
            System.out.println(facilityMaintenance.getKey() + " - " + facilityMaintenance.getValue());
        }
    }

    @Override
    public void addVilla(Villa villa) {
        Map<Villa, Integer> mapVillaAdd = ReadAndWriteVilla.readVilla();
        availableFacilityMap.put(villa, 0);
        ReadAndWriteVilla.writeVilla(mapVillaAdd);
    }

    @Override
    public void addRoom(Room room) {
        Map<Room, Integer> mapRoomAdd = ReadAndWriteRoom.readRoom();
        mapRoomAdd.put(room, 0);
        ReadAndWriteRoom.writeRoom(mapRoomAdd);
    }

    @Override
    public void maintenanceMap() {
        List<Facility> maintenanceList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> facility : availableFacilityMap.entrySet()) {
            if (facility.getValue() >= 5) {
                maintenanceFacilityMap.put(facility.getKey(), facility.getValue());
                maintenanceList.add(facility.getKey());
            }
        }
        for (int i = 0; i < maintenanceList.size(); i++) {
            availableFacilityMap.remove(maintenanceList.get(i));
        }
    }

    @Override
    public void display() {
        Map<Room, Integer> mapRoom = ReadAndWriteRoom.readRoom();
        availableFacilityMap.putAll(mapRoom);
        Map<Villa, Integer> mapVilla = ReadAndWriteVilla.readVilla();
        availableFacilityMap.putAll(mapVilla);
        for (Map.Entry<Facility, Integer> facility : availableFacilityMap.entrySet()) {
            System.out.println(facility.getKey() + " - " + facility.getValue());
        }

    }

    @Override
    public void add(Object object) {
//        Room room = (Room) object;
//        availableFacilityMap.put(room, 0);
//        ReadAndWriteRoom.writeRoom(availableFacilityMap);
    }

    @Override
    public Object findID(String id) {
        return null;
    }

}
