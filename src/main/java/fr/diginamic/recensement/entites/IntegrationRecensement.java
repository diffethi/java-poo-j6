package fr.diginamic.recensement.entites;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IntegrationRecensement {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/FUJITSU User/Downloads/recensement_population.csv");
        boolean readable = Files.isReadable(path);
    }
}
