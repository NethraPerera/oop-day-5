import java.util.*;
import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{
		String name="Niroth Lakmal";
		FileWriter fw=new FileWriter("Student.txt",true);
		fw.write(name+"\n");
		fw.flush(); //or fw.close()
	}
}
