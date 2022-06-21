
public class Conversion {
	
	public Conversion() {}
	public static int addrToIndex(int hexValue) {
		String s = String.format("%x", hexValue);
		return Integer.parseInt(s);
	}
}
