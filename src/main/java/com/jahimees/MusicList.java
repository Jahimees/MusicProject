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
	static int[] sort = new int[18];
	public static int[] sortn = new int[18];
	static int j=0;
	
	public void WriteMusician() {
	
		  System.out.println(lines); //выводит линию
	 }    
	    
	
	public void setSplitter() {
		String delimiter = "/";
		String subStr[];
	    subStr = new String[116];
	    try {          
	           subStr = lines.split(delimiter);  //Массив строк. В каждую строку записываются
	                                             //Исполнитель, имя песни, количество прослушиваний, цена	
	           
	           singer=subStr[0];   //экземплярам объекта присваиваются соответствующие строки из массива.
	           song=subStr[1];
	           listen=subStr[2];
	           count=subStr[3];
	    }
	    
	    catch(ArrayIndexOutOfBoundsException e){} //Кроме "ххахахахах" эмоций нет
	    catch(NullPointerException e) {}
    }
	
	
	public void getSplitter() {
		System.out.print(singer + " ");
		System.out.print(song +" ");
		System.out.print(listen + " ");
		System.out.print(count + " ");
		System.out.println();
	}
	
	public void getSplitter(int[] mas) {
		for (int i=0; i<18; i++) {
		System.out.print(singer + " ");
		System.out.print(song +" ");
		System.out.print(listen + " ");
		System.out.print(count + " ");
		System.out.println();
		}
	}
	
	
	public void sort(int x, int inp) {
		int l=0;
		while (sort[17]!=-1) {
			sort[l]=-1;
			sortn[l]=-1;
			l++;
		}		
		switch (x) {
		case 1: 
			sort[inp] = Integer.valueOf(listen); // записываем в отдельный массив количество прослушиваний
			sortn[inp]=inp;
			
//			System.out.println(sortn[3]);
			break;
		
		case 2:
			sort[inp] = Integer.valueOf(count);
			sortn[inp]=inp;
			break;
		}
        //System.out.println(sort[3]);
		
		if (sort[17]>-1) { //если последний элемент присутствует (если заполнен весь массив)
		    for(int i = sort.length-1 ; i > 0 ; i--){
		        for(int j = 0 ; j < i ; j++){
		           // System.out.println(sort[j]);
		            /*Сравниваем элементы попарно, 
		              если они имеют неправильный порядок, 
		              то меняем местами*/

		            if( sort[j] < sort[j+1] ){
		                int tmp = sort[j];
		                sort[j] = sort[j+1];
		                sort[j+1] = tmp;
		               
		                int tmpn = sortn[j];
		                sortn[j]=sortn[j+1];
		                sortn[j+1]=tmpn;
		              
		            }
		
		        }
		    }
			for (int i=0; i<18; i++) { //Не работает....
			
	    	}
	
		    }
		}
		
		
		
	}
	
	
