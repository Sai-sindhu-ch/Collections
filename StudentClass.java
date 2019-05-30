package Collections;

import java.util.Scanner;

public class StudentClass {
 int num;
 String name;
 String address;
/* //Scanner sc=new Scanner(System.in);
	//int n;
	System.out.println("enter number of objects");
	n=sc.nextInt();
	System.out.println("enter number");
	num=sc.nextInt();
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter address");
	address=s.next();*/
 public StudentClass(int num,String name,String address) {
	 this.num=num;
	 this.name=name;
	 this.address=address;
 }
 	public String toString() {
		return address+name+num;
 	}
//public int getNum() {
//return num;
//}
// public void setNum(int num) {
	// this.num=10;
// }
// public String getName() {
	// return name;
// }
//public void setName(String name) {
// this.name="nnn";
// }
// public String getAddress() {
//	 return address;
// }
// public void setAddress(String Address) {
//	 this.address="kk";
// }
}
