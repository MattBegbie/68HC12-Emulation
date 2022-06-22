
public class Register {
	private static byte regA = 0x00;
	private static byte regB = 0x00;
	private static int regD = 0x0000; // A concat B
	
	private static int regX; 
	private static int regY;
	
	private static int SP;
	private static int PC;
	
	private static byte CCR; //AKA Register H
	
	public Register() {
		regA = 0x00;
		regB = 0x00;
		regD = 0x0000;
		
		regX = 0x0000;
		regY = 0x0000;
		
		SP = 0x5678;
		PC = 0x0000;
		
		CCR = 0x00;
	}

	public byte getRegA() {
		return regA;
	}

	public void LDAA(byte regA) {
		this.regA = regA;
		// A and D are intertwined
		this.regD = (this.regD & ~0xFF00) | ((regA << 8) & 0xFF00); //first set of brackets clears the bits i am about to change, second set assings the data to the right spot, together they can be or'ed to make one thing
	}

	public byte getRegB() {
		return regB;
	}

	public void LDAB(byte regB) {
		this.regB = regB;
		//B and D are intertwined
		this.regD = (this.regD & ~0x00FF) | ((regB << 8) & 0x00FF); //double check that this is correct
	}

	public int getRegD() {
		return regD;
	}

	public void LDD(int regD) {
		this.regD = regD;
		// A:B and D are intertwined, changing one changes the others (kinda like quantum entanglement or something)
		this.regA = (byte) (regD >> 8); //shift 0xFF00 bits to 0x00FF position because cast only uses last two digits
		this.regB = (byte) (regB);
	}

	public int getRegX() {
		return regX;
	}

	public void LDX(int regX) {
		this.regX = regX;
	}

	public int getRegY() {
		return regY;
	}

	public void LDY(int regY) {
		this.regY = regY;
	}

	public int getSP() {
		return SP;
	}

	public void LDS(int sP) {
		SP = sP;
	}

	public int getPC() {
		return PC;
	}

	public void IncrememntPC() {
		PC++;
	}

	public byte getCCR() {
		return CCR;
	}

	public void setCCR(byte cCR) {
		CCR = cCR;
	}
	
	
}
