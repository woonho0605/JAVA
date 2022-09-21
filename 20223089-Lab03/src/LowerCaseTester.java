
public class LowerCaseTester {

	
	
	public static void main(String[] args) {
		String teststring = "This is a Test";
		String smallTestString = teststring.toLowerCase();
		
		System.out.println(smallTestString);
		
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
}
}