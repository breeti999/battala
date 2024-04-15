package java1;

public class Twodimensinalarray {

	public static void main(String[] args) {
		//declaration
		int a[][] = { {1,2}, {3,4}, {5,6} };
		// find size of array
		System.out.println(" length of row :" +a.length);
		System.out.println(" Length of coloumn : " +a[0].length);
		// read single value from array
		System.out.println(a[2][1]);
		
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]);
			}
			System.out.println();// because of space
		}

	
	
	// enhanced loop
	
//	for(int arr[]:a)
//	{
//		for(int x:arr)
//		{
//			System.out.println(x);
//		}
//	}
//
    }
	}
