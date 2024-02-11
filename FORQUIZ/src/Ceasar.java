
public class Ceasar implements Cipher {
	public Alphabet alpha = new Alphabet();

	public static void main(String[] args) {
		int key = 27;
		String message = "! almv !h!pwatlhjmh! aleqvohpizlmz";
	
		Ceasar c = new Ceasar();
		
		c.alpha.addLetters();
		c.alpha.addLetter('!');
		c.alpha.addLetter(' ');
		
		
		// c.alpha.display();
		
		c.attack(message,c.alpha.size());
	}

	@Override
	public String encrypt(String message, int key) {
		char[] crypt = new char[message.length()];
		for (int i = 0; i < message.length(); i++)
			crypt[i] = alpha.getNext(message.charAt(i), key);
		return new String(crypt);
	}

	@Override
	public String decrypt(String message, int key) {
		char[] crypt = new char[message.length()];
		for (int i = 0; i < message.length(); i++)
			crypt[i] = alpha.getLast(message.charAt(i), key);
		return new String(crypt);
	}

}
