package IOTextFile.Exercise.CopyFile;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class CopyFile {
    public static final String FILE_ORIGIONAL = "D:\\MODULE 2\\module2\\src\\IOTextFile\\Exercise\\CopyFile\\origional";
    public static final String FILE_NEW = "D:\\MODULE 2\\module2\\src\\IOTextFile\\Exercise\\CopyFile\\new";

    public static void readAndWriteFileCSV() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String line;
        int count = 0;
        try {
            fileReader = new FileReader(FILE_ORIGIONAL);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileWriter = new FileWriter(FILE_NEW);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count += line.length();
            }
            bufferedWriter.flush();
            System.out.println("Số ký tự đã sao chép là: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CopyFile.readAndWriteFileCSV();
    }
}
