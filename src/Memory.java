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
		mem = new byte[128000];
		
		for (int i = 0; i < 100; i++) {
		//	mem[i] = (byte) i;
		}
		
		//assign 5 to address 6, and 8 to address 1b (27)
		//mem[this.addrToIndex("6")] = 5;
		//mem[this.addrToIndex("1b")] = 8;
		//mem[this.addrToIndex("12")] = 0b10;
		mem[0x1b] = 6;
		mem[0x1b + 2] = 16;
		//mem[13] = 0x22;
	}
	
	public void assignRandomRandom() {
		SecureRandom rand = new SecureRandom();
		for (int i = 0; i < 100; i++) {			
		}
	}
	
	public void printMemoryA() {
		for (int i = 0; i < 1280; i++) { //for full 12800
			for (int j = 0; j < 10; j++) {
				System.out.printf("%x ", mem[(i*10) + j]);
			}
			System.out.println();
		}
	}
	
	public int addrToIndex(String hexNum) {
		return Integer.parseInt(hexNum, 16);
	}
	
	/**
	 * prints memory from addr 0x2000 to 
	 */
	public void printMemIns() {
		
	}
	
	/**
	 * prints memory from addr 0x1000 to 0x2000
	 */
	public void printMemData() {
		
	}
}
