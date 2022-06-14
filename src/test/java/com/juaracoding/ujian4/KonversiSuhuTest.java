package com.juaracoding.ujian4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class KonversiSuhuTest {
	
	RumusFahCel rumusFahCel;
	
	@Before
	public void setUp() {
		rumusFahCel = new RumusFahCel();
	}
	
	@Test
	@FileParameters("src/test/resources/tblAddSuhu.csv")
	public void testKonversi (double fahrenheit, double expect) {
		double actual = rumusFahCel.Suhu(fahrenheit);
		assertEquals(expect, actual,0.1); 
	}
	
	@Test
	public void testString() {
		String s = "s";
		double a = Double.parseDouble(s);
		double actual = rumusFahCel.Suhu(a);
		assertEquals(2, actual,0.0);
	}
	
	@Test
	public void testNegatif() {
		double actual = rumusFahCel.Suhu(-(-34));
		assertEquals(1.11, actual,0.1);
	}
}
