package com.java.base;

public class Main {

	public static void main(String[] args) {
		// StringBulider / StringBuffer
		
		StringBuilder stringBilder = new StringBuilder("abcdefg");
		
		stringBilder.append("hijklmn");
		stringBilder.insert(3,"zzz");
		stringBilder.delete(3,6);
		
		System.out.println(stringBilder);
		
		//------
		
		StringBuffer stringBuffer = new StringBuffer("abcdefg");
		
		stringBuffer.append("hijklmn");
		stringBuffer.insert(3,"zzz");
		stringBuffer.delete(3,6);
		
		System.out.println(stringBuffer);
		
		
	}

}
