package Bank2;

public class TestBank {
    //���һ�����ж���
	public static void main(String[] args) {
		Bank bn=new Bank();
		bn.addCustomer("־��", "��");
		bn.addCustomer("��", "֣");
		bn.addCustomer("����", "��");
		bn.getCustomer(0).setAccount(new Account(2000));
		bn.getCustomer(1).setAccount(new Account(5000));
		
	}
	
	
}
