package 二下期中後;

import java.io.*;
   public class Data_handing {
	   public static void main(String[] args) { 
		   FileReader fr = null;
		try {
			fr = new FileReader("D:\\data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //透過filereder去設定新。完整路徑需要打在這裡，不能像R一樣在console區設定
		   		BufferedReader br=new BufferedReader(fr);//設定新的fr為br
		   String line;
		   try {
			while ((line=br.readLine()) != null) {//設定line字串變數，如果已經讀的到東西就不等於null，所以迴圈會一直跑跑到直到讀不到東西
				   System.out.println(line);
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
  