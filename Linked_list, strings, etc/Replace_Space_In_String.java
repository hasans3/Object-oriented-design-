
public class Replace_Space_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = Insert_String("Hello World");
		System.out.println(a);
	}
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
