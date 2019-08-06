package com.ford.pfs.sample;

public class print_snake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a1 = new int[][]{{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

for(int i=0;i<=3;i++)
{
	if (i%2 == 0)
	{
	for(int k=0;k<=3;k++)
	{
	System.out.print(a1[i][k]+ " ");
	}
	System.out.println();
	}
	else
	{
		for(int k=3;k>=0;k--)
		{
		System.out.print(a1[i][k]+ " ");
		}
		System.out.println();
	}
}
}
}
