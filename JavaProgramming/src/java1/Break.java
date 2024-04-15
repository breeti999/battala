package java1;

public class Break {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)  // If it's true only break will works
			{
				break; 
				// continue;  it will continue 
			}
			System.out.println(i);
		}

	}

}
