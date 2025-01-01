//Write a program to find the largest and smallest elements in an array.

package jan;

import java.util.Arrays;
import java.util.Scanner;

public class LargeSmall {
//	public static int[] returnLS(int arr[]) {
//		for(int i=0 ; i<arr.length ; i++) {
//			for(int j=i+1 ; j<arr.length ; j++) {
//				if(arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return new int[] {arr[0], arr[arr.length-1]};
//	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int in=0 ; in<n ; in++) {
			System.out.print("Enter array element at "+(in+1)+" location: ");
			arr[in]=sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Largest element in array = "+arr[arr.length-1]+"Smallest element in array = "+arr[0]);
		
//		System.out.println(Arrays.toString(arr));
	}
}
