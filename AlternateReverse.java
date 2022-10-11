package assignment3;

public class AlternateReverse {

	public static void main(String[] args) {
String s = "I Want to be a Automation Tester";

String word[] = s.split("\\s");
int len = word.length;
String rev = "";
String fin = "";
for (int i = 0; i < len; i++) {
	String words = word[i];
	if (i % 2 != 0) {
		for (int j = words.length() - 1; j >= 0; j--) {
			fin = fin + words.charAt(j);
		}
		rev = rev + fin + " ";
		fin = " ";
	} else
		rev = rev + word[i] + " ";
}
System.out.println(rev );
}
}
