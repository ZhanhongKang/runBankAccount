package runBankAccount;

class SavingAccount extends BankAccount{
	private double interestRate;
	private int month;
	//constructor
	public SavingAccount(){
		interestRate = 0;
	}

	public SavingAccount(String AccountNum, double CurrentBalance, double InterestRate,int Month ){
		super(AccountNum,CurrentBalance);
		interestRate = InterestRate;
		month = Month;
	}

	//accessor
	public double getInterestRate(){
		return interestRate;
	}

	public int getMonth(){
		return month;
	}

	//mutator   
	public void setInterestRate(double theInterestRate){
		if (theInterestRate > 0)
			interestRate = theInterestRate;
	}

	public void setMonth(int theMonth){
		month = theMonth;
	}  

	public double getAfterMonth(){//count interest enrned      
		return month*currentBalance*interestRate;
	}

	public String toString(){
		return super.toString()+  ", Interest Rate: " + getInterestRate()+
				", You will earn: $"+getAfterMonth()+" interest after "+month+" month";
	} 
}