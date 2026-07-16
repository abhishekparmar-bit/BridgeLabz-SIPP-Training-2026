import java.io.FileWriter;
import java.io.IOException;
public class fw {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("output.txt");  // opens/creates file
            fw.write("Hello, Java I/O!\n");
            fw.write("Another line.\n");
            fw.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}