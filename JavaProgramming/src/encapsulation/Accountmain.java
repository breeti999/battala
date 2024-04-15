package encapsulation;

public class Accountmain {

	public static void main(String[] args) {
		
		Account acc= new Account();
		
//		acc.accno=100;
//		acc.name="sweeti";
//		acc.amount=10000000;      //these all are private in Account class, we can't directly access the variables because variables are private
		
		acc.setAccno(101);
		int ac=acc.getAccno();
		System.out.println(ac);
		
		acc.setName("sweeti");
		String ac1=acc.getName();
		System.out.println(ac1);
		
		acc.setAmount(100000);
		double ac2=acc.getAmount();
		System.out.println(ac2);
		
		
	}

}
