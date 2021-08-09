package com.sachin.HackerRank;

import java.util.Scanner;

public class CloudJump {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			if(arr[i+1]==0)
			{
				if(i+2<n)
				{
				if(arr[i+2]==0)
				{
					c++;
					i++;
				}
				else
					c++;
				
				}
				else
					c++;	
			}
			else 
			{
				if(arr[i+2]==0)
				{
					c++;
					i++;
				}
				else
					continue;
			}	
		}
		System.out.print(c);
		sc.close();
	}
}

