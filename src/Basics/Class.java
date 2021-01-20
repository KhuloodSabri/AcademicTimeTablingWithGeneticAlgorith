package Basics;

public class Class {
	private Course course;
	private Value value;
	private int section;
	
	public Class(Course course, int section) {
		super();
		this.course = course;
		this.section = section;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	
	
}
