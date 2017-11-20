package e2017.exam1;

public class Example05 {

	static String convertToSnakeCase(String s) {
		StringBuffer t = new StringBuffer("");

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >='A' && s.charAt(i) <='Z') {
				if(i != 0)
					t.append("_");
				t.append((char)(s.charAt(i)+32));
			}
			else
				t.append(s.charAt(i));
		}
		return t.toString();
	}

	public static void main(String[] args) {
		String[] a = { "helloWorld", "oneTwoThree", "HowDoYouDo", "One" }; 
		for (String s : a)
			System.out.printf("%s ", convertToSnakeCase(s));

	}

}
