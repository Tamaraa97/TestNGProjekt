package banka_test;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import banka_kod.Account;

public class Account_Test {
	
	
	
	@Test
	public void testKonstruktor() {
		String ime = "jovana";
		String broj = "637437383";
		
		Account racun = new Account(ime,broj);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getName(), ime);
		sa.assertEquals(racun.getNumber(), broj);
		sa.assertEquals(racun.getAmount(), 0.0);
		sa.assertAll();	
	}
	
	@Test
	public void testNumber() {
		//proveravali smo metodu UUID da li bira nasumicno brojeve ispostavilo se da radi
		Account[] racuni = new Account[100];
		for(int i=0;i<racuni.length;i++) {
			racuni[i]=new Account("tamara");
		}
		/* racuni={jovana,72283882;jovana,833838383;jovana,287829292; 
		 * i to smo uradili 29227271819 puta
		 * i to je sad nas niz*/
		SoftAssert sa = new SoftAssert();
		for(int i=0;i<racuni.length;i++) {
			String broj = racuni[i].getNumber();
			//dodajemo i+1 da ne bi uvek uzimao samo prvi broj niza a mi ih imamo 100000 zato dodajemo +1
			//da bi uvek uzeo nov clan niza
			for(int j = i+1;j<racuni.length;j++) {
				//provreravamo da li su ova dva broja razlicita
				//               72283882     833838383
				sa.assertNotEquals(broj, racuni[j].getName());
			}
		}
		sa.assertAll();
	}

	@Test
	public void testGetterSetter() {
		System.out.println("Pokreni @Test testGetterSetter");
		Double amount = 1726228d;
		Account amount1 = new Account(null);
		SoftAssert sa = new SoftAssert();
		amount1.setAmount(amount);
		sa.assertEquals(amount1.getAmount(),amount);
		sa.assertAll();	
	}
	
	@Test
	public void testToString() {
		String ime = "jovana";
		String broj = "637437383";
		Account acc = new Account(broj,ime);
		String ocekivano = "ime, broj";
		Assert.assertEquals(ocekivano, acc.toString());
		
	
	}
}
