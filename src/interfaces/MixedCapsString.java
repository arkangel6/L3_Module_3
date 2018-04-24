package interfaces;

import java.util.Arrays;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String f) {
		String lowercase = "";
		f = f.toLowerCase();
		char[] letters = f.toCharArray();
		System.out.println(Arrays.toString(letters));
		//lowercase += (char)(letters[0]+32);
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] == ' ' || letters[i] == 0) {
				lowercase += ' ';
			}
			else if(i%2 == 1) {
				int let = (int)letters[i] - 32;
				char letter = (char) let;
				System.out.println(let);
				lowercase += letter;
			}else {
				System.out.println(letters[i]);
				lowercase += letters[i];
			}
			
			
		}
		
		
		return lowercase;
	}

}
