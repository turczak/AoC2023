package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {
    private Scanner scanner;
    private File file;

    public MyFileReader() {
    }

    public void setFile(File file) throws FileNotFoundException {
        this.file = file;
        this.scanner = new Scanner(this.file);
    }

    public List<String> linesAsListOfStrings(){
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        return list;
    }
}
