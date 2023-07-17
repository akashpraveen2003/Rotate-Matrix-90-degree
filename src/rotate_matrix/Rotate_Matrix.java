package rotate_matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
    You are given a n x n 2D matrix A representing an image.
	Rotate the image by 90 degrees (clockwise).

 	You aren't allowed to create an additional array
 */

public class Rotate_Matrix {
	
	private static void display_array(int[][] array) {		// Printing the array
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	private static void rotate_row_wise(int[][] array) {
		
		for(int k=0;k<array.length;k++)			// swapping the elements by row wise
		{
			int i=0;
			int j=array.length-1;
			while(i<j)
			{
				int temp=array[k][i];
				array[k][i]=array[k][j];
				array[k][j]=temp;
				i++;
				j--;
			}
		}
		
		display_array(array);	
	}
	private static void rotate_clockwise(int[][] array) {
		
		
		int j=0;
		for(int i=0;i<array.length;i++)			// transpose till j<i, swapping the elements below the diagonal with upper one
		{
			j=0;
			while(j<i)
			{
			int temp=array[i][j];
			array[i][j]=array[j][i];
			array[j][i]=temp;
			j++;
			}		
		}	
		rotate_row_wise(array);
		
	}
	
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		rotate_clockwise(array);
	}
}
/*
  	Input
	[
    [1, 2],
    [3, 4]
 	]

	Output
	[
    [3, 1],
    [4, 2]
 	]
 	
	Input
	[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 	]

	Output
	[
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
 	]
 */
