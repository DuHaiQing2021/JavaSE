package com.duhaiqing.majangimpl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaJiangTest {
	//�����Ƿ����������к���
	@Test
	public void testMaJiang() {
		MajangImpl t = new MajangImpl();
		int ret = t.majangSystem("1T8T6W6W5D4W1T3W6W2W5D6T1T");
		assertEquals(1,ret);
	}
 
	//�����Ƿ��������ж�û�к���
	@Test
	public void testMaJiang1() {
		MajangImpl t = new MajangImpl();
		int ret = t.majangSystem("");
		assertEquals(0,ret);
	}
}
