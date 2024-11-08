package com.learn.springcore.Project1;

public class Courses {

	private int CourseId;
	private String CourseName;
	private int CoursePrice;
	
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
	public int getCoursePrice() {
		return CoursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		CoursePrice = coursePrice;
	}
	@Override
	public String toString() {
		return "Courses [CourseId=" + CourseId + ", CourseName=" + CourseName + ", CoursePrice=" + CoursePrice + "]";
	}
	
	
}
