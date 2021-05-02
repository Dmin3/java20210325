package p13.textbook.s130601;

import java.util.Arrays;

import p06.textbook.s061101.Person;
import p07.textbook.s070301.Student;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
			
	}


public static void registerCourseStudent( Course<? extends Student> course ) {
	System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
}

public static void registerCourseWorker( Course<? super Worker> course ) {
	System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
}

public static void main(String[] args) {
	Course<Person> personCourse = new Course<>("일반인과정", 5);
	personCourse.add(new Person("일반인"));
	personCourse.add(new Worker("직장인"));
}
}
