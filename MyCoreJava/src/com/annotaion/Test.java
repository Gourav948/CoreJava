package com.annotaion;

class Test
{
	public static void main(String[] args) 
	{

		StringBuffer a=new StringBuffer((args[0].toLowerCase()));
		int c=0;
		for (int i=0;i<a.length();i++)
		{
            char b=a.charAt(i);
            c=1;
            for (int j=i+1;j<a.length()-1 ;j++ ) 
            {
            	if (b!=' ')
            	{
            		if(b==a.charAt(j))
            		{
            			c++;
            			a.replace(j,j+1," ");
            		}
            	}
            	
            }
            if (b!=' ')
            System.out.println(b+"="+c);
		}
	}
}