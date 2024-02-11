public class transposition {

	public static void main(String[] args) {
			String plaintext ="";
			String message= "Snf r!tt riyusUonpd Cc teoYkCo";
			System.out.println(message.length());
			for(int i=0;i<message.length();i++) {
				plaintext = decryptMessage(i+1,message);
				System.out.println((i+1)+ " " +plaintext);
			}
			
	}
	
	public static String decryptMessage(int key,String message) {
		int numOfColumns = (int)(Math.ceil((float)message.length()/(float)key));
		int numOfRows = key;
		int numOfShadedBoxes = (numOfColumns * numOfRows) - message.length();
		String fin ="";
		char plaintext[][] = new char[numOfRows][numOfColumns];
		int row=0;int column =0;
		for(int i=0;i<message.length();i++) {
				char t = message.charAt(i);
				plaintext[row][column]= t;
				column++;
				if((column==numOfColumns)||((column==numOfColumns -1)&& row>=(numOfRows-numOfShadedBoxes))) {
						row++;
						column=0;
				}
		}
		
			for(int j=0;j<numOfColumns;j++)
				for(int i=0;i<numOfRows;i++)
						fin += plaintext[i][j];
		return fin;
	}

}
