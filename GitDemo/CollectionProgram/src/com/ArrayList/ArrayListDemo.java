package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String>  list =new ArrayList<String>();
    list.add("Renu");
    list.add("Sirsat");
    list.add("Renuka");
    list.add("Renu");
    list.add("Sirsat");
     
    Iterator itr=list.iterator();
    System.out.println("Using while loop");
    while(itr.hasNext())
    { 
    	System.out.println(itr.next()); 
    }
    
    System.out.println("Using For loop ");
    for(String itr1: list)
    {
        System.out.println(itr1);
    }
	
	 
	 
    
	}

}
