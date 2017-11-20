package e2017.exam1;

public class Example07 {

	static String getFileExtension(String path) { 
		StringBuilder t = new StringBuilder("");
		if (path.contains(".")) {
			int index = path.indexOf(".");
			for (int i = index+1; i<path.length(); i++) {
				t.append(path.charAt(i));
			}
			return t.toString();
		}
		else
			return "null";
		
		}
		public static void main(String[] args) {
			String[] a = { "c:/data/student/lecture.docx", "c:/www/mainpage.html", "c:/program files/java/readme" }; 
			for (String s : a) { 
				String extension = getFileExtension(s); 
				System.out.printf("%s ", extension); 
			}

		}

	}
