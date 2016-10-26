import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;


public class gyGame {

	@Test
	public void testEmptyStr() {
		// ²âÊÔ¿Õ×Ö·û´®
		String inputString = "";
		
		String ret = maxSubStr(inputString);
		assertEquals(ret.length(), 0);
	}
	
	public void testStrLenthEqualTo30000() {
		// ²âÊÔ×î´ó³¤¶È×Ö·û´®
		
		String inputString = "";
		for(int i=0;i<1000;i++){
			inputString+="qwertyuioplkjhgfdsazxcvbnmqwer";
		}
		
		String ret = maxSubStr(inputString);
		assertEquals(ret.length(), 26);
	}

	public void testStrLenthEqualTo1500() {
		String inputString = "";
		for(int i=0;i<100;i++){
			inputString+="qwertyuioplkjhg";
		}
		
		String ret = maxSubStr(inputString);
		assertEquals(ret.length(), 15);
	}

	public void testStrLenthEqualTo100() {
		String inputString = "";
		for(int i=0;i<10;i++){
			inputString+="qwertyuiop";
		}
		
		String ret = maxSubStr(inputString);
		assertEquals(ret.length(), 10);
	}
	public void testStrLenthEqualTo10() {
		String inputString = "qweradgqqw";
		
		String ret = maxSubStr(inputString);
		assertEquals(ret.length(), 7);
	}
}
