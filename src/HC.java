/*
 * Attempt at 68HC12 Emulator
 * 
 * issues:
 * 	idk if it is called the 68HCS12 or the 68HC12
 * 	wiki and online reference shows no S, but textbook and emulator that i already have use S
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
		//mem.assignByte(0x1000, 0xff);
		mem.assignWord(0x1000, 0x1234);
		mem.printByte(0x1000);
		mem.printByte(0x1001);
		//mem.printMemData();
	}

}
