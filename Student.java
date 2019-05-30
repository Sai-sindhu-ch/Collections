package Collections;
class Student{
	int num;
	String name;
	String address;
	public  Student(int num,String name,String address) {
		this.num=num;
		this.name=name;
		this.address=address;
	}
	public String toString() {
		return num +" "+ name +" " + address;
 		
 	}
}

