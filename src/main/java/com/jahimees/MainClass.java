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
	static int x; //��������
	

	public static void main(String[] args) {
        String[] subStr;
		String delimiter = "/";
		
		
                 try (BufferedReader r1 = new BufferedReader(new FileReader("D:\\���������\\����� ����\\JAVA PROJECTS\\MusicProject\\input.txt")))
                 {
		             	String s;
			
		              	while ((s=r1.readLine())!=null){ //��������� ��������� �� ����� � �������
			            	  System.out.println(s);
			            }
			
                 }    
	             catch (IOException e1) {
	             e1.printStackTrace();
	             }
                 
                 
                 
        System.out.println();
        System.out.println("��� �� ������ �������������: �� ������������ (1) ��� �� ���� (2)?");
        
        
        
        
                MusicList[] music = new MusicList[19]; //������ ��������
        
                for (int i=0; i<19; i++){    //��������� ������ �������� � ���� �� ���
                     music[i] = new MusicList();
                     music[i].code=i;
                }
                
                try (BufferedReader r1 = new BufferedReader(new FileReader("D:\\���������\\����� ����\\JAVA PROJECTS\\MusicProject\\input.txt"))) 
                {
                 	int i=0;
                 	String text;
                    while ((text = r1.readLine())!=null){ //��������� ��������� �� ����� � ���������� � ������
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
            	
            	music[5].getSplitter(); // ��������
            	
            	//�����
            	//������������ ������ 1 (�� ����) ��� 2 (�� ������������)
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

	


