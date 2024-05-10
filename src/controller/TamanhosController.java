package controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class TamanhosController {

	public void readDir(String path) throws IOException {
        File dir = new File(path);
        File[] files = dir.listFiles();
        Arrays.sort(files, Comparator.comparingLong(File::length));

        for (File file : files) {
            double tamanhoMB = (double) file.length() / (1024 * 1024); // Convertendo para MB
            System.out.println(file.getName() + ": " + String.format("%.2f", tamanhoMB) + " MB");
        }
    }
}
