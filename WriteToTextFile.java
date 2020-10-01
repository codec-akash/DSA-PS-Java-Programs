import java.io.FileWriter;
import java.io.IOException;
 

public class WriteToTextFile {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt", true);
            writer.write("Writing to a text file in Java");
            writer.write("\r\n");   // write new line
            writer.write("See you! Bye");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}