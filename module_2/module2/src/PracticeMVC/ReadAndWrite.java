package PracticeMVC;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String FILE_WORKER = "D:\\MODULE 2\\module2\\src\\PracticeMVC\\workerFile.csv";

    public static List<Worker> readWorker() {
        List<Worker> workerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_WORKER);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String workerCode = temp[0];
                String name = temp[1];
                String email = temp[2];
                String address = temp[3];
                Worker worker = new Worker(workerCode, name, email, address);
                workerList.add(worker);
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
        return workerList;
    }

    public static void writeWorker(List<Worker> workerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_WORKER);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Worker worker : workerList){
                bufferedWriter.write(worker.getWorkerCode() + "," + worker.getName() + "," + worker.getEmail() + "," + worker.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeWorkerAppend(List<Worker> workerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_WORKER,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Worker worker : workerList){
                bufferedWriter.write(worker.getWorkerCode() + "," + worker.getName() + "," + worker.getEmail() + "," + worker.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
