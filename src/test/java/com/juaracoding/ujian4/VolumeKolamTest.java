package com.juaracoding.ujian4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class VolumeKolamTest {

	RumusVolume rumusVolume;
	@Before
	public void setUp() {
		rumusVolume = new RumusVolume();
	}
	
	@Test
	@FileParameters("src/test/resources/tblAddVolume.csv")
	public void testVolume1 (double panjang, double lebar, double tinggi, double expect) {
		double actual = rumusVolume.Volume(panjang, lebar, tinggi);
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
		double actual = rumusVolume.Volume(a, b, c);
		assertEquals(1, actual,0.0);
	}
	
	@Test
	public void testNegatif() {
		double actual = rumusVolume.Volume(-2, -3, -(-1));
		assertEquals(6, actual,0.1);
	}
}
