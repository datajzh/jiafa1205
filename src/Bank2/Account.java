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
//��Ǯ
public void deposit(double amount){
	balance+=amount;
	System.out.println("�ɹ����룺"+amount);
	
}
//ȡǮ
public void withdraw(double amount){
	if(amount<balance){
		
		balance-=amount;
		System.out.println("�ɹ�ȡ����"+amount);
	}
	if(amount>balance){
		System.out.println("���㣬ȡ��ʧ��");
	}
}
  
}
