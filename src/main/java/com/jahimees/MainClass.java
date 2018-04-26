package main.java.com.jahimees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class MainClass {
	static StringArray p[];
	int c[];
	char cs;
	static int m;
	static int j=0;
	static int r=0;
	
//    static char[] m;
	public static void main(String[] args) {
        String[] subStr;
		String delimiter = "/";
		
		
                 try (BufferedReader r1 = new BufferedReader(new FileReader("D:\\Текстовые\\Учеба Олег\\JAVA PROJECTS\\MusicProject\\input.txt")))
                 {
		             	String s;
			
		              	while ((s=r1.readLine())!=null){ //Построчно считывает из файла и выводит
			            	  System.out.println(s);
			            }
			
                 }    
	             catch (IOException e1) {
	             e1.printStackTrace();
	             }
                 
                 
                 
        System.out.println();
        System.out.println("Как Вы хотите отсортировать: по цене или по популярности?");
        
        
        
        
                MusicList[] music = new MusicList[25]; //массив объектов
        
                for (int i=0; i<25; i++){    //Заполняет массив объектов и дает им код
                     music[i] = new MusicList();
                     music[i].code=i;
                }
                
                try (BufferedReader r1 = new BufferedReader(new FileReader("D:\\Текстовые\\Учеба Олег\\JAVA PROJECTS\\MusicProject\\input.txt"))) 
                {
                 	int i=0;
                 	String text;
                    while ((text = r1.readLine())!=null){ //Построчно считывает из файла и записывает в массив
                    	 music[i].lines=text;
        	             i++;
        	        } 
                }
                 catch (IOException e1) {
      		     e1.printStackTrace();
      	         }
               // System.out.println(music[2].lines);
            	subStr = new String[15];
            	for (int i=0; i<25; i++) {
            		music[i].setSplitter();
            	}
            	music[1].getSplitter();
              
      // System.out.println(music[3].singer);
        //Проверка
     //   System.out.println(music[0].singer);
        

}

	
}

