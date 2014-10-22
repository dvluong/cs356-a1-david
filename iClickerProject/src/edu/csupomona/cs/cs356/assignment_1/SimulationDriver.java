package edu.csupomona.cs.cs356.assignment_1;

/**
 * CS 356: Object Oriented Programming
 * Professor: Yu Sun
 *
 * Assignment 1
 *
 * <The SimulationDriver calls the Student, Question classes 
 * that sets the question and Student ID. The ID is randomly generated
 * and all the answer submissions submitted by the Student is randomly
 * selected. After storing the student IDs into a Hashtable, the iClicker
 * class is called to use the methods to submit and count the answers as well
 * as keeping track of the Student submissions.>
 *
 * David V Luong
 */
import java.util.ArrayList;
import java.util.Hashtable;

public class SimulationDriver {

	public static void main(String[] args) {
		// Stores the randomly generated IDs into an ArrayList to be stored into a Hashtable
		ArrayList<Student> studentList = new ArrayList<Student>();
		// Generates a random amount of students for the iClicker
		final int numberOfStudents = (int) ((Math.random() * 30) + 1);
		int count = 0;
		for (int a = 0; a < numberOfStudents; a++) {
			studentList.add(new Student((int) ((Math.random() * 9000000) + 1000001)));
		}
		
		int[] studentID = new int[studentList.size()];
		
		for (int a = 0; a < numberOfStudents; a++) {
			studentID[a] = studentList.get(a).getId();
		}

		iClicker clicker = new iClicker(studentID);
		System.out.println("Welcome to the iClicker Simulator.\n");
		
		Question question1 = new Question("1. Who is the CS 356 professor?\n A: Edwin Rodriguez \n B: Yu Sun \n C: Tony Diaz \n D: Lan Yan\n", "B");
		System.out.println(question1.getQuestion());
		// randomly generates a number of selections a student will make
		int randomNumber = (int) ((Math.random() * 20) + 1);
		// random generator for student submissions
		for (int a = 0; a < numberOfStudents; a++) {
			while (true){
				if (randomNumber > 0 && randomNumber <= 5){
					clicker.submitAnswers(random(studentList, numberOfStudents, question1, 4));
					randomNumber--;
					count++;
				} else if (randomNumber > 5 && randomNumber <= 10){
					clicker.submitAnswers(random(studentList, numberOfStudents, question1, 4));
					randomNumber--;
					count++;
				} else if (randomNumber > 10 && randomNumber <= 15){
					clicker.submitAnswers(random(studentList, numberOfStudents, question1, 4));
					randomNumber--;
					count++;
				} else if (randomNumber > 15 && randomNumber <= 20){
					clicker.submitAnswers(random(studentList, numberOfStudents, question1, 4));
					randomNumber--;
					count++;
				} else if(randomNumber == 0){
					clicker.countSubmissions(count);
					clicker.displaySubmissions(studentID[a]);
					break;
				}
			}
			count = 0;
			randomNumber = (int) ((Math.random() * 20) + 1);
		}		
		clicker.displayCorrect(question1, numberOfStudents);
		clicker.countAnswers(4);
		
		Question question2 = new Question("2. How many units can you take per quarter?\n A: 8 \n B: 25 \n C: 6 \n D: 12 \n E: 16 \n", "ABDE");
		System.out.println(question2.getQuestion());
		for (int a = 0; a < numberOfStudents; a++) {
			while (true){
				if (randomNumber > 0 && randomNumber <= 5){
					clicker.submitAnswers(random(studentList, numberOfStudents, question2, 5));
					randomNumber--;
					count++;
				} else if (randomNumber > 5 && randomNumber <= 10){
					clicker.submitAnswers(random(studentList, numberOfStudents, question2, 5));
					randomNumber--;
					count++;
				} else if (randomNumber > 10 && randomNumber <= 15){
					clicker.submitAnswers(random(studentList, numberOfStudents, question2, 5));
					randomNumber--;
					count++;
				} else if (randomNumber > 15 && randomNumber <= 20){
					clicker.submitAnswers(random(studentList, numberOfStudents, question2, 5));
					randomNumber--;
					count++;
				} else if(randomNumber == 0){
					clicker.countSubmissions(count);
					clicker.displaySubmissions(studentID[a]);
					break;
				}
			}
			count = 0;
			randomNumber = (int) ((Math.random() * 20) + 1);
		}		
		clicker.displayCorrect(question2, numberOfStudents);
		clicker.countAnswers(5);
		
		Question question3 = new Question("3. Which is a CS course?\n A: CS 220 \n B: CS 311 \n C: CS 241 \n D: CS 100 \n E: CS 480 \n F: CS 9000", "BCE");
		System.out.println(question3.getQuestion());
		for (int a = 0; a < numberOfStudents; a++) {
			while (true){
				if (randomNumber > 0 && randomNumber <= 5){
					clicker.submitAnswers(random(studentList, numberOfStudents, question3, 6));
					randomNumber--;
					count++;
				} else if (randomNumber > 5 && randomNumber <= 10){
					clicker.submitAnswers(random(studentList, numberOfStudents, question3, 6));
					randomNumber--;
					count++;
				} else if (randomNumber > 10 && randomNumber <= 15){
					clicker.submitAnswers(random(studentList, numberOfStudents, question3, 6));
					randomNumber--;
					count++;
				} else if (randomNumber > 15 && randomNumber <= 20){
					clicker.submitAnswers(random(studentList, numberOfStudents, question3, 6));
					randomNumber--;
					count++;
				} else if(randomNumber == 0){
					clicker.countSubmissions(count);
					clicker.displaySubmissions(studentID[a]);
					break;
				}
			}
			count = 0;
			randomNumber = (int) ((Math.random() * 20) + 1);
		}		
		clicker.displayCorrect(question3, numberOfStudents);
		clicker.countAnswers(6);
	
		Question question4 = new Question("4. What is Rick's last name in The Walking Dead?\n A: Astley \n B: Zaluzec \n C: Sun \n D: Grimes \n E: Sang \n F: Hang \n G: Ma \n ", "D");
		System.out.println(question4.getQuestion());
		for (int a = 0; a < numberOfStudents; a++) {
			while (true){
				if (randomNumber > 0 && randomNumber <= 5){
					clicker.submitAnswers(random(studentList, numberOfStudents, question4, 7));
					randomNumber--;
					count++;
				} else if (randomNumber > 5 && randomNumber <= 10){
					clicker.submitAnswers(random(studentList, numberOfStudents, question4, 7));
					randomNumber--;
					count++;
				} else if (randomNumber > 10 && randomNumber <= 15){
					clicker.submitAnswers(random(studentList, numberOfStudents, question4, 7));
					randomNumber--;
					count++;
				} else if (randomNumber > 15 && randomNumber <= 20){
					clicker.submitAnswers(random(studentList, numberOfStudents, question4, 7));
					randomNumber--;
					count++;
				} else if(randomNumber == 0){
					clicker.countSubmissions(count);
					clicker.displaySubmissions(studentID[a]);
					break;
				}
			}
			count = 0;
			randomNumber = (int) ((Math.random() * 20) + 1);
		}		
		clicker.displayCorrect(question4, numberOfStudents);
		clicker.countAnswers(7);
		Question question5 = new Question("5. Who are Frejlord Champions of League of Legends?\n A: Ashe \n B: Blitzcrank \n C: Teemo \n D: Ahri \n E: Kha'zix \n F: Anivia \n G: Darius \n H: Lissandra\n", "AFH");
		System.out.println(question5.getQuestion());
		for (int a = 0; a < numberOfStudents; a++) {
			while (true){
				if (randomNumber > 0 && randomNumber <= 5){
					clicker.submitAnswers(random(studentList, numberOfStudents, question5, 8));
					randomNumber--;
					count++;
				} else if (randomNumber > 5 && randomNumber <= 10){
					clicker.submitAnswers(random(studentList, numberOfStudents, question5, 8));
					randomNumber--;
					count++;
				} else if (randomNumber > 10 && randomNumber <= 15){
					clicker.submitAnswers(random(studentList, numberOfStudents, question5, 8));
					randomNumber--;
					count++;
				} else if (randomNumber > 15 && randomNumber <= 20){
					clicker.submitAnswers(random(studentList, numberOfStudents, question5, 8));
					randomNumber--;
					count++;
				} else if(randomNumber == 0){
					clicker.countSubmissions(count);
					clicker.displaySubmissions(studentID[a]);
					break;
				}
			}
			count = 0;
			randomNumber = (int) ((Math.random() * 20) + 1);
		}		
		clicker.displayCorrect(question5, numberOfStudents);
		clicker.countAnswers(8);
	
	
	}
	
	// Takes in the student IDs from the ArrayList and stores them into a Hashtable, also
	// checks to see if the question is a single choice or multiple choice
	private static Hashtable<Integer, String> random (ArrayList<Student> studentList, int numberOfStudents, Question question, int numberOfAnswers){
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
		
		for (int a = 0; a < numberOfStudents; a++) {
			if (question.getAnswer().length() == 1){
				studentList.get(a).chooseAnswer(numberOfAnswers);
			} else {
				studentList.get(a).chooseMultiple(numberOfAnswers);
			}
		}
		for (int a = 0; a < numberOfStudents; a++) {
			hash.put(studentList.get(a).getId(), studentList.get(a).answer);
		}
		return hash;
	}
}
