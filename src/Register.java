
public class Register {
	private byte regA = 0x00;
	private byte regB = 0x00;
	private byte regD = 0x0000; // A concat B
	
	private byte regX; 
	private byte regY;
	
	private byte SP;
	private byte PC;
	
	private byte CCR; //AKA Register H
	
	public Register() {
		regA = 0x00;
		regB = 0x00;
		//regD = 0x0000;
		
		regX = 0x0000;
		regY = 0x0000;
		
		SP = 0x0000;
		PC = 0x0000;
		
		CCR = 0x00;
	}

	public byte getRegA() {
		return regA;
	}

	public void setRegA(byte regA) {
		this.regA = regA;
	}

	public byte getRegB() {
		return regB;
	}

	public void setRegB(byte regB) {
		this.regB = regB;
	}

	public byte getRegD() {
		return regD;
	}

	public void setRegD(byte regD) {
		this.regD = regD;
	}

	public byte getRegX() {
		return regX;
	}

	public void setRegX(byte regX) {
		this.regX = regX;
	}

	public byte getRegY() {
		return regY;
	}

	public void setRegY(byte regY) {
		this.regY = regY;
	}

	public byte getSP() {
		return SP;
	}

	public void setSP(byte sP) {
		SP = sP;
	}

	public byte getPC() {
		return PC;
	}

	public void setPC(byte pC) {
		PC = pC;
	}

	public byte getCCR() {
		return CCR;
	}

	public void setCCR(byte cCR) {
		CCR = cCR;
	}
	
	
}
