package edu.csupomona.cs.cs356.assignment_1;

import java.util.Hashtable;

public interface iClickerService {
	
	void countAnswers();
	
	void displayCorrect(Question question);
	
	void submitAnswers(Hashtable<Integer, Character> table);
	
	void displayQuestion(Question question);
}