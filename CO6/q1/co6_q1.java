import java.io.File;
import java.util.*;
public class co6_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("C:\\Users\\intruder\\Desktop\\New folder (2)");

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println(pathname);
        }
        String[] fileList = f.list();
        int flag=0;
		for(int i=0; i < fileList.length; i++)
		{
			String filename  = fileList[i];
			if(filename.equalsIgnoreCase("HBase.pptx"))
			{
				System.out.println("\n\n" +filename + " found");
                flag=1;
			}
		}
		if(flag == 0) 
		{
            System.out.println("\n\nFile Not Found");
        }
        
    }


}
