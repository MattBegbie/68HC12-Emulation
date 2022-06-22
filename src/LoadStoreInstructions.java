public abstract class LoadStoreInstructions {
	
	
	public static void LDAA(Register reg, byte M) 
	{ //Load A // (M) -> A
		reg.setRegA(M);
	}
	
	public static void LDAB(Register reg, byte M) 
	{ //Load B // (M) -> B
		reg.setRegB(M);
	}
	
	public static void LDD(Register reg) {
		//(mem[addr] << 8 ) + mem[addr+1]
		reg.setRegD(((reg.getRegA() << 8) + reg.getRegB()));
	}
	
	public static void LDS(Register reg, byte M, byte N) {
		reg.setSP((byte) ((M << 8) + N));
	}
}
