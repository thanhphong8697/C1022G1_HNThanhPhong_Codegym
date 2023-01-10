package PracticeMVC2;

import PracticeMVC.ReadAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReWi {
    public static final String PATH = "D:\\MODULE 2\\module2\\src\\PracticeMVC2\\file.csv";

    public static List<Model> readMo() {
        List<Model> modelList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Model model;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String name = temp[0];
                String id = temp[1];
                String phone = temp[2];
                String email = temp[3];
                model = new Model(name, id, phone, email);
                modelList.add(model);
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
        return modelList;
    }

    public static void writeMo(List<Model> modelList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Model model : modelList) {
                bufferedWriter.write(model.getName() + "," + model.getId() + "," + model.getPhone() + "," + model.getEmail());
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
    public static void writeMoAp(List<Model> modelList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Model model : modelList) {
                bufferedWriter.write(model.getName() + "," + model.getId() + "," + model.getPhone() + "," + model.getEmail());
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
