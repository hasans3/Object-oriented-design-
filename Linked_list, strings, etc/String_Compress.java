
public class String_Compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = String_Compression("aabcccccaaa");
		System.out.println(a);
	}
	
	static String String_Compression(String S) {
		String compressed_string = "";
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			count++;
			if (i + 1 >= S.length() || S.charAt(i) != S.charAt(i + 1)) {
				compressed_string = compressed_string + S.charAt(i) + count;
				count = 0;
			}
		}
		if (S.length() < compressed_string.length())
			return S;
		else
			return compressed_string;
	}

}
