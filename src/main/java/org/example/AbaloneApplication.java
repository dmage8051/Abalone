package org.example;

import org.example.csv.CSVReader;
import org.example.csv.CSVWriter;
import org.example.entity.Abalone;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class AbaloneApplication {

    public static void main(String[] args) throws IOException {
        // Прочитать данные в List
        CSVReader csvReader = new CSVReader("dataset/abalone.data");
        List<Abalone> abaloneList = csvReader.getAbaloneList();

        // Сгруппировать данные по количеству колец (возрасту) и найти экземпляры с минимальным диаметром
        // Java Stream API
        List<Abalone> minDiameterGroupByRings =
                abaloneList.stream()
                        .collect(Collectors.groupingBy(Abalone::getRings,
                                Collectors.minBy(Comparator.comparing(Abalone::getDiameter))))
                        .values()
                        .stream()
                        .map(Optional::get)
                        .collect(Collectors.toList());

        // Записать полученные данные в файл
        CSVWriter csvWriter = new CSVWriter("dataset/abalone_filtered.data");
        csvWriter.writeAbaloneList(minDiameterGroupByRings);
    }
}
