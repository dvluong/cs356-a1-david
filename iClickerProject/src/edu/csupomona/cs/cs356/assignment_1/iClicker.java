package edu.csupomona.cs.cs356.assignment_1;

import java.util.Hashtable;

public class iClicker implements iClickerService {

	Hashtable<Integer, Character> table = new Hashtable<Integer, Character>();

	int[] IDs;

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
		System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D
				+ "\n");
	}

	public void displayCorrect(Question question) {
		for (int a = 0; a < 4; a++) {
			if (question.getAnswer() == table.get(IDs[a])) {
				System.out.println("Student: " + IDs[a] + " chose "
						+ table.get(IDs[a]) + ". Correct.\n");
			} else {
				System.out.println("Student: " + IDs[a] + " chose "
						+ table.get(IDs[a]) + ". Incorrect.\n");
			}

		}
	}

	public void submitAnswers(Hashtable<Integer, Character> studentAnswers) {
		this.table = studentAnswers;
	}

	public void displayQuestion(Question question) {
		System.out.println(question.getQuestion());
	}

}