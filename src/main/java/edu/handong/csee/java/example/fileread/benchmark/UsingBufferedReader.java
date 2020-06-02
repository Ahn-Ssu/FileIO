package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
    	
    	ArrayList<String> fileName = new ArrayList<String>();
    	for(String file:args) {
    		fileName.add(file);
    	}
    	
        //-------------- Test reading 1 MB file. --------------------

        StopWatch.start();

        try {
        	 BufferedReader inputStream= new BufferedReader(new FileReader(fileName.get(0)));
             while (inputStream.read()!=-1){}

             long duration = StopWatch.stop();
             System.out.println(duration + " milsec");
             
             inputStream.close();
        }catch(Exception e) {
        	System.out.println("Error : Plz, first file name");
        	System.exit(0);
        	
        }
       

        
        //-------------- Test reading 10 MB file. --------------------

        StopWatch.start();

        try {
        	BufferedReader inputStream2= new BufferedReader(new FileReader(fileName.get(1)));
            while (inputStream2.read()!=-1){}

            long duration2 = StopWatch.stop();
            System.out.println(duration2 + " milsec");

            inputStream2.close();
        }catch(Exception e) {
        	System.out.println("Error : Plz, Enter second file name");
        	System.exit(0);
        	
        }
        
        
        /*
        //-------------- Test reading 100 MB file. --------------------

        StopWatch.start();

        BufferedReader inputStream3= new BufferedReader(new FileReader(DumpDataWriter.input100MB));
        while (inputStream3.read()!=-1){}

        long duration3 = StopWatch.stop();
        System.out.println(duration3 + " milsec");
        
        inputStream3.close();


        //-------------- Test reading 1000 MB file. --------------------


        StopWatch.start();

        BufferedReader inputStream4= new BufferedReader(new FileReader(DumpDataWriter.input1000MB));
        while (inputStream4.read()!=-1){}

        long duration4 = StopWatch.stop();
        System.out.println(duration4 + " milsec");
        
        inputStream4.close();
        */
    }
}
