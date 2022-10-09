package Udemy;
import java.util.Arrays;
import java.util.Scanner;
public class Strings3 {

 public static void main(String args[]) {
	        String s1;
	        String s2;
	        Scanner sc =new Scanner(System.in);

	        System.out.println("Enter first string :: ");
	        s1=sc.nextLine();
	        System.out.println("Enter second string :: ");
	        s2 =sc.nextLine();

	      
	        char[] a1 =s1.toCharArray();
	        char[] a2= s2.toCharArray();

	   
	        Arrays.sort(a1);
	        Arrays.sort(a2);


	        if (s1.valueOf(a1).equals(s2.valueOf(a2))){
	            System.out.println("String is Anagram");

	        }else
	            System.out.println("String is not Anagram");


	    }
	}
