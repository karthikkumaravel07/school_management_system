package school_management_system;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		Teacher t1=new Teacher(1,"t1",500);
		Teacher t2=new Teacher(2,"t2",700);
		Teacher t3=new Teacher(3,"t3",600);
		List<Teacher> tl=new ArrayList<>();
		tl.add(t1); 
		tl.add(t2);
		tl.add(t3);
		
		Student s1=new Student(1,"s1",4);
		Student s2=new Student(2,"s2",12);
		Student s3=new Student(3,"s3",5);
		List<Student> sl=new ArrayList<>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		
		School psbb=new School(tl,sl);
		s1.payFees(5000);
		s2.payFees(6000);
		
		
		t1.receiveSalary(t1.getSalary());
		t2.receiveSalary(t2.getSalary());
		
		
		
		System.out.println(psbb.getTotalMoneyEanred());
		System.out.println(t1);
		
		
		
	}

}
