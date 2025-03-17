import java.util.*;
public class Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r;
		int Ar;
		System.out.println("Enter the Radius:");
		r = sc.nextInt();
		Ar = (3.14)*r*r;
		System.out.println("Area of Circle:"+Ar);
	}
}
