package org.example.csv;

import org.example.entity.Abalone;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    private String pathToFile;
    public CSVReader(String pathToFile)  {
        this.pathToFile = pathToFile;
    }

    public List<Abalone> getAbaloneList() throws IOException {
        List<Abalone> abalonesList = new ArrayList<>();
        FileReader fileReader = new FileReader(this.pathToFile);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lst = line.split(",");
            Abalone abalone = new Abalone(
                    lst[0],
                    Double.valueOf(lst[1]),
                    Double.valueOf(lst[2]),
                    Double.valueOf(lst[3]),
                    Double.valueOf(lst[4]),
                    Double.valueOf(lst[5]),
                    Double.valueOf(lst[6]),
                    Double.valueOf(lst[7]),
                    Integer.parseInt(lst[8])
            );
            abalonesList.add(abalone);
        }
        fileReader.close();
        return abalonesList;
    }
}
