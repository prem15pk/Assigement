package Assigement2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class smallestNumber {


	
		
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of Elements you  want to Strogr: ");
		int n= sc.nextInt();
		
		int [] arr =new int[10];
		System.out.println("Enter the Elements of the array: ");
		
		for(int i = 0; i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
	      
		int mini;
		int max =mini= arr[0];
		for(int i=1;i<n;i++) {
			/*if(arr[i]>max) {
				max=arr[i];
			}*/
				
				
			
		
			if(arr[i]<mini) {
				mini=arr[i];
			}
			
		}
		//System.out.println("maximum Value = "+ max);
			
		System.out.println("minimum Value =" + mini);
	
	}
}
		
	

	


