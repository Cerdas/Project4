import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("Programming Fundamentals");
		System.out.println("Name: Alexander Cerdas");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET" + "\n");

		Set test = new Set();
		String command = "";
		String[] input = null;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Enter command: ");
			command = scan.nextLine();
			input = command.split(" ");
			if (input.length == 2) {
				int num = Integer.parseInt(input[1]);
				if (input[0].equals("add")) {
					test.add(num);
					System.out.println(test.toString());
					input = null;
				} else if (input[0].equals("exists")) {
					System.out.println(test.exists(num));
					input = null;
				} else if (input[0].equals("del")) {
					test.del(num);
					System.out.println(test.toString());
					input = null;
				} else {
					System.out.println("Not a vaild command, try again");
				}
			} else {
				System.out.println("Not a vaild command, try again");
			}
			scan.close();
		}
	}
}
