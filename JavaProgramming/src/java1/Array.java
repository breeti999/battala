package java1;

public class Array {

	public static void main(String[] args) {
		
     	int a[]= {1,2,3,4,5};
		System.out.println(a.length);
		System.out.println(a[3]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
     	
     	//or
			
//			for(int x:a)  // for each iterator useage print intial to max compare to normal for loop
//			{
//				System.out.println(x);
//			}
		}

	}

