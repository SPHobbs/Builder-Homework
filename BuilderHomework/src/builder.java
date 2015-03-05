import java.util.Scanner;
public class builder {
	public static void main(String[]args)
	{
		System.out.println("Please enter the string 'Java is fun!'");
		Scanner keyboard = new Scanner(System.in);
		String temp = keyboard.nextLine();
		StringBuilder input = new StringBuilder();
		input.append(temp);
		int length = input.length();
		System.out.println("The length of the string is "+length);
		
		input.append("I love it!");
		System.out.println("Enter another string, 'Yes'");
		String temp2 = keyboard.nextLine();
		input.insert(12,temp2);
		System.out.println(input);
		keyboard.close();
		
	}
}
