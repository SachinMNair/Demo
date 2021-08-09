package com.sachin.HackerRank;

import java.util.Scanner;

public class StringNumber {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long l = sc.nextLong();
		if(str.length()==1 && str.charAt(0)=='a')
		{
			System.out.println(l);
		}
		else if(str.length()==1 && str.charAt(0)!='a')
		{	
			int count=0;
			System.out.println(count);
		}
		else
		{		
		int count=0;
		for(int i=0;i<str.length();i++)	
		{
			if(str.charAt(i)=='a')
				count++;
			else
				continue;
		}
		int f1=count;
		int f2=str.length();
		long c=0;
		if(l%f2==0)
		{
			c=(f1*l/f2);	
		}
		else
		{
		c = f1*(l-(l%f2))/f2;
		for(int i=0;i<l%f2;i++)
		{
			if(str.charAt(i)=='a')
				c++;
			else
				continue;
		}
		}
		System.out.println(c);
		}
		sc.close();
	}
}
