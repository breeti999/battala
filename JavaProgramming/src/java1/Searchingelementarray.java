package java1;

public class Searchingelementarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int search_element=4;
		boolean status=false; //false=notfound   true=found
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
			if(status==false)
			{
			System.out.println("Element not found");
			}
		}

	}


