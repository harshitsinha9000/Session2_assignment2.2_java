package java_session2;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int lines;
		Scanner sc;
		int res;
		do{
			System.out.println("Enter the no of line(only odd values)");
			sc= new Scanner(System.in);
			lines = sc.nextInt();
			res= lines % 2; 
		}while(res == 0);
			
		
	}

}
