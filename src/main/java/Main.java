import day1.Trebuchet;
import utils.MyFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        MyFileReader fileReader = new MyFileReader();

        //Day1 part I
        fileReader.setFile(new File("src/main/resources/day1.txt"));
        List<String> lines = fileReader.linesAsListOfStrings();
        System.out.println("Day 1, part I answer: " + new Trebuchet().sumAllNumbersInFile(lines));
    }
}
