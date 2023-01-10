package IOTextFile.Exercise.National;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {
    public static List<National> readCSV() throws FileNotFoundException {
        List<National> nationalList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\MODULE 2\\module2\\src\\IOTextFile\\Exercise\\national.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String array[];
            National national;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                int id = Integer.parseInt(array[0]);
                String word = array[1];
                String name = array[2];
                national = new National(id, word, name);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return nationalList;
    }

    public static void main(String[] args) {
        try {
            ReadingFile.readCSV();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
