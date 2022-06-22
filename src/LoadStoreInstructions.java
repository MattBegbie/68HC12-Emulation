@Deprecated
public abstract class LoadStoreInstructions {
	
	//i feel as though these should just be in the register class
	
	public static void LDAA(Register reg, byte M) 
	{ //Load A // (M) -> A
	}
	
	public static void LDAB(Register reg, byte M) 
	{ //Load B // (M) -> B
	}
	
	public static void LDD(Register reg) {
		//(mem[addr] << 8 ) + mem[addr+1]
//		reg.setRegD(((reg.getRegA() << 8) + reg.getRegB()));
	}
	
	public static void LDS(Register reg, byte M, byte N) {
//		reg.setSP((byte) ((M << 8) + N));
	}
}
