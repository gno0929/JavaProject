package e2017.exam1;

public class Example01 {
	
	static String reverse(String s) { 
		StringBuilder t = new StringBuilder("");
		for(int i = (s.length()-1); i>=0; i--) 
			t.append(s.charAt(i));
		return t.toString();
	}

	public static void main(String[] args) {
		String[] a = { "a", "1234", "hello" }; 
		for (String s : a) 
			System.out.printf("%s ", reverse(s));
	}

}
