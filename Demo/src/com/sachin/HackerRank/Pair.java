package com.sachin.HackerRank;

import java.util.Arrays;
import java.util.Scanner;
//Commit
public class Pair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		nOP p= new nOP();
		p.numberofPair(arr);
		
	sc.close();	
	
	}
}
	
class nOP
	{
		public void numberofPair(int[] arr)
		{
			int res=0;
			for(int i=0; i<arr.length;i++)
			{ 
				int count=1;
				for(int j=i+1; j<arr.length;j++)
				{
					if(arr[i]==arr[j])
						count++;
					else
						break;
				}
				if(count>1)
				{
					i=i+count-1;
					res=res+count/2;
					
				}
				
			}
		
			System.out.println(res);
		}
}		

