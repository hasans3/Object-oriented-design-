
public class IsUnique {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
//		boolean isUniqueChars(String str) {
		String str = "Hello World";
		if (str.length() > 128)
			return false;
		boolean [] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
//		}
	}
}
