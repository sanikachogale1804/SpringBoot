package com.learn.Springcore1.Project1;

public class Courses {

	private int CourseId;
	private String CourseName;
	private int CourseFees;
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCourseFees() {
		return CourseFees;
	}
	public void setCourseFees(int courseFees) {
		CourseFees = courseFees;
	}
	@Override
	public String toString() {
		return "Courses [CourseId=" + CourseId + ", CourseName=" + CourseName + ", CourseFees=" + CourseFees + "]";
	}
	public Courses(int courseId, String courseName, int courseFees) {
		super();
		CourseId = courseId;
		CourseName = courseName;
		CourseFees = courseFees;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
