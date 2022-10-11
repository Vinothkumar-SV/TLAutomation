package assignmentreview;

public class Regular {                                                   // WhiteSpace --> \\s
	/*String str = "Ram Loves Pulsar #NS200 & Pulsar-150";  // NoWhiteSpace --> \\S
    // [a-zA-Z0-9_]  --> \\w  (Word)
//To Take Numbers Only                                   // [^a-zA-Z0-9_]  --> \\W (NoWord)
//Method 1:                                              
String replaceAll = str.replaceAll("[^0-9]", "");
//Method 2:	
String replaceAll2 = str.replaceAll("\\D", "");

//System.out.println("To Get NumOnly :- "+replaceAll2); // ?     --> 0/1
    // *     --> 0 - any no. of times
//To Find No. of Words in the given Sentences            // +     --> 1 - any no. of times
//Count all Strings other than white space               // {n}   --> =n
// Method 1:	                                      // {n,}  --> min-n, max-any no. of times
String[] split = str.split("\\s");                    // {n,m} --> min-n, max-m
// Method 2:
//String[] split2 = str.split(" ");

for (int i = 0; i < split.length; i++) {
System.out.print(split[i]+" ");
}

//Patterns in Real Life
String email_1 = "ramramiah102@gmail.com";  String email_2 = "Ram_ramiah96@gmail.com";
String email_3 = "ram.sar@gmail.com";       String email_4 = "ram555@gmail.testleaf.co.in";

String pattern_1 = "[a-z0-9]+@[a-z]+.[a-z]{2,3}";
String pattern_2 = "[a-zA-Z]+_[a-z0-9]+@[a-z]+.[a-z]{2,3}";
String pattern_3 = "[a-z.]+@[a-z]+.[a-z]{2,3}";
String pattern_4 = "[a-z0-9]+@[a-z]+.[a-z.]{2,}";

Pattern compile = Pattern.compile(pattern_1);
Matcher matcher = compile.matcher(email_1);
System.out.println("Pattern Matches :- "+matcher.matches()); // true - Success
           // false - Fail
System.out.println("====================");

String pattern = "\\d+";
Pattern compile1 = Pattern.compile(pattern);
Matcher matcher1 = compile1.matcher(str);
while (matcher1.find()) {
System.out.println(matcher1.group());
}

*/}


