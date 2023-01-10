package CaseStudy.services.implService;

import CaseStudy.models.Facility.Room;
import CaseStudy.models.Facility.Villa;
import CaseStudy.repository.implRepo.FacilityRepo;
import CaseStudy.repository.interfaceRepo.IFacilityRepo;
import CaseStudy.services.interfaceService.IFacilityService;

public class FacilityService implements IFacilityService {
    IFacilityRepo iFacilityRepo = new FacilityRepo();

    @Override
    public void displayMaintenance() {
        iFacilityRepo.displayMaintenance();
    }

    @Override
    public void addVilla(Villa villa) {
        iFacilityRepo.addVilla(villa);
    }

    @Override
    public void addRoom(Room room) {
        iFacilityRepo.addRoom(room);
    }

    @Override
    public void maintenanceMap() {
        iFacilityRepo.maintenanceMap();
    }

    @Override
    public void display() {
        iFacilityRepo.display();
    }

    @Override
    public void add(Object object) {
//        Room room = (Room) object;
//        iFacilityRepo.add(room);
    }

    @Override
    public Object findID(String id) {
        return iFacilityRepo.findID(id);
    }
}
