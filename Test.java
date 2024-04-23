package 二下期中後;

import java.io.*;
import java.util.ArrayList;
public class Test{
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		BufferedReader br= new BufferedReader(fr);
		String line,tempstring;
		String[] tempArray= new String[3];//三格陣列，符合傳統的陣列撰寫模式
       //傳統陣列:int [] array= new int [3];
		ArrayList myList= new ArrayList();
		int i=0;
	
		try {
			while((line = br.readLine())!=null){
				tempstring= line; 
				tempArray= tempstring.split("\\s");
				for(i=0;i< tempArray.length;i++){          
					myList.add(tempArray[i]);
					}
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k = myList.size()/3;
		int count=0;
		double[][] trans_array= new double[k][3];
		for(int x=0;x<myList.size()/3;x++){
			for(int y=0;y<3;y++){
				trans_array[x][y]=Double.parseDouble((String) myList.get(count));//按照順序把特定的資料強制傳換成小數的型態塞進應有的位子
				count++;//撈取下一個資料及重複進行上一行的動作
				}
			}
	    for(int x=0;x<k;x++) {
	    	for(int y=0;y<3;y++) {
	    	System.out.print(trans_array[x][y]+"  ");    	
	        }
	        System.out.println();
	
	}
  }
}