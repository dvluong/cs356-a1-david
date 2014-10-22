package edu.csupomona.cs.cs356.assignment_1;
/**
 * CS 356: Object Oriented Programming
 * Professor: Yu Sun
 *
 * Assignment 1
 *
 * <The Question class as a constructor that accepts a question and an answer
 * and contains accessor methods.>
 *
 * David V Luong
 */
public class Question {
	private String question;
	private String answer;
	
	public Question(String question, String answer){
		this.setQuestion(question);
		this.setAnswer(answer);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
