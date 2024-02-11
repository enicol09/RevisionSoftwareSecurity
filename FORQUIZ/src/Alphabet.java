import java.util.ArrayList;

public class Alphabet {
	private ArrayList<Character> letters = new ArrayList<>();
    private char alphabetadd[] = {'n','w','r','x','i','l','r','f','c','q','j','b','g','h'};
	public Alphabet() {
	
		   //addBigOnes();
	}
	
	public void  addLetters() {
		for (char t = 'a'; t <= 'z'; t++)
			letters.add(t);
	}

	private void addBigOnes() {
		for (char t = 'A'; t <= 'Z'; t++)
			letters.add(t);
		
	}

	public void addLetter(char x) {
		letters.add(x);
	}

	public int find(char which) {
		int i = 0;
		for (char x : letters) {
			if (x == which)
				return i;
			i++;
		}
		return -1;
	}

	public void display() {
		for (char x : letters)
			System.out.print(x + " ");
		System.out.println();
	}

	public char getNext(char which, int offset) {
		char returnable = ' ';
		int place = find(which);
		if (place + offset >= letters.size())
			returnable = getNext(letters.get(0), (place + offset - letters.size()));
		else
			returnable = letters.get(place + offset);
		return returnable;
	}

	public char getLast(char which, int offset) {
		return getNext(which, letters.size() - offset);
	}

	public static void main(String[] args) {
		Alphabet ap = new Alphabet();
		for (char t = 'a'; t <= 'z'; t++)
			System.out.println(ap.getLast(t, 1));
	}

	public boolean belongs(char z) {
		for (char a : letters)
			if (a == z)
				return true;
		return false;
	}

	public int size() {
		return letters.size();
	}
}
