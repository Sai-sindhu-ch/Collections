package Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListStudent {
	public static void main(String args[]) {
		ArrayList<StudentClass>ll = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of objects");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter number");
			int num=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter address");
			String address=sc.next();
			StudentClass s = new StudentClass(num,name,address);
			ll.add(s);
		}
		System.out.println(ll);
		
	}
}

