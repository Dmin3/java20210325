package p15.lecture.sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04List {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("java", 100));
		list.add(new Student("spring", 200));
		list.add(new Student("servlet", 150));
		list.add(new Student("jsp", 70));
		list.add(new Student("html", 90));
		list.add(new Student("css", 170));
		
		Student max =  maxScore(list);
		System.out.println(max.getName() + ":" + max.getScore());
		
		int sum = sumScore(list);
		System.out.println(sum);
	}

	private static int sumScore(List<Student> list) {
		int sum = 0;
		
		for(Student s : list) {
			sum += s.getScore();
		}
		return sum;
	}

	private static Student maxScore(List<Student> list) {
		Student s = null;
		int max = Integer.MIN_VALUE;
		for(Student str : list) {
			if(str.getScore() > max) {
				s = str;
				max = str.getScore();
			}
		}
		return s;
	}

	
	
	}
	
	
	


class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}
