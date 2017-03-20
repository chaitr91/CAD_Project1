package com.cad.ece;


import java.io.*;
public class CadMain {

	public static void main(String[] args) {
	String fileName = "C:/Users/chaitr/BasicsDataStructures/CAD_Project1/src/com/cad/ece/Example.txt";
	//	String fileName="Example.txt";
        try {
          
          FileReader fr=new FileReader(fileName);
          BufferedReader br=new BufferedReader(fr);
          String line = null;

          
          while((line = br.readLine()) != null) {
              System.out.println(line);
          }   

         
          
          br.close();
        	
           
        }
        catch(IOException ex) {
           
        }
    }
}

