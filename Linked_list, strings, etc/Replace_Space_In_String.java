
public class Replace_Space_In_String {

	public static void main(String[] args) {
		String a = Insert_String("Hello World");
		System.out.println(a);
	}
	// Method to replace white spaces in a given string
	static String Insert_String(String str) {
		char content; 
		String new_content = ("");
		for (int i = 0; i < str.length(); i++) {
			content = str.charAt(i);
			if (content != ' ') 
				new_content = new_content + content;
			if (content == ' ') {
				new_content += "%20";
			}
		}
		return new_content;
	}
}
