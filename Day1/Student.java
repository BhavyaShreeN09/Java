package day1;

public class Student 
	{
	    int id;
	    String name;

	    Student()
	    {
	        id = 1;
	        name = "Bhavya";
	    }

	    Student(int a, String b)
	    {
	        id = a;
	        name = b;
	    }

	    void display()
	    {
	        System.out.println(id + " " + name);
	    }

	    public static void main(String args[])
	    {
	        Student s1 = new Student();
	        Student s2 = new Student(2, "Ramya");

	        s1.display();
	        s2.display();
	    }
	}
