package Assigement2;
import java.util.*;
public class AreaOfTriangle {
	
	
	public AreaOfTriangle(int nextInt, int nextInt2) {
		// TODO Auto-generated constructor stub
	}

	public AreaOfTriangle() {
		// TODO Auto-generated constructor stub
	}

	void Area(int Hight,int Base){
		
		System.out.println("Area  : " +(Hight*Base)/2 );
		
	}
	

	public static void main(String[] args, Object ATO) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		AreaOfTriangle AOT = new AreaOfTriangle();
		
		AOT.Area(sc.nextInt(), sc.nextInt());

		
	}

}
