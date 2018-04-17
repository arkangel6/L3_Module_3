package interfaces;

public class BackwardsString extends SpecialString {

	

	public BackwardsString(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}

	@Override
	public String funkifyText(String f) {
		
		String backwards = "";
		
		char[] letters = f.toCharArray();
		
		for(int i = letters.length-1; i >= 0; i--) {
			backwards += letters[i];
		}
		
		
		
		return backwards;
	}

}
