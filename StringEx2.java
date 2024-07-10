package string;

public class StringEx2 {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String("world");
		String s3=new String("hello");
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(s1.concat("kamatchi"));
		//System.out.println(s1+" "+s2+" "+s3);
		//s1=s1.concat("kitty");
		System.out.println(s1+" "+s2+" "+s3);
		if(s1==s3) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}//there it will check for address but not for value
		if(s1.equals(s3)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		// Concatenating strings
		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		// Finding string length
		String text = "This is a sample text.";
		int length = text.length();
		System.out.println(length);
		// String comparison
		String java1 = "Java";
		String java2 = "Java";
		boolean areEqual = java1.equals(java2); // Content comparison
		boolean areSame = (java1 == java2); // Reference comparison
		System.out.println(areEqual);
		System.out.println(areSame);
		// Substring
		String sentence = "The quick brown fox jumps over the lazy dog.";
		String substring = sentence.substring(10, 15); // Extracts "brown"
		System.out.println(substring);
		// Searching in strings
		String sentence2 = "Java is a popular programming language.";
		int indexOfJava = sentence2.indexOf("Java"); // Find the index of "Java"
		System.out.println(indexOfJava);
		boolean containsJava = sentence2.contains("Java"); // Check if it contains "Java"
		System.out.println(containsJava);
		// Splitting strings
		String csvData = "John,Doe,30";
		String[] parts = csvData.split(",");
		System.out.println(parts);
		// Converting case
		String mixedCase = "ThIs Is A MiXeD CaSe StRiNg";
		String uppercase = mixedCase.toUpperCase();
		String lowercase = mixedCase.toLowerCase();
		System.out.println(uppercase);
		System.out.println(lowercase);
		// Trimming whitespace
		String paddedString = " Some Text with Spaces ";
		String trimmedString = paddedString.trim();
		System.out.println(trimmedString);
		// Checking for empty or null strings
		String emptyString = "";
		String nullString = null;
		boolean isEmpty1 = emptyString.isEmpty(); // Check if empty
		boolean isEmpty2 = nullString == null || nullString.isEmpty();
		System.out.println(isEmpty1);
		System.out.println(isEmpty2);
		// Replace characters or substrings
		String originalText = "I love cats. Cats are cute!";
		String replacedText = originalText.replace("cats", "dogs");
		System.out.println(replacedText);
		// String format
		String formattedString = String.format("Hello, %s! You are %d years old.", "Alice",25);
		System.out.println(formattedString);
	}

}
