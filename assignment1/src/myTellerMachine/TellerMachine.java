package myTellerMachine;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class TellerMachine {
    static float balance = 3280F;
	static String pw = "1234";
	static SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		interface1();
		interface2();

		Scanner keyboard = new Scanner(System.in);
		String password;
		
		boolean flag = false;
		
		for(int i = 3; i >= 0; i--) {
			password = keyboard.next();
			if(password.equals(pw)) {
				flag = !flag;
				break;
			} else if(i == 0) {
				finalWrongPass();
				break;
			} else {
			    System.out.println("|" + alignR("             You Have only " + i + " Chance", 50) + "|");
				wrong();
			}
		}
		
		while(flag) {
			mainMenu();
			int item = keyboard.nextInt();

			switch(item) {
			case 1:
				balance(balance);
				break;
			case 2:
				quickCash(balance);
				break;
			case 3:
			    System.out.println("|" + alignR("", 50) + "|");
			    System.out.println("|" + alignR("       How Much Do You Want To Withdraw?", 50) + "|");
			    System.out.println("|" + alignR("", 50) + "|");
				System.out.println("+--------------------------------------------------+");
				Scanner s = new Scanner(System.in);
				float amount = s.nextFloat();
				withdraw(amount,balance);
				break;
			case 4:
				interface3();
				flag = !flag;
				break;
				
				default: 
					wrong();
					break;
			}
			}
	}
	
	public static String alignR(String str, int min_length) {
		String s = "%-" + (min_length < 1 ? 1 : min_length) + "s";
		return String.format(s, str);
	}
			
	public static void interface1() {
		System.out.println("+--------------------------------------------------+");
		System.out.println("|" + alignR("  Welcome", 50) + "|");
		System.out.println("|" + alignR("               To", 50) + "|");
		System.out.println("|" + alignR("                          Bank Of Northeastern  ", 50) + "|");
		System.out.println("|" + alignR("                          " + time.format(new Date()), 50) + "|");
		System.out.println("+--------------------------------------------------+");
	}
	
	public static void interface2() {
		System.out.println("|" + alignR("", 50) + "|");
		System.out.println("|" + alignR("", 50) + "|");
		System.out.println("|" + alignR("         Please Enter Your 4 digits PIN", 50) + "|");
		System.out.println("|" + alignR("", 50) + "|");
		System.out.println("|" + alignR("", 50) + "|");
		System.out.println("|" + alignR("", 50) + "|");
		System.out.println("|" + alignR("", 50) + "|");
        System.out.println("+--------------------------------------------------+");
	}
	
	public static void interface3() {
		System.out.println("|" + alignR("  Thank You For Using Our Services", 50) + "|");
		System.out.println("|" + alignR("       See You!", 50) + "|");
		System.out.println("|" + alignR("                          Bank Of Northeastern  ", 50) + "|");
		System.out.println("|" + alignR("                          " + time.format(new Date()), 50) + "|");
		System.out.println("+--------------------------------------------------+");
	}

	
	public static void wrong() {
		System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("           Wrong !! Please Try Again!!", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
		System.out.println("+--------------------------------------------------+");
	}
	
	public static void finalWrongPass() {
		System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("               You Have No Chance", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
		System.out.println("+--------------------------------------------------+");
	}

	
	public static void mainMenu() {
		System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("   Enter The Number From 1-4 To Choose Service", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("               1.   Balance", 50) + "|");
	    System.out.println("|" + alignR("               2.   Quick Cash", 50) + "|");
	    System.out.println("|" + alignR("               3.   Withdraw", 50) + "|");
	    System.out.println("|" + alignR("               4.   Quit", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
		System.out.println("+--------------------------------------------------+");
	}
	
	public static void balance(float balance) {
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("            Balance:       $ " + balance, 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
		System.out.println("+--------------------------------------------------+");

	}
	
	public static void quickCash(float balance) {
		System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("Enter The Number From 1-4 To Quich Cash", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("               1.   $ 50", 50) + "|");
	    System.out.println("|" + alignR("               2.   $ 100", 50) + "|");
	    System.out.println("|" + alignR("               3.   $ 200", 50) + "|");
	    System.out.println("|" + alignR("               4.   $ 500", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
		System.out.println("+--------------------------------------------------+");
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		switch(i) {
		case 1: 
			withdraw(50,balance);
			break;
		case 2:
		    withdraw(100,balance);
			break;
		case 3:
			withdraw(200,balance);
			break;
		case 4:
		    withdraw(500,balance);
			break;
		    
		    default : break;
		}
	}
	
	public static void withdraw(float amount, float balance) {
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
	    System.out.println("|" + alignR("", 50) + "|");
		System.out.println("+--------------------------------------------------+");
		if (amount <= balance && amount > 0 && amount % 5 == 0) {
			balance -= amount;
			TellerMachine.balance = (float)balance;
			int a=0,b=0,c=0;
			a = (int)  amount / 20;
			amount = (int) amount - a * 20;
			if(amount != 0) {
				b = (int) amount / 10;
				amount = (int) amount - b * 10;
				if(amount != 0) {
					c = (int) amount / 5;
				}
			}
 		    System.out.println("|" + alignR("", 50) + "|");
			System.out.println("|" + alignR("        You've Got $ 20 * " + a, 50) + "|");
			System.out.println("|" + alignR("        You've Got $ 10 * " + b, 50) + "|");
			System.out.println("|" + alignR("        You've Got $  5 * " + c, 50) + "|");
			System.out.println("|" + alignR("        Now Your Balance Is " + balance, 50) + "|");
		    System.out.println("|" + alignR("", 50) + "|");
			System.out.println("+--------------------------------------------------+");
		} else wrong();
	}
}
