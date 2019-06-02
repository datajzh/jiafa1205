package Bank2;

public class Account {
  private double balance;

public double getBalance() {
	return balance;
}

public Account(double init_balance) {
	super();
	this.balance = balance;
}
//存钱
public void deposit(double amount){
	balance+=amount;
	System.out.println("成功存入："+amount);
	
}
//取钱
public void withdraw(double amount){
	if(amount<balance){
		
		balance-=amount;
		System.out.println("成功取出："+amount);
	}
	if(amount>balance){
		System.out.println("余额不足，取款失败");
	}
}
  
}
