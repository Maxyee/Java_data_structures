package data.structure.properties;

import java.util.*;

public class PropertiesConcept {
	public static void main(String args[])
	{
		Properties capitals = new Properties();
		Set states;
		String str;
		
		capitals.put("Bangladesh", "Dhaka");
		capitals.put("India", "Delhi");
		capitals.put("Netherland", "Armstadarm");
		capitals.put("Japan", "Tokeyo");
		capitals.put("Saudi Arabia", "Zedda");
		
		states = capitals.keySet();
		Iterator itr = states.iterator();
		
		while(itr.hasNext())
		{
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is " +
			capitals.getProperty(str) + ".");
		}
		System.out.println();
		
		str = capitals.getProperty("Florida","Not Found");
		System.out.println("The capital of Florida is " + str + " . ");
	}
}
