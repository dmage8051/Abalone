package org.example.csv;

import org.example.entity.Abalone;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    private String pathToFile;

    public CSVWriter(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void writeAbaloneList(List<Abalone> abalones) throws IOException {
        FileWriter fileWriter = new FileWriter(this.pathToFile);

        for (Abalone abalone : abalones) {
            fileWriter.write(abalone.toString() + "\n");
        }

        fileWriter.close();
    }
}
