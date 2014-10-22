package edu.csupomona.cs.cs356.assignment_1;
/**
 * CS 356: Object Oriented Programming
 * Professor: Yu Sun
 *
 * Assignment 1
 *
 * <This is the iClickerService interface that has set methods
 * to be implemented in the iClicker class.>
 *
 * David V Luong
 */
import java.util.Hashtable;

public interface iClickerService {
	
	/**
	 * The method counts the total answers selected for each answer choice,
	 * for example A: 15 B: 5 ...etc.
	 */
	void countAnswers(int answers);
	
	/**
	 * The method displays the Student ID, the answer they chose, and whether
	 * the answer is correct or not.
	 */
	void displayCorrect(Question question, int numberOfStudents);
	
	/**
	 * The method accepts a Hashtable as an argument that contains the the 
	 * Student ID's as the key and answers as the value and transfer it into
	 * the Hashtable in the iClicker class.
	 */
	void submitAnswers(Hashtable<Integer, String> table);
	
	/**
	 * The method displays the question and choice of answers.
	 */
	void displayQuestion(Question question);
	
	/**
	 * The method keeps track of how many submissions a student makes.
	 */
	void countSubmissions(int number);
	
	/**
	 * The method displays each student's total number of submissions.
	 */
	void displaySubmissions(int ID);
}