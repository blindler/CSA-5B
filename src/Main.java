class Main {
  public static void main(String[] args) {
		
		String a = "a";
		String b = "A";
		System.out.println(a.toUpperCase());

		System.out.print(a.trim());
		System.out.println(b);

		String word1 = "comPutational";
		
		String word2 = "computational";
		String temp = "";
		String someNum = "123";

		System.out.println(word1 + word2);
		//word1.concat(word2)
		System.out.println(word1.indexOf('P'));
		System.out.println(word1.indexOf('p'));
		System.out.println(word1.substring(3));

		System.out.println(word1.charAt(2));
		// System.out.println(word1.charAt(14));
				System.out.println(word1.substring(3,5));
		//		System.out.println(word1.substring(14));
		System.out.println(word1.toLowerCase());


		System.out.println(word1.compareTo(word2));
		System.out.println(temp.length());
		System.out.println( Integer.parseInt(someNum));
		
	String someWordWithSpaces = "        some word   ";
	System.out.println(someWordWithSpaces);
	System.out.println(someWordWithSpaces.length());
	System.out.println(someWordWithSpaces.trim());
		System.out.println(someWordWithSpaces.length());
	someWordWithSpaces = someWordWithSpaces.trim();
		System.out.println(someWordWithSpaces.length());

	System.out.println(word1.replaceAll("t","*"));


		// indexOf()
		// substring()
		// empty string length
		// charAt( -4)
		// mutability
		// .trim()
		// compareTo - char by char?
		// what comes first, or is a negative result?
		// toLowerCase()
		// Integer.parseInt("12345")

		// toString()

		// replaceAll("this", "that")

	
		
		
  }
}