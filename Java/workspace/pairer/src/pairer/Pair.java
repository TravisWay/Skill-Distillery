package pairer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pair {

	Scanner input = new Scanner(System.in);
	Map<String, StringBuilder> done = new HashMap<>();
	List<String> students = new ArrayList<>();
	List<String> topics = new ArrayList<>();
	

	public static void main(String[] args) {
		Pair test = new Pair();
		test.addStudents();
		test.addTopics();
		test.Printstudents();
		
		
		
	}

	public void addStudents() {
		System.out.println("Enter the students you have followed by a space");

		String[] studentList = input.nextLine().split(" ");
		for (String string : studentList) {
			students.add(string);
		}

	}

	public void Printstudents() {
	//	for (String string : students) {
	//		System.out.println(string);
	//	}
		//for (String string : topics) {
		//	System.out.println(string);
	//	}
		int topicsizer = topics.size() / students.size();
		//StringBuilder [] tt = addTopics();
		while (students.size() > 0) {
			System.out.println();
			String student = (students.remove((int) (Math.random() * students.size())));
			System.out.print(student);
			int i = topicsizer;
			int counter = 0;
			while(i>0){
				System.out.print(topics.remove(counter));
				//System.out.print("p");
				
				
			}
			
		
		}
		
		
		
	}

	public void addTopics() {
		System.out.println("Enter the topics you have followed by a space");

		String[] topic = input.nextLine().split(" ");
		for (String string : topic) {
			topics.add(string);
		}
//		StringBuilder[] topic2 = new StringBuilder[topic.length];
		//int topicsizer = topics.size() / students.size();
//		int j = 0;
//		while (topics.size() > 0) {
//			StringBuilder trash = new StringBuilder();
//			for (int i = 0; i < topicsizer; i++) {
//				String trash2 = topics.remove(i);
//				trash.append(trash2);
//			}
//			topic2[(topic.length - (topic.length - j))] = trash;
//			j++;
//		}

		//return topic2;

		}

	}

