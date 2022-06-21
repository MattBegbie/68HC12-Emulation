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
		
		//fills first 254 data addresses
//		for (int i = 0x1000; i < 0x10FF; i++) {
//			mem[i] = (byte) i;
//		}
		
		//assign 5 to address 6, and 8 to address 1b (27) just for testing
//		mem[0x1b] = 6;
//		mem[0x1000] = 1;
//		mem[0x1001] = 2;
//		mem[0x1b + 2] = 0xA;
	}
	
	public void assignByte(int addr, int val) {
		mem[addr] = (byte) val;
	}
	
	public void assignWord(int addr, int val) {
		//big endian
		//split the word
		//create two integers which are masked versions of the word
		int pt1 = val & 0xFF00;
		int pt2 = val & 0x00FF;
		
		//convert the first part of the word into a single byte
		pt1 = pt1 >>> 8;
		this.mem[addr] = (byte) pt1;
		this.mem[addr+1] = (byte) pt2;
	}
	
	
	
	@Deprecated
	public void assignRandomRandom() {
		SecureRandom rand = new SecureRandom();
		for (int i = 0; i < 100; i++) {		
			mem[rand.nextInt(0xFFFF)] = (byte) rand.nextInt(0xFF);
		}
	}
	
	public void printByte(int addr) {
		System.out.printf("address: %x value: %X\n", addr, mem[addr]);
	}
	
	/**
	 * print entire memory array
	 */
	public void printAllMemory() {
		for(int i = 0; i < 0xffff; i ++) {
			System.out.printf("%2x", mem[i]);
			System.out.println();
		}
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
