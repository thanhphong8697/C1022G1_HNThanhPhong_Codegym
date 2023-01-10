package CaseStudy.utils;

import CaseStudy.models.Facility.Room;
import CaseStudy.models.Facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteVilla {
    private static final String FILE_VILLA = "src\\CaseStudy\\filecsv\\villa.csv";

    public static Map<Villa, Integer> readVilla() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_VILLA);
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
                String roomStandard = temp[6];
                String poolArea = temp[7];
                String numbOfFloor = temp[8];
                Villa villa = new Villa(serviceName, usableArea, rentalCost, maxiumNumbOfPeople, rentalType, serviceCode, roomStandard, poolArea, numbOfFloor);
                villaIntegerMap.put(villa, Integer.parseInt(temp[9]));
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
        return villaIntegerMap;
    }

    public static void writeVilla(Map<Villa, Integer> villaIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_VILLA);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> villaIntegerMap1 : villaIntegerMap.entrySet()) {
                bufferedWriter.write(villaIntegerMap1.getKey().formatCSVVilla() + "," + villaIntegerMap1.getValue());
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
