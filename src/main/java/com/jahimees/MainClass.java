package main.java.com.jahimees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class MainClass {
	static StringArray p[];
	int c[];
	char cs;
	static int m;
	static int j=0;
	static int r=0;
	static int x; //Параметр
	

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
        System.out.println("Как Вы хотите отсортировать: по популярности (1) или по цене (2)?");
        
        
        
        
                MusicList[] music = new MusicList[19]; //массив объектов
        
                for (int i=0; i<19; i++){    //Заполняет массив объектов и дает им код
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
            
            	subStr = new String[15];
            	for (int i=0; i<19; i++) {
            		music[i].setSplitter();
            	}
            	
            	music[5].getSplitter(); // Проверка
            	
            	//ДАЛЕЕ
            	//пользователь вводит 1 (по цене) или 2 (по популярности)
              Scanner in = new Scanner(System.in);
              x=in.nextInt();
              
                    
              for (int i=0; i<18; i++) {
            	  music[i].sort(x, i);
              }
              for (int i=0; i<18; i++) {
            	  music[MusicList.sortn[i]].getSplitter();
              } 
              }
              
   
        

}

	


