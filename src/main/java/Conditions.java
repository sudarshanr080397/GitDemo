
public class Conditions {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		for(int b:a)
		{
			if(b%2==0)
			{
				System.out.println(b+" is divisible by 2");
			}
			else
			{
				System.out.println(b+" is not divisible by 2");
			}
		}
	}

}
