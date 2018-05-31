import java.util.Arrays;
public class If_String_Perm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = If_String_P("Hello", "Hello1");
		System.out.println(a);
	}
	static boolean If_String_P(String S1, String S2) {
		if(S1.length() != S2.length()){
			return false;
		}
		S1 = sort_string(S1);
		S2 = sort_string(S2);
		if (S1.equals(S2)) {
			return true;
		}
		return false;
	}
	static String sort_string(String S) {
		char [] content = S.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
}
