package e2017.exam1;

public class Example06 {

	static String getFileExtension(String path) {
		StringBuilder t = new StringBuilder("");
		int index = path.indexOf(".");
		for (int i = index+1; i<path.length(); i++) {
			t.append(path.charAt(i));
		}
		return t.toString();
	}
	public static void main(String[] args) { 
		String[] a = { "c:/data/student/lecture.docx", 
				"c:/www/mainpage.html", 
		"c:/program files/java/javac.exe" }; 
		for (String s : a) { 
			String extension = getFileExtension(s); 
			System.out.printf("%s ", extension); 
		}
	}


}
