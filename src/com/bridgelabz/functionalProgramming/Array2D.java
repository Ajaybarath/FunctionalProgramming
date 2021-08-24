package com.bridgelabz.functionalProgramming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Array2D {
	
	public static void main(String args[]) throws IOException {

		int m,n = 0;
		
		Scanner s = new Scanner(System.in);
		
		m = s.nextInt();
		n = s.nextInt();
		
		int array[][] = new int[m][n];
		
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				array[i][j] = s.nextInt();
			}
		}
		
		
		try {
			
//			OutputStream outputStream = new FileOutputStream("D:\\Workspace\\JavaPractice\\GamblersGame\\output.txt");  
//            Writer outputStreamWriter = new OutputStreamWriter(outputStream); 
//            
            PrintWriter printWriter = new PrintWriter(System.out);
            
            FileOutputStream file = new FileOutputStream("D:\\Workspace\\JavaPractice\\GamblersGame\\output.txt");

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(file);
            
            for (int i=0;i<m;i++) {
    			for (int j=0;j<n;j++) {
    				printWriter.write(" "+array[i][j]);
    				outputStreamWriter.write(" "+array[i][j]);
    			}
    			outputStreamWriter.write("\n");
    			printWriter.write("\n");
    		}
            
    		outputStreamWriter.close();

    		printWriter.close();
            
            
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
		
		
	}

}
