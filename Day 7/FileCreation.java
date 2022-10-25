import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;
import java.util.Scanner;

/**
 * FileCreation
 */
public class FileCreation {

    public static void main(String[] args) {
        File fileCreator = new File("data.txt");
        try {
            if (fileCreator.createNewFile()) {
                System.out.println("File Created Successfully..");
            } else {
                System.out.println("File Already Exists...");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getStackTrace());
        }

        // Getting file information]
        File fileReader = new File("data.txt");
        System.out.println("File location: " + fileReader.getAbsolutePath());
        System.out.println("Name of the File : " + (fileReader.getName()));
        System.out.println("Length of the File : " + fileReader.length());
        System.out.println("Can I read file : " + fileReader.canRead());
        System.out.println("Can I Write file : " + fileReader.canWrite());
        // if (fileReader.canRead() == true) {
        // System.out.println("Can I read File : Yes");
        // } else {
        // System.out.println("Can I read File : No");
        // }
        System.out.println("Path : " + fileReader.getPath());

        /// writing to file
        try {
            FileWriter fileWriter = new FileWriter("data.txt");
            Scanner input = new Scanner(System.in);
            String nameOfVisitors = input.nextLine();
            nameOfVisitors = nameOfVisitors.toUpperCase();
            java.util.Date today = new java.util.Date();

            fileWriter.write("|***** Date ***** | ***** Name ****** | \n");
            fileWriter.append("| " + today.toString() + " | " + nameOfVisitors + " |\n");
            fileWriter.append("----------------------------------");
            fileWriter.close();
            System.out.println("Successfully writed in file");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    
    
    }

}