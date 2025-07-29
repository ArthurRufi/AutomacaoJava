package org.example.service;

import java.io.IOException;
import java.nio.file.*;
import java.util.Optional;
import java.util.stream.Stream;

public class SelectAllFilesTypes {
    private String tipo;

    public SelectAllFilesTypes(String tipo) {
        this.tipo = tipo.startsWith(".") ? tipo.toLowerCase() : "." + tipo.toLowerCase();
    }

    public void listFiles(Optional<String> optionalPath) {
        if (optionalPath.isEmpty()) {
            System.out.println("Diretório não encontrado.");
            return;
        }

        String caminho = optionalPath.get();
        System.out.println("Diretório válido: " + caminho);

        try (Stream<Path> stream = Files.walk(Paths.get(caminho))) {
            stream
                    .filter(Files::isRegularFile)
                    .filter(file -> file.toString().toLowerCase().endsWith(tipo))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
