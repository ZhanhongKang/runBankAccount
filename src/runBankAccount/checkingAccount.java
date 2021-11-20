package runBankAccount;

class CheckingAccount extends BankAccount{
	private double monthFee;
	private int minBalance;

	//constructor
	public CheckingAccount(){
		monthFee = 0;
		minBalance = 200;
	}

	public CheckingAccount(String AccountNum, double CurrentBalance, double MonthFee, int MinBalance){
		super(AccountNum,CurrentBalance);
		monthFee = MonthFee;
		minBalance = MinBalance;
	}

	//accessor
	public double getmonthFee(){
		return monthFee;
	}

	public int getminBalance(){
		return minBalance;
	}

	//mutator
	public void setMonthFee(double theMonthFee){
		if (theMonthFee > 0)
			monthFee = theMonthFee;
	}

	public void setMinBalance(int theMinBalance){
		minBalance = theMinBalance;
	}

	public void withdraw(double theWithdraw){
		if(currentBalance - theWithdraw < minBalance)
			System.out.println("can't withdraw"+
					"\nyour current balance is: $"+currentBalance);
		else
			currentBalance -= theWithdraw;
	}

	public void balanceAfterMonthlyFee(int m){// don't know how to call it in main funtion;
		double count;
		count = m*monthFee;
		if((currentBalance-count)>=minBalance)
			currentBalance-=count;
		else
			System.out.println("you don't have enough money in your Bank Account, please deposit ASAP!!!");
	}


	public String toString(){
		return super.toString() +" Month Fee: $" + getmonthFee()+
				", Minimum Balance: $" +getminBalance();
	}
}
