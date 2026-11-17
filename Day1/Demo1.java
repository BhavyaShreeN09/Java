package day1;
//with parameters and with return type
public class Demo1 {
	int add(int a,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		int result=obj.add(10,20);
		System.out.println(result);
	}

}
