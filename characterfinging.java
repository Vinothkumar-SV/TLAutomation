package aAccMod1;

public class characterfinging {

	
	public static void main(String[] args) {
		String s="Welcome To AutoMATION";
		char[] charArray = s.toCharArray();
		
		int uppercount=0;
		int lowercount=0;
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			
			if (Character.isUpperCase(c)) {
				uppercount++;
			}
			else if(Character.isLowerCase(c)){
				lowercount++;
			}
			
			
			
		}
		
		
		System.out.println("Upper case character :"+ uppercount +"\n" + "Lower case character :"+lowercount);
		
		
		
		String str = "vinoth Kumar AutomatION TesTER ";
		String lower = str.replaceAll("[^a-z]", "");
		String upper = str.replaceAll("[^A-Z]", "");
		System.out.println(lower);

		System.out
				.println("Upper case character :" + upper.length() + "\n" + "Lower case character :" + lower.length());
		
		
		
		
		
		
	}
}
