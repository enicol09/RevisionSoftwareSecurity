

public class vigenere {
	
	public static void main(String args[]) {
		String M = "xxrrkqxi!nddmupiljgtdalnd i!znv dxjiyla";
		int K1, K2;
		K1 = 4;
		K2 = 9;
		String alphabet = "abcdefghijklmnopqrstuvwxyz! ";
		// if (Integer.parseInt(args[3]) == 1)
		// 	System.out.println(encrypt(M, K1, K2, alphabet));
		// else
		// 	System.out.println(decrypt(M, K1, K2, alphabet));
		System.out.println(decrypt(M, K1, K2, alphabet));
	}

	public static String encrypt(String M, int K1, int K2, String alphabet) {
		String ciphertext = "";
		for (int i = 0; i < M.length(); i++) {
			char a;
			if (i % 2 == 0) {
				int b = alphabet.indexOf(M.charAt(i)) + K1;
				a = alphabet.charAt(b % alphabet.length());
			} else {
				int b = alphabet.indexOf(M.charAt(i)) + K2;
				a = alphabet.charAt(b % alphabet.length());
			}
			ciphertext += a;
		}
		return ciphertext;
	}

	public static String decrypt(String M, int K1, int K2, String alphabet) {
		String plaintext = "";
		for (int i = 0; i < M.length(); i++) {
			char a;
			if (i % 2 == 0) {
				int b = alphabet.indexOf(M.charAt(i)) - K1;
				if (b < 0)
					a = alphabet.charAt(b % alphabet.length() + alphabet.length());
				else
					a = alphabet.charAt(b % alphabet.length());
			} else {
				int b = alphabet.indexOf(M.charAt(i)) - K2;
				if (b < 0)
					a = alphabet.charAt(b % alphabet.length() + alphabet.length());
				else
					a = alphabet.charAt(b % alphabet.length());
			}
			plaintext += a;
		}
		return plaintext;
	}

}