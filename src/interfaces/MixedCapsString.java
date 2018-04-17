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
		
		char[] letters = f.toCharArray();
		System.out.println(Arrays.toString(letters));
		lowercase += (char)(letters[0]+32);
		for(int i = 1; i < letters.length; i++) {
			if(i%2 == 1) {
				int let = (int)letters[i] - 32;
				char letter = (char) let;
				lowercase += letter;
			}else {
				lowercase += letters[i];
			}
			
			
		}
		
		
		return lowercase;
	}

}
