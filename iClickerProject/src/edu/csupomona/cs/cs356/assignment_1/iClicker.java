package edu.csupomona.cs.cs356.assignment_1;

import java.util.Hashtable;

public class iClicker implements iClickerService {

	Hashtable<Integer, Character> table = new Hashtable<Integer, Character>();

	private int[] IDs;
	private int numberOfSubmissions = 0;
	public iClicker(int[] IDs) {
		this.IDs = IDs;
	}

	public void countAnswers() {
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;

		for (int a = 0; a < IDs.length; a++) {
			if (table.get(IDs[a]) == 'A') {
				A++;
			}
			if (table.get(IDs[a]) == 'B') {
				B++;
			}
			if (table.get(IDs[a]) == 'C') {
				C++;
			}
			if (table.get(IDs[a]) == 'D') {
				D++;
			}
		}
		System.out.println("Total answers: ");
		System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D
				+ "\n");
	}

	public void displayCorrect(Question question, int numberOfStudents) {
		int correct = 0;
		int incorrect = 0;
		for (int a = 0; a < numberOfStudents; a++) {
			if (question.getAnswer() == table.get(IDs[a])) {
				System.out.println("Student" + " " + (a + 1) + ": " + IDs[a] + " chose " + table.get(IDs[a]) + ". Correct.\n");
				correct++;
			} else {
				System.out.println("Student" + " " + (a + 1) + ": ID " + IDs[a] + " chose " + table.get(IDs[a]) + ". Incorrect.\n");
				incorrect++;
			}
		}
	
		System.out.println("Total amount of correct answers: " + correct + "\n");
		System.out.println("Total amount of incorrect answers: " + incorrect + "\n");
	}

	public void submitAnswers(Hashtable<Integer, Character> studentAnswers) {
		this.table = studentAnswers;
	}

	public void displayQuestion(Question question) {
		System.out.println(question.getQuestion());
	}

	public void countSubmissions(int number) {
		this.numberOfSubmissions = number;
	}


	public void displaySubmissions(int ID) {
		if (numberOfSubmissions == 1){
			System.out.println("Student: " + ID + " submitted: " + numberOfSubmissions + " time.\n");
		} else {
			System.out.println("Student: " + ID + " submitted: " + numberOfSubmissions + " times.\n");
		}
	}

}
