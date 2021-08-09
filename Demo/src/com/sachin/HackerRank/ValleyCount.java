package com.sachin.HackerRank;

import java.util.Scanner;

public class ValleyCount {

	public static void main(String[] args)
	{
		int c=0, res=0;
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String path = sc.next();
		char[] steps = new char[n];
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			steps[i]=path.charAt(i);
			if(steps[i]=='D')
				c--;
			else
				c++;
			arr[i]=c;
		}
		for(int i=1;i<n;i++)
		{
			if(arr[i]==0)
			{
				if(arr[i-1]<0)
					res=res+1;
				else
					continue;
			}
			else
				continue;
		}
		System.out.print(res);
		sc.close();
	}
	
	
}
