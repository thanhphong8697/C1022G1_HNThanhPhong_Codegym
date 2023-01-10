package CaseStudy.utils;

import CaseStudy.models.Facility.Facility;
import CaseStudy.models.Facility.Room;
import CaseStudy.models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteRoom {
    private static final String FILE_ROOM = "src\\CaseStudy\\filecsv\\room.csv";

    public static Map<Room, Integer> readRoom() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_ROOM);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String serviceName = temp[0];
                String usableArea = temp[1];
                String rentalCost = temp[2];
                String maxiumNumbOfPeople = temp[3];
                String rentalType = temp[4];
                String serviceCode = temp[5];
                String freeServiceIncluded = temp[6];
                Room room = new Room(serviceName, usableArea, rentalCost, maxiumNumbOfPeople, rentalType, serviceCode, freeServiceIncluded);
                roomIntegerMap.put(room, Integer.parseInt(temp[7]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomIntegerMap;
    }

    public static void writeRoom(Map<Room, Integer> roomIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_ROOM);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> roomIntegerMap1 : roomIntegerMap.entrySet()) {
                bufferedWriter.write(roomIntegerMap1.getKey().formatCSVRoom() + "," + roomIntegerMap1.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
