
public class ceasar_cipher {

	public static void main(String[] args) {
        
        String s = "!nwrx$ilr rfnw!icruuiwx iqjbnigggh";
                
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','!', ' ', '$'};
            
        String temp = "";
        int t = 0;
        for (int i = 0; i < letters.length; i++) { // Corrected to iterate through the entire letters array
            System.out.print(i + " ");
            temp = "";
            for(int j = 0; j < s.length(); j++) { // Corrected to iterate through the entire string s
                for (int k = 0; k < letters.length; k++) {
                    if(letters[k] == s.charAt(j)) {
                        t = k;
                        break;
                    }
                }
                
                int num = (t - i + letters.length) % letters.length; // Corrected to properly wrap around
                temp += letters[num];
            }
            System.out.println(temp);
        }

    }

}