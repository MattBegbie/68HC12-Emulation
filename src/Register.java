
public class Register {
	private byte regA = 0x00;
	private byte regB = 0x00;
	private int regD = 0x0000; // A concat B
	
	private int regX; 
	private int regY;
	
	private int SP;
	private int PC;
	
	private byte CCR; //AKA Register H
	
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
	}

	public byte getRegB() {
		return regB;
	}

	public void LDAB(byte regB) {
		this.regB = regB;
	}

	public int getRegD() {
		return regD;
	}

	public void LDD(int regD) {
		this.regD = regD;
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

	public void setPC(int pC) {
		PC = pC;
	}

	public byte getCCR() {
		return CCR;
	}

	public void setCCR(byte cCR) {
		CCR = cCR;
	}
	
	
}
