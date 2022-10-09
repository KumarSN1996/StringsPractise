package Udemy;

public class Strings4 {

	public static void main(String[] args) {
		String sentence1 = "inueron";

		String sentence2 = "the five boxing wizards jump quickly"; // is a pangram

		System.out.println("INueron is Pangram : " + isPangram(sentence1));

		System.out.println("Sentence2  is Pangram : " + isPangram(sentence2));
	}

	static boolean isPangram(String str) {

		for (int i = 97; i <= 122; i++) {
			boolean flag = false;

			for (int index = 0; index < str.length(); index++) {

				if ((int) str.charAt(index) == i) {
					flag = true;
					break;
				}

			}
			if (flag == false)
				return false;
		}

		return true;
	}
}
