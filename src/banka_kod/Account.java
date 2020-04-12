package banka_kod;

import java.util.UUID;
public class Account {
	private String number;
	private String name;
	private Double amount;

	public Account(String name, String number) {
		this.number = number;
		this.name = name;
		//na kraju d zbog double promenljive
		//moramo opet da promenimo na 0 da bi on vration 0 u accountTestu
		this.amount = 0d;
	}
	//ovaj kod generise random broj i prebacuje tu vrednost u string
	
	public Account(String name) {
		//rec this poziva konstruktor iz ove metode,tj 
		//u nasem slucaju poziva konstruktor
		//public Account(String name, String number) 
		//ova druga vrednost iza zareza se vraca u number promenljivu
		//zato sto je tako def konstruktor
		this(name, UUID.randomUUID().toString());
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return String.format("%s %s %.2f", number, name, amount);
	}
}
