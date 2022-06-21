import java.security.SecureRandom;
//import java.util.Random;

/**
 * Currently have a 2d array for holding memory, should be a 1d
 * @author mdbeg
 *
 */
public class Memory {
	private byte[] mem;
	
	public Memory() {		
		mem = new byte[0xffff];
		
		for (int i = 0x1000; i < 0x10FF; i++) {
			mem[i] = (byte) i;
		}
		
		//assign 5 to address 6, and 8 to address 1b (27) just for testing
		mem[0x1b] = 6;
		mem[0x1000] = 1;
		mem[0x1001] = 2;
		mem[0x1b + 2] = 0xA;
	}
	
	@Deprecated
	public void assignRandomRandom() {
		SecureRandom rand = new SecureRandom();
		for (int i = 0; i < 100; i++) {		
			
		}
	}
	
	/**
	 * print entire memory array
	 */
	public void printAllMemory() {
		for(int i = 0; i < 0xffff; i ++) {
			System.out.printf("%2x", mem[i]);
			System.out.println();
		}
		
//		for (int i = 0; i < 1280; i++) { //for full 12800
//			for (int j = 0; j < 10; j++) {
//				System.out.printf("%x ", mem[(i*10) + j]);
//			}
//			System.out.println();
//		}
	}
	
	/**
	 * prints memory from addr 0x2000 to 
	 */
	public void printMemIns() {
		for (int i = 0x2000; i < 0x3000; i++) {
			System.out.printf("%2X ", mem[i]);
			if ((i+1)%0x10 == 0) System.out.println();
		}
	}
	
	/**
	 * prints memory from addr 0x1000 to 0x2000
	 */
	public void printMemData() {
		for (int i = 0x1000; i < 0x2000; i++) {
			System.out.printf("%2X ", mem[i]);
			if ((i+1)%0x10 == 0) System.out.println();
		}
	}
	
	/**
	 * Prints memory between two indexes
	 * @param start - staring index
	 * @param end - ending index
	 */
	public void printRange(int start, int end) {
		for (int i = start; i < end; i++) {
			System.out.printf("%2X ", mem[i]);
			if ((i+1)%0x10 == 0) System.out.println();
		}
	}
}
