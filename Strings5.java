package Udemy;
import java.util.*;
public class Strings5 {
 public static void main(String args[]) {
	        String max;
	        char mc =' ';
	        int maximum =-1;
	        int a1[] =new int[256];
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter the String of you choice: ");
	        max= sc.nextLine();

	        for (int i =0; i<max.length();i++){
	            a1[max.charAt(i)]++;
	        }
	        for (int i=0; i<max.length();i++){
	            char ch =max.charAt(i);
	            if (maximum<a1[ch]){
	                maximum=a1[ch];
	                mc=ch;
	            }
	        }
	        System.out.println("Maximum Occurring character will be : " + mc);





	    }

	    }

