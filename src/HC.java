/*
 * Attempt at 68HC12 Emulator
 * 
 * Main is the controller
 * Classes include;
 * Register
 * Memory
 * OPCODES
 * Buses?
 * 
 */
public class HC {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register regs = new Register();
		Memory mem = new Memory();
		
		mem.printMemoryA();
	}

}
