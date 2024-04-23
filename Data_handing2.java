package 二下期中後;

import java.io.*;
   public class Data_handing2 {
	   public static void main(String[] args) { 
		   FileReader fr=new FileReader("data.txt");  //trycatch
		   		BufferedReader br=new BufferedReader(fr);//intilizical variable
		   String line;
		   while ((line=br.readLine()) != null) {  //trycatch
			   System.out.println(line);
			   }
		   }
	   }
