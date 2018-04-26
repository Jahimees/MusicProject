package main.java.com.jahimees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MusicList {
	String lines;
	String song;
	String singer;
	String listen;
	String count;
	int code;
	int j=0;
	
	public void WriteMusician() {
	
		  System.out.println(lines); //выводит линию
	 }    
	    
	
	public void setSplitter() {
		String delimiter = "/";
		String subStr[];
	    subStr = new String[116];
	    try {          
	           subStr = lines.split(delimiter);  
	        
	           singer=subStr[0];
	           song=subStr[1];
	           listen=subStr[2];
	           count=subStr[3];
	           // System.out.println(subStr[2]);
	          }
	    catch(ArrayIndexOutOfBoundsException e){}
	    catch(NullPointerException e) {}
    }
	
	public void getSplitter() {
		System.out.println(singer);
		System.out.println(song);
		System.out.println(listen);
		System.out.println(count);
		
	}
	
	
}