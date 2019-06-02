package Bank2;

public class Bank {
  private Customer[] customers;
  private int numberOfCustomer;
  public Bank() {
	customers=new Customer[10];
  }
  public void addCustomer(String f,String l){
	  if(numberOfCustomer<customers.length){
	  Customer cus=new Customer(f, l);
	  customers[numberOfCustomer++]=cus;
	  }else{
		  System.out.println("银行客户已满，无法添加");
	  }
  }
  public int getNumberOfCustomers(){
	return numberOfCustomer;
	  
  }
  public Customer getCustomer(int index){
	if(index>=0 && index<numberOfCustomer){
		return customers[index];
	}
	  
	  
	  return null;
	  
  }
}
