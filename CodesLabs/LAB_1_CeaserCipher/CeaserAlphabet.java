import java.util.ArrayList;
import java.util.Scanner;

public class CeaserAlphabet {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Give the key : ");
		int key = scan.nextInt();

		System.out.println("Give the text : ");
		String text = scan.next();

		text.toLowerCase();

		String cipher = MakeEncryption(key, text);

		cipher.toLowerCase();
		
		System.out.print("Encryption done " + cipher);

		cipher = MakeDencryption(key, cipher);
		
		System.out.print("Decryption done " + text);
	}

	private static String MakeEncryption(int key, String text) {

		ArrayList<Character> cipher = new ArrayList<Character>();

		for (int i = 0; i < text.length(); i++) {
			char cha = (char) (((int) text.charAt(i) + key - 65) % 26 + 65);
			cipher.add(cha);
		}

		String cip = "";
		for (int i = 0; i < cipher.size(); i++) {
			cip += cipher.get(i);
		}

		cip.toLowerCase();

		return cip;
	}

	private static String MakeDencryption(int key, String text) {

		ArrayList<Character> cipher = new ArrayList<Character>();

		for (int i = 0; i < text.length(); i++) {

			char cha = (char) (text.charAt(i) - key);
			if (cha < 'a') {
				cha = (char) (cha + 90 - 65 + 1);
			}

			cipher.add(cha);

		}
		String cip = "";
		for (int i = 0; i < cipher.size(); i++) {
			cip += cipher.get(i);
		}

		cip.toLowerCase();

		return cip;
	}
}