package edu.csupomona.cs.cs356.assignment_1;

/**
 * CS 356: Object Oriented Programming
 * Professor: Yu Sun
 *
 * Assignment 1
 *
 * <The iClicker class contains methods implemented from the
 * iClickerService interface.>
 *
 * David V Luong
 */
import java.util.Hashtable;

public class iClicker implements iClickerService {

	Hashtable<Integer, String> table = new Hashtable<Integer, String>();

	private int[] IDs;
	
	private int numberOfSubmissions = 0;
	
	public iClicker(int[] IDs) {
		this.IDs = IDs;
	}

	public void countAnswers(int answers) {
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		int F = 0;
		int G = 0;
		int H = 0;
		int I = 0;
		

		for (int a = 0; a < IDs.length; a++) {
			for (int b = 0; b < table.get(IDs[a]).length(); b++){
				if (table.get(IDs[a]).charAt(b) == 'A') {
					A++;
				}
				if (table.get(IDs[a]).charAt(b) == 'B') {
					B++;
				}
				if (table.get(IDs[a]).charAt(b) == 'C') {
					C++;
				}
				if (table.get(IDs[a]).charAt(b) == 'D') {
					D++;
				}
				if (table.get(IDs[a]).charAt(b) == 'E') {
					E++;
				}
				if (table.get(IDs[a]).charAt(b) == 'F') {
					F++;
				}
				if (table.get(IDs[a]).charAt(b) == 'G') {
					G++;
				}
				if (table.get(IDs[a]).charAt(b) == 'H') {
					H++;
				}
				if (table.get(IDs[a]).charAt(b) == 'I'){
					I++;
				}
			}
		}
		if (answers == 4){
			System.out.println("Total answers: ");
			System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D + "\n");
		} else if (answers == 5){
			System.out.println("Total answers: ");
			System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D + "\nE: " + E + "\n");
		} else if (answers == 6){
			System.out.println("Total answers: ");
			System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D + "\nE: " + E + "\nF: " + F + "\n");
		} else if (answers == 7){
			System.out.println("Total answers: ");
			System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D +  "\nE:" + E + "\nF: " + F + "\nG: " + G + "\n");
		} else if (answers == 8){
			System.out.println("Total answers: ");
			System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D + "\nE: " + E + "\nF: " + F + "\nG: " + G + "\nH: " + H + "\n");
		} else if (answers == 9){
			System.out.println("Total answers: ");
			System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D + "\nE: " + E + "\nF: " + F + "\nG: " + G + "\nH: " + H + "\nG: " + G + "\nI: " + I + "\n");
		} 
	}

	public void displayCorrect(Question question, int numberOfStudents) {
		int correct = 0;
		int incorrect = 0;
		for (int a = 0; a < numberOfStudents; a++) {
			if (question.getAnswer().equals(table.get(IDs[a]))) {
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

	public void submitAnswers(Hashtable<Integer, String> studentAnswers) {
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