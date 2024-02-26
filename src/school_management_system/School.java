package school_management_system;
import java.util.*;
public class School {
   private List<Teacher> teachers;
   private List<Student> students;
   private static int totalMoneyEarned;
   private static int totalMoneySpent;
   
   public School(List<Teacher> teachers,List<Student> students) {
	   this.teachers = teachers;
	   this.students=students;
	   totalMoneyEarned=0;
	   totalMoneySpent=0;
   }

public List<Teacher> getTeachers() {
	return teachers;
}

public void addTeacher(Teacher teacher) {
	teachers.add(teacher);
}

public List<Student> getStudents() {
	return students;
}

public void addStudent(Student student) {
	students.add(student);
}

public int getTotalMoneyEanred() {
	return totalMoneyEarned;
}

public static  void updateTotalMoneyEanred(int MoneyEanred) {
	totalMoneyEarned += MoneyEanred;
}

public int getTotalMoneySpent() {
	return totalMoneySpent;
}

public static void updateTotalMoneySpent(int MoneySpent) {
	totalMoneyEarned -= MoneySpent;
}
   
   
   
}
