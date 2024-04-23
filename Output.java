package 二下期中後;

import java.io.*;

public class Output {

	public static void main(String[] args) {
		
	FileReader fr = null;
	try {
		fr = new FileReader("in.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BufferedReader br=new BufferedReader(fr);      
	FileWriter fw = null;
	try {
		fw = new FileWriter("out.txt", true);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BufferedWriter bw= new BufferedWriter(fw); //將BufferedWeiter與FileWrite物件做連結
	String line;
	try {
		while ((line=br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
	
	
	
	


