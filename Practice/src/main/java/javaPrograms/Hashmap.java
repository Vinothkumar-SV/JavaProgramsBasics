package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
	    public static void main(String[] args)
	    {
	        String [] S = new String []{ "vinoth","kumar","vinothkumar","raja","shanmugam","vinoth","vinoth","shanmugam","jack"};

	        //countMap holds the count details of each element
	        Map<String, Integer> countMap = new HashMap<String, Integer>();
	        for (int i = 0; i < S.length; i++)
	        {
	            String  key = S[i];
	            if (countMap.containsKey(key))
	            {
	                int count = countMap.get(key)+1;
	                countMap.put(key, count);
	            } else
	            {
	                countMap.put(key, 1);
	            }
	        }
	        
	        //Printing the Element and its occurrence in the array
	        for(Entry<String, Integer> val : countMap.entrySet())
	        {
	            System.out.println(val.getKey() + " :" + val.getValue());
	        }
	    }
	}


