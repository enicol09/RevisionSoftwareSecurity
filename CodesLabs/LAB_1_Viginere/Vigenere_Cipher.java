public class Vigenere_Cipher {

	public static void main(String[] args) {
		//your ciphertext
		String C = "xxrrkqxi!nddmupiljgtdalnd i!znv dxjiyla";
		//letters[]
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!', ' '};
		//plaintext declaration
		String P;
		
		int t = 0;

		for (int l1 = 0; l1 < letters.length; l1++) {
			for (int l2 = 0; l2 < letters.length; l2++) {
				
				System.out.print("> " + l1 + " , " + l2);
				P = "";
				for (int j = 0; j < C.length(); j++) {
					for (int k = 0; k < letters.length; k++) {
						if (letters[k] == C.charAt(j)) {
							t = k;
							break;
						}
					}

					if (j % 2 == 0) {
						t -= l1;
					} else
						t -= l2;
					int num = Math.floorMod(t, 28); //this rememberr
					P += letters[num];
				}
				System.out.println("\n\t" + P);
			}

		}


	}


}
