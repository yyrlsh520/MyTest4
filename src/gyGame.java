import static org.junit.Assert.*;

import org.junit.Test;
import com.guangyu.stringTools.*;

public class gyGame {

	@Test
	public void testEmptyStr() {
		// ���Կ��ַ���
		String inputString = "";
		
		int ret = maxSubStr.maxSubStr(inputString);
		assertEquals(ret, 0);
	}
	
	@Test
	public void testStrLenthEqualTo30000() {
		// ������󳤶��ַ���
		
		String inputString = "";
		for(int i=0;i<1000;i++){
			inputString+="qwertyuioplkjhgfdsazxcvbnmqwer";
		}
		
		int ret = maxSubStr.maxSubStr(inputString);
		assertEquals(ret, 26);
	}
	
	@Test
	public void testStrLenthEqualTo1500() {
		String inputString = "";
		for(int i=0;i<100;i++){
			inputString+="qwertyuioplkjhg";
		}
		
		int ret = maxSubStr.maxSubStr(inputString);
		assertEquals(ret, 15);
	}
	
	@Test
	public void testStrLenthEqualTo100() {
		String inputString = "";
		for(int i=0;i<10;i++){
			inputString+="qwertyuiop";
		}
		
		int ret = maxSubStr.maxSubStr(inputString);
		assertEquals(ret, 10);
	}
	
	@Test
	public void testStrLenthEqualTo10() {
		String inputString = "qweradgqqw";
		
		int ret = maxSubStr.maxSubStr(inputString);
		assertEquals(ret, 7);
	}
}
