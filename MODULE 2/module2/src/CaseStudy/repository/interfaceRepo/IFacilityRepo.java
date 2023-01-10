package CaseStudy.repository.interfaceRepo;

import CaseStudy.models.Facility.Room;
import CaseStudy.models.Facility.Villa;

public interface IFacilityRepo extends IRepository {
    void displayMaintenance();

    void addVilla(Villa villa);

    void addRoom(Room room);

    void maintenanceMap();
}
