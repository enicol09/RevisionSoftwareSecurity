
public interface Cipher {
	String encrypt(String message, int key);

	String decrypt(String message, int key);

	default void attack(String message, int X) {
		for (int i = 1; i <= X; i++)
			System.out.println("Key: " + i + " " + decrypt(message, i));

	}
}
