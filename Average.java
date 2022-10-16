package Assigement2;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ArraySize :");
		int Arraysize = sc.nextInt();
		int a= 0;
		System.out.println("Enter the value to get Average : ");
		for(int i=0;i<Arraysize;i++) {
		 a += sc.nextInt();	
		}
		System.out.println("Average: "+ a/Arraysize);
	}

}
