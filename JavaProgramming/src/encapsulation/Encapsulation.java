package encapsulation;

public class Encapsulation {
	
	private int accno;
	private String name;
	private double amount;
	
	
	void setAccno(int accno)
	{
		this.accno = accno; // class variable = local variable
	}
	int  getAccno()
	{
		return accno;
	}

	public static void main(String[] args) {
		
		Account acc= new Account();

		acc.setAccno(222);
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
