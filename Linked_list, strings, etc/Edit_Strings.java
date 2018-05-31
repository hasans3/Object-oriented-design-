
public class Edit_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = Edit("Hello", "Helloo");
		System.out.println(a);
	}
	static boolean Edit(String s1, String s2) {
		if (s1.length() == s2.length())
			return Edit_1(s1,s2);
		else if (s1.length() + 1 == s2.length())
			return Edit_2(s1,s2);
		else if (s1.length() - 1 == s2.length())
			return Edit_2(s1,s2);
		return false;
	}
	static boolean Edit_1(String s1, String s2) {
		boolean temp = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (temp) {
					return false;
				}
				temp = true;
			}
		}
		return true;
	}
	static boolean Edit_2(String s1, String s2) {
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) != s2.charAt(j)) {
				if (i != j)
					return false;
				i++;
			}	
			else {
				i++;
				j++;
			}
		}
		return true;
	}
}
