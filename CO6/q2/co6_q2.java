import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class co6_q2 {
	public static void main(String[] args){
		try {
            FileWriter writer = new FileWriter("C:\\Users\\intruder\\Desktop\\java.txt", true);
            writer.write("Doc\n");
            writer.write("pdf\n");  
            writer.write("ppt\n");
            writer.close();
            FileReader reader = new FileReader("C:\\Users\\intruder\\Desktop\\java.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
            System.out.println("File reading and writing both done\n");
            
	} catch (IOException e) {
		System.out.println("Error reading file named java.txt");
        }
 
    }
}