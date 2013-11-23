import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World!");
		int myInt = scan.nextInt();
		System.out.println(myInt);
		Tasks.task1();
		scan.close();
	}

}