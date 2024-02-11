
public class TranspositionCipher {
	public static void main(String args[]) {
		String M = "Snf r!tt riyusUonpd Cc teoYkCo";
		int K = 5;
		// if (Integer.parseInt(args[2]) == 1)
		// 	System.out.println(encrypt(M, K));
		// else
		// 	System.out.println(decrypt(M, K));
		System.out.println(decrypt(M, K));
	}

	public static String encrypt(String M, int K) {
		String ciphertext = "";
		int a = 0;
		char array[][] = new char[M.length() / K + 1][K];

		for (int i = 0; i < M.length() / K + 1; i++) {
			for (int j = 0; j < K; j++) {
				if ((i == M.length() / K) && (j > M.length() % K - 1)) {
					array[i][j] = '0';
				} else {
					array[i][j] = M.charAt(a);
					a++;
				}
			}
		}
		for (int j = 0; j < K; j++) {
			for (int i = 0; i < M.length() / K + 1; i++) {
				ciphertext += array[i][j];
			}
		}
		return ciphertext;
	}

	public static String decrypt(String M, int K) {
		String plaintext = "";
		int a = 0;
		char array[][] = new char[M.length() / K + 1][K];
		
		for (int j = 0; j < K; j++) {
		for (int i = 0; i < M.length() / K ; i++) {
					array[i][j] = M.charAt(a);
					a++;
			}
		}
		
			for (int i = 0; i < M.length() / K + 1; i++) {
				for (int j = 0; j < K; j++) {
					if (array[i][j]!='0')
				plaintext += array[i][j];
			}
		}
		return plaintext;
	}
}
