import java.util.Scanner;
class ReverseArray{
	public static void main(String argc[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no.of elements ::");
		int n=sc.nextInt();
		int arr[]=new int[n];

        for(int i=0;i< n;i++)
		{
			arr[i]=sc.nextInt();

			System.out.println("elements =" +arr[i]);
		}

		System.out.println();

        System.out.println("Reverse array ::");

		for(int i=n-1;i>=0;i--)
		{
			System.out.println(" reverse elements =" +arr[i]);
		}
	}
} 