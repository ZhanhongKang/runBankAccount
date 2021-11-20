package runBankAccount;

public class main {
	public main(String [] args){
		double Total = 0;
		BankAccount [] account = new  BankAccount[5];
		account[0] = new BankAccount("00000000",250);  
		account[1] = new SavingAccount("11111111",30000,0.0011,3);
		account[2] = new CheckingAccount("22222222",2000,15,200);
		account[3] = new CheckingAccount("33333333",1000,10,500);
		account[4] = new CheckingAccount("44444444",3000,20,500);   
		//account[2].balanceAfterMonthlyFee();// I tried to call this method, but it doesn't work; /-_-\ ///

		for (int i = 0; i < account.length; i++)
			System.out.println(account[i]);

		for (int x = 0; x <  account.length; x++)
			if(account[x] instanceof CheckingAccount)//check if is checking account
				Total += account[x].getCurrentBalance();
		System.out.println("Total $"+ Total + " in checking account"); 

	} 
}
