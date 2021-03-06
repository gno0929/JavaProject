package e2017.exam1;

public class Example03 {

	static void countVowel(String s, int[] count) {
		for(int i=0; i<count.length; i++)
			count[i] =0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A')
				++count[0];
			else if(s.charAt(i)=='e'||s.charAt(i)=='E')
				++count[1];
			else if(s.charAt(i)=='i'||s.charAt(i)=='I')
				++count[2];
			else if(s.charAt(i)=='o'||s.charAt(i)=='O')
				++count[3];
			else if(s.charAt(i)=='u'||s.charAt(i)=='U')
				++count[4];
		}

	}

	public static void main(String[] args) {
		String[] a = { "hello", "1234", "HELLO world", "aeiou AEIOU" }; 
		int[] count = new int[5]; 
		System.out.println("A E I O U"); 
		System.out.println("---------"); 
		for (String s : a) { 
			countVowel(s, count); 
			System.out.printf("%d %d %d %d %d %s\n", count[0], count[1], count[2], count[3], count[4], s); 
		}
	}

}
