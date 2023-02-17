package pack1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FristProject {

public static void main(String[] args)throws IOException {
		
		System.out.println(" COMPANY NAME :  LOCKER PVT LTD");
		System.out.println(" DEVELOPER NAME : SURAJ DUBEY");
		System.out.println(" COMPANY WEBSITE LINK :LOCKEDME.COM");
		System.out.println("..................................");
		System.out.println();
		int x;
		do {
		System.out.println("SELECT AN OPTION");
		System.out.println("1.DISPLAY FILE");
		System.out.println("2.OPERATION");
		System.out.println("3.CLOSE THE APPLICATION");
		Scanner sc = new Scanner(System.in);
	   	System.out.println("ENTER HERE TO SELECT THE OPTION:- ");
	    x=sc.nextInt();
		
	         switch (x) {
	case 1:
		     System.out.println("AVAILABLE FILES");
		     System.out.println();
		     File  f = new File ("F:\\developer");
		     String sd[] =f.list();
		     ArrayList<String>al=new ArrayList<String>(Arrays.asList(sd));
		     Collections.sort(al);
		     for (String sde:sd) {
		     System.out.println(sde);
             }
		     break;
		
	case 2:
	         String y;
	         do {
			 System.out.println(".................");
			 System.out.println("SELECT AN OPTION");
			 System.out.println();
			 System.out.println("a.ADD A NEW FILE ");
			 System.out.println("b.DELETE A FILE");
			 System.out.println("c.SEARCH A FILE ");
			 System.out.println("d.EXIT");
			 y=sc.next();
			 
             switch(y) {
             case "a":
			 System.out.println("ENTER FILE NAME TO ADD");
		     String fname =sc.next();
		     File f2=new File("F:\\\\developer\\"+fname);
		     f2.createNewFile();
			 System.out.println();
		     if(f2.exists()) {
			 System.out.println("FILE CREATED SUCCESSFULLY");
		     }else {
			 System.out.println("INVALID INPUT");
			 }
		      break;
             case "b":
			 System.out.println("ENTER FILE NAME TO DELETE");
			 String fnameD =sc.next();
			 File f5 =new File ("F:\\developer\\");
			 boolean b=false;
			 for(String str:f5.list()){
			 if(str.equalsIgnoreCase(fnameD)) {
			 File f4 =new File("F:\\developer\\"+fnameD);
			 System.out.println();
			 f4.delete();
			 System.out.println(" FILE  DELETED ");
			 b=true;
			 }
			 }
		     if (b==false)
		     System.out.println(" FILE NOT FOUND");
		     break;
		         
             case "c":  
	         System.out.println("ENTER FILE NAME TO SEARCH");
	         String fnameS=sc.next();
	         File f6=new File("F:\\developer\\");
	         boolean b1=false;
	         for(String st:f6.list()) {
             if (st.equalsIgnoreCase(fnameS)) {
    	     System.out.println();
    	     System.out.println("FILE EXISTS");
    	     b1=true;
             }
	         }
	         if(b1==false)
	         System.out.println("FILE NOT EXISTS");
	         break;
             case "d":
	         break;
	         //go to main menu
             }
             } while(!y.equals("d"));
             break; 
  case 3:
		     System.out.println("THANKYOU FOR USING THE APPLICATION");
		     break;
	         }
		     }while(x==1||x==2);
	         }
             }
		 
	                              	         
		         
		         
			     
	
	
	   