package bean;

import java.util.Scanner;

public class Student {
	private int studentId;
    private String name;
    private double theoryScore;
    private double practiceScore;

    public Student() {
    }

    // Parameterized constructor
    public Student(int studentId, String name, double theoryScore, double practiceScore) {
        this.studentId = studentId;
        this.name = name;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(double theoryScore) {
        this.theoryScore = theoryScore;
    }

    public double getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(double practiceScore) {
        this.practiceScore = practiceScore;
    }

    // Calculate average score
    public double calculateAverageScore() {
        return (theoryScore + practiceScore) / 2;
    }

    // toString method
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Theory Score: " + theoryScore + ", Practice Score: " + practiceScore + ", Average Score: " + calculateAverageScore();
    }
}