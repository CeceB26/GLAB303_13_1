package GLAB303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ScanDelimiterdFile {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            // Change this path to where your cars.csv file is saved
            String location = "src/GLAB303_13_1/cars.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);

            ArrayList<String[]> data = new ArrayList<String[]>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");
                data.add(splitedLine);
            }

            input.close();

            for (String[] line : data) {
                System.out.println("Car Name :" + line[0]);
                System.out.println("MPG :" + line[1]);
                System.out.println("Cylinder :" + line[2]);
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}