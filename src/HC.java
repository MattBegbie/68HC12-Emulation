/*
 * Attempt at 68HC12 Emulator
 * 
 * issues:
 * 	idk if it is called the 68HCS12 or the 68HC12
 * 	wiki and online reference shows no S, but textbook and emulator that i already have use S
 * 
 * Program knowledge is a combination of CST8234 - Processor Architecture course at Algonquin College
 * and near forgotten memories from OLC6502 tutorial on youtube
 * 
 * 
 * 
 * Main is the controller
 * Classes include;
 * Register //registers of data
 * Memory //array of all memory
 * OPCODES //cannot find opcodes... great
 * ALU? //methods? man i got no clue what im doing
 * Buses? //i do not think i need a bus, it seems... unecesarry in this program
 * Addressing mode?	
 * 
 * STEPS
 * recreate all functions, opcodes, memory registers, etc
 * integrate reading from file, (read s19 file perhaps):
 * https://neuron.eng.wayne.edu/auth/ece2620_new/s19_format.html#:~:text=s19%20file%20is%20a%20file,by%202%2Dcharacter%20HEX%20strings.
 * enumeration may be useful for reading instructions
 * 
 * 
 * i am finding difficulty finding documentation on LEAS (load effective address SP)
 * I think LEAS should be in this class, its signiture may be something like LEAS(PC) if effective address means current address means Program Counter
 * 
 * TODO:
 * implement carry bit and other CCR operations
 * Learn about reading options... how would that work? a massive switch case with every possible instruction? that seems goofy and unefficient
 * 
 */
public class HC {

	public static Register reg = new Register();

	public static void main(String[] args) {

		Memory mem = new Memory();
		//mem.assignByte(0x1000, 0xff);
		mem.assignWord(0x1000, 0x1234);
		mem.printByte(0x1000);
		mem.printByte(0x1001);
		System.out.printf("%x\n", (mem.readWord(0x1000)));
		mem.printMemData();
		reg.LDD(mem.readWord(0x1000));
		//reg.LDAA(mem.readByte(0x1001));
		//System.out.printf("RegA=%x, RegB=%x, RegD=%x", reg.getRegA(), reg.getRegB(), reg.getRegD());
		//System.out.printf("%x", reg.getRegD());
		reg.ORG(0x0000);
		System.out.print(reg.toString());
		
		
		
	}
}

//something like this for running program (similar to menu calling in projects
/*
 *run(){
 *	get PC
 *	switch statement of all possible instructions
 *	byte matches an instruction, execute the instruction at PC address
 * 	incrememnt PC
 * }
 * 
 */










