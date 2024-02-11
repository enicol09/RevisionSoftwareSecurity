import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Vigenere {
	public Alphabet alpha = new Alphabet();
	private static int KEYS = 2;
	public int[] keys = new int[KEYS];

	public Vigenere(int k1, int k2) {
		keys[0] = k1;
		keys[1] = k2;
		// keys[2] = k3;
	}

	public String encrypt(String message) {
		char[] crypt = new char[message.length()];
		for (int i = 0; i < message.length(); i++)
			crypt[i] = alpha.getNext(message.charAt(i), keys[i % KEYS]);

		return new String(crypt);
	}

	public String decrypt(String message, int k1, int k2) {
		int[] test_keys = { k1, k2 };
		char[] crypt = new char[message.length()];
		for (int i = 0; i < message.length(); i++)
			crypt[i] = alpha.getLast(message.charAt(i), test_keys[i % KEYS]);
		return new String(crypt);
	}

	public void attack(String message) {
	
			for (int i = 1; i <= alpha.size(); i++)
				for (int j = 1; j <= alpha.size(); j++) {
					// for (int k = 1; k <= alpha.size(); k++)
					int k = 2;
					
					System.out.print("Key: " + i + ", " + j + ", " + k + " " + decrypt(message, i, j) + " \n");
				}
			

	}

	public static void main(String[] args) {
		String message = "I wanna break free!";
		Vigenere c = new Vigenere(4, 9);
		
		c.alpha.addLetter('!');
		c.alpha.addLetter(' ');
	//	c.alpha.addLetter('$');
	//	System.out.print(c.encrypt(message));
		c.attack("xxrrkqxi!nddmupiljgtdalnd i!znv dxjiyla");
	}

}
