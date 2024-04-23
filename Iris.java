package 二下期中後;

import java.io.*;
import java.util.ArrayList;

public class Iris {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("iris.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Double[]> measuresList = new ArrayList<>();
        ArrayList<String> kindsList = new ArrayList<>();

        String line;
        try {
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                Double[] measures = new Double[4];
                for (int i = 0; i < 4; i++) {
                    measures[i] = Double.parseDouble(parts[i]);
                }
                measuresList.add(measures);
                kindsList.add(parts[4]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double[][] measure = new double[measuresList.size()][4];
        String[] kind = new String[kindsList.size()];
        for (int i = 0; i < measuresList.size(); i++) {
            Double[] measures = measuresList.get(i);
            for (int j = 0; j < 4; j++) {
                measure[i][j] = measures[j];
            }
            kind[i] = kindsList.get(i);
        }

        // Printing all data on screen
        System.out.println("All data:");
        for (int i = 0; i < measure.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(measure[i][j] + " ");
            }
            System.out.println(kind[i]);
        }

        // Calculating average values of each column of doubles
        double[] columnSums = new double[4];
        for (int i = 0; i < measure.length; i++) {
            for (int j = 0; j < 4; j++) {
                columnSums[j] += measure[i][j];
            }
        }
        System.out.println("Average values:");
        for (int i = 0; i < 4; i++) {
            double average = columnSums[i] / measure.length;
            System.out.println("Column " + (i + 1) + ": " + average);
        }
    }
}
