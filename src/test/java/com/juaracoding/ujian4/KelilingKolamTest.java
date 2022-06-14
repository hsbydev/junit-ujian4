package com.juaracoding.ujian4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class KelilingKolamTest {
	
	RumusKeliling rumusKeliling;
	
	@Before
	public void setUp() {
		rumusKeliling = new RumusKeliling();
	}
	
	@Test
	@FileParameters("src/test/resources/tblAddKeliling.csv")
	public void testKeliling1 (double panjang, double tinggi, double lebar, double expect) {
		double actual = rumusKeliling.Kolam(panjang, lebar, tinggi);
		assertEquals(expect, actual,0.1);
	}
	
	@Test
	public void testString() {
		String s = "s";
		String t = "t";
		String u = "u";
		double a = Double.parseDouble(s);
		double b = Double.parseDouble(t);
		double c = Double.parseDouble(u);
		double actual = rumusKeliling.Kolam(a, b, c);
		assertEquals(1, actual,0.0);
	}
	
	@Test
	public void testNegatif() {
		double actual = rumusKeliling.Kolam(-2, -3, -(-10));
		assertEquals(20, actual,0.1);
	}
}
