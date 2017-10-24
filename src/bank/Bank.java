/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;
 import java.util.Scanner;
 import java.text.NumberFormat;
/**
 * A bank where accounts can be opened and customers can 
 * make transactions.
 */
 public class Bank {

	public static void main(String[] args) {
		Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println(munozAccount);
		
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));	
	}
}
