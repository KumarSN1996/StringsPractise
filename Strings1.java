package Udemy;
import java.util.Scanner;
public class Strings {
  
	
public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);

			System.out.println("Enter a string to reverse ::");
			String str1 = sc.nextLine();

			String result = "";

			
			for (int i = str1.length() - 1; i >= 0; i--)
			{
				result = result + str1.charAt(i);
			}

			System.out.println("The reversed string is: " + result);
		}
	}

