import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
           /* //Define the file location
            File myObj = new File("C:\\Users\\Umesh\\Desktop\\output.txt");
            //Scanner to read data from file
            Scanner myReader = new Scanner(myObj);
            //Loop through the file until it has text
            while (myReader.hasNextLine()) {
                //myReader.nextLine() gives text at each individual line
                String data = myReader.nextLine();
                System.out.println(data);
            }
            //close the scanner
            myReader.close();*/

            //Define the file location
            FileReader fileReader = new FileReader("C:\\Users\\Umesh\\Desktop\\output.txt");
            //Scanner to read data from file
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String s = bufferedReader.readLine();

            System.out.println("String " + s);
//            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); //Prints the error message (optional)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
