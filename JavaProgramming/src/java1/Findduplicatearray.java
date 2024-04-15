package java1;

public class Findduplicatearray {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,3,4,5,3,2,3};
		int num=3;
		int count=0;
		for(int value:a)
		{
			if(value==num) {
				count++;
			}
		}
		
System.out.println(count);
	}

}
