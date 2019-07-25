package com.ford.pfs.sample;

import java.util.Scanner;

public class DAY_OF_WEEK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");	
		Scanner S1 = new Scanner(System.in);
		int i = S1.nextInt();
		if (i < 8)
		{
	switch (i)
	{
	case 1:
		System.out.println("Monday");	
		break;
	case 2:
		System.out.println("Tuesday");	
		break;
	case 3:
		System.out.println("Wednesday");	
		break;
	case 4:
		System.out.println("Thursday");	
		break;
	case 5:
		System.out.println("Friday");	
		break;
	case 6:
		System.out.println("Staurday");	
		break;
	case 7:
		System.out.println("Sunday");	
		break;
		
		}
		}
		else {
			System.out.println("Number not in range");
		}
			}
	}


