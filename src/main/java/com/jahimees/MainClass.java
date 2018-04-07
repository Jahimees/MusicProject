package main.java.com.jahimees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
	
	public static void main(String[] args) {
        try (BufferedReader r1 = new BufferedReader(new FileReader("D:\\Текстовые\\Учеба Олег\\JAVA PROJECTS\\MusicProject\\input.txt")))
        {
		
    	    String s;
			while ((s=r1.readLine())!=null) {
				
				System.out.println(s);
			}
			
        }    
	    catch (IOException e1) {
		e1.printStackTrace();
	  }
	
   }
}

