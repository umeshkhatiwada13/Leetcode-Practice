
// Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;

class FileWrite {
    public static void main(String[] args) {

        try {
            //Define the file location
            FileWriter myWriter = new FileWriter("C:\\Users\\Umesh\\Desktop\\output.txt");
            //write data to the file
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            //close the file
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); //Prints the error message (optional)
        }
    }
}
