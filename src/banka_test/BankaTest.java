package banka_test;

import org.testng.Assert;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

//    paket     ime klase koja je importovana
import banka_kod.Account;
import banka_kod.Bank;

public class BankaTest {
	//ovde smo samo definisali konstruktor kako bi vazio za celu nasu klasu BankaTest
	
	Bank mobi;
	
	@BeforeClass
	//dobro za delove koda koji treba samo jednom da se definisu i posle samo
	//da se koriste
	public void konstruktor() {
		mobi = new Bank();
	}
	
  @Test(priority = 3)
  public void testOpen() {
	 mobi = new Bank();
	  int max =5;
	  Account racuni [] = new Account[max];
	  for(int i = 0;i < max;i++) {
		  //stavljamo plus i da bi se imena razlikovala
		  // da bi bilo jovana0,1,2,3
		  //racuni[i] je namam ustavri return account iz bank
		  racuni[i] = mobi.openAccount("jovana"+i);
		  //metoda je tipa return,tj vraca neku vrednost(open accounmt)
		  
		  Assert.assertEquals(mobi.getAccount(racuni[i].getNumber()), racuni[i]);
	  }
  }
  
  @Test(priority = 2)
  public void testUplata() {
	  Double uplata = 1500d;
	  Account a1 = mobi.openAccount("Jovana");
	  Double stanjeNakonUplate = a1.getAmount() + uplata;
	  mobi.payInMoney(a1.getNumber(), uplata);
	  Assert.assertEquals(a1.getAmount(),stanjeNakonUplate); 
  }
  
  @Test(priority = 1)
  public void testTransfer() {
	  Account a1 = mobi.openAccount("Dragoljub");
	  Account a2 = mobi.openAccount("Djorjde");
	  // int prenos = 1000d,onda bi u mobi metodi umesto 1000d pisati samo ime ove promenljive
	  a1.setAmount(10000d);
	  //a2 je broj racuna sa kog podizemo
	  mobi.transferMoney(a1.getNumber(), a2.getNumber(), 1000d);
	  System.out.println(a1.getAmount());
	  System.out.println(a2.getAmount());
	  SoftAssert sa = new SoftAssert();
	  //proveravamo sad vrednosti racuna na oba racuna
	  sa.assertEquals(a1.getAmount(), 9000d);
	  sa.assertEquals(a2.getAmount(), 1000d);
	  sa.assertAll();
	  
	  
  }
}
