package runBankAccount;

class BankAccount{
	public String accountNum;
	public double currentBalance;

	//constructor 
	public BankAccount(){
		accountNum = "";
		currentBalance = 0;
	}
	public BankAccount(String AccountNum,double CurrentBalance){
		accountNum = AccountNum;
		currentBalance = CurrentBalance;
	}
	//accessor 
	public String getAccountNum(){
		return accountNum;
	}

	public double getCurrentBalance(){
		return currentBalance;
	}

	//methods 
	public void setAccountNum(String theAccountNum){
		accountNum = theAccountNum;
	}
	public void setCurrentBalance(double theCurrentBalance){
		currentBalance = theCurrentBalance;
	}
	public void withdraw(double theWithdraw){
		currentBalance -= theWithdraw;
	}
	public void deposit(double theDeposit){
		currentBalance += theDeposit;
	}

	public String toString(){
		return "Bank Account: " + getAccountNum()+ 
				", Current Balance: $"  + getCurrentBalance();
	}  
}