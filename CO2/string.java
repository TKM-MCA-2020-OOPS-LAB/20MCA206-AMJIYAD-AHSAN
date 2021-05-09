
public class string {

	public static void main(String[] args) {
		String st1="java";
		String st2="programming";
		System.out.println("string 1 is :"+ st1);
		System.out.println("string 2 is :"+ st2);
		String st=st1.concat(st2);
		System.out.println("string concatenation : " + st);
		System.out.println("length of string "+ st2 +" is " +st2.length());
		System.out.println("Character at position 3 of string 2 : " + st2.charAt(3));
		System.out.println("Index of character 'o'in string 2 : " + st2.indexOf('o'));
		System.out.println("Compare To 'java': " + st1.compareTo("java"));
		System.out.println("Contains sequence 'ing' in string 2 : " + st2.contains("ing"));
		System.out.println("EndsWith character 'a' in string 1 : " + st1.endsWith("a"));
		System.out.println("LowerCase of string 1 : " + st1.toLowerCase());
		System.out.println("UpperCase of string 2 : " + st2.toUpperCase());
		System.out.println("Replace 'java with python': " + st.replace("java", "python"));
	}

}
