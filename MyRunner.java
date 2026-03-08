package GLAB303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            // Change this path to where your CourseData.csv file is saved
            String location = "src/GLAB303_13_1/CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);

            ArrayList<course> data = new ArrayList<course>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");

                course cObj = new course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourse_name(splitedLine[1]);
                cObj.setInstructor_name(splitedLine[2]);

                data.add(cObj);
            }

            input.close();

            for (course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourse_name() + "|" + c.getInstructor_name());
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}