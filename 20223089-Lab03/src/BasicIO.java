import java.util.*;

// An exploration of basic input and output.
class BasicIO {	
	// Reads and processes string input. 
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		// get first input
		System.out.print("Enter your name:"); 
		String name = stdin.next();
		
		// display output on console
		System.out.println("your name is " + name);
		
		System.out.print("Enter your age");
		int years = stdin.nextInt();
		
		System.out.println("your age is " + years);
		
		System.out.println("day is " + (years * 365));
		
		System.out.print("Enter your height");
		int height = stdin.nextInt();
		
		System.out.println("your height is " + height);
		
		System.out.println("2005년 09월 06일 현재 " + name + "("+ years +")" + "의 키는 " 
		+ height + "cm 입니다." );
		
	} // method main
	
} // class BASIC_IO
