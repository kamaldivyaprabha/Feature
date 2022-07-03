package com.anagram;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "kamal";
	    String s2 = "vyadi";
	    int flag = 0;
	    
	    char [] ch =s1.toCharArray();
	    char [] ch1 =s2.toCharArray();
	    
	    for(int i = 0;i<s1.length();i++)
	    {
	    	for(int j = 0;j<s2.length();j++)
	    	{
	    		if(ch[i]==ch1[j])
	    		{
	    			flag = flag +1;
	    		}
	    	}
	    }
	    
	    if(flag==1)
	    {
	    	System.out.println("it is a anagram");
	    }
	    else
	    {
	    	System.out.println("not an anagram");
	    }
	    
		
	}

}
