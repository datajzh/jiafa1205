package Bank2;

public class TestBank {
    //添加一个银行对象
	public static void main(String[] args) {
		Bank bn=new Bank();
		bn.addCustomer("志华", "蒋");
		bn.addCustomer("慧", "郑");
		bn.addCustomer("福燕", "蒋");
		bn.getCustomer(0).setAccount(new Account(2000));
		bn.getCustomer(1).setAccount(new Account(5000));
		
	}
	
	
}
