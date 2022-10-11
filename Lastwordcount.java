package assignment2;

public class Lastwordcount {
	public int LastWord(final String a) {
		int count = 0;
		String s1 = a.trim();

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ')
				count = 0;
			else
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "luffy is still joyboy ";
		Lastwordcount len = new Lastwordcount();
		System.out.println("The length of the last word is: " + len.LastWord(s));
	}
}