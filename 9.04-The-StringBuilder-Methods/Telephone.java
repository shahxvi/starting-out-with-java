// Static methods for formatting and unformating U.S. telephone numbers.

public class Telephone {
	public final static int FORMATTED_LENGTH = 13;
	public final static int UNFORMATTED_LENGTH = 10;

	public static boolean isFormatted(String str) {
		if (str.length() != FORMATTED_LENGTH)
			return false;
		if (str.charAt(0) != '(')
			return false;
		if (str.charAt(4) != ')') 
			return false;
		if (str.charAt(8) != '-')
			return false;
		return true;
	}

	public static String unformat(String str) {
		StringBuilder strb = new StringBuilder(str);

		if (isFormatted(str)) {
			strb.deleteCharAt(0);
			strb.deleteCharAt(3);
			strb.deleteCharAt(6);
		}

		return strb.toString();
	}

	public static String format(String str) {
		StringBuilder strb = new StringBuilder(str);

		if (str.length() == UNFORMATTED_LENGTH) {
			strb.insert(0, "(");
			strb.insert(4, ")");
			strb.insert(8, "-");
		}

		return strb.toString();
	}
}

