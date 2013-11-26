package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\fshah\\Desktop\\TS.txt"));
	    try {
	       // StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        
	        boolean flag = false;;
	        Integer lines = Integer.parseInt(line);
	        for(int i = 0; i<lines; i++){
	        	line = br.readLine();
	        	System.out.println(line);
	        	int fOcc = line.indexOf("#");
	        	//System.out.println(line.indexOf("#"));
	        	if(fOcc>0){
	        		char c[] = line.toCharArray();
	        		int occCount = 1;
	        		String check = "#";
	        		for(int j=fOcc+1;j<line.length();j++){
	        			if('#' == c[j]){
	        				occCount++;
	        				check += "#";
	        			}
	        		}
	        		
	        		if(occCount > 1){
	        			flag = true;
	        			for(int k=i+1;k<lines && k < i+occCount;k++){
	        				line = br.readLine();
	        				System.out.println(line);
	        				String j = line.substring(fOcc,fOcc + occCount);
	        				if(!j.equals(check))
	        					flag = false;
	        			}
	        			break;
	        		}
	        	}
	        	
	        }
	        
	        if(flag)
	        	System.out.println("Square");
	        else
	        	System.out.println("Not Square");
	    } finally {
	        br.close();
	    }
	}
}
