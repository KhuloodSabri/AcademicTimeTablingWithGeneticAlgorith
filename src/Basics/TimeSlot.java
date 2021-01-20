package Basics;

import java.util.ArrayList;

public class TimeSlot {
	private static int count =0;
	private int id;
	private double startTime;
	private double endTime;
	private char courseType;
	private boolean [] days = new boolean[5];
	private static ArrayList<TimeSlot>  coursesTimeSlots= null;
	private static ArrayList<TimeSlot>  labsTimeSlots= null;

	public TimeSlot() {
		super();
		this.id = count++;
	}

	public TimeSlot(double startTime, double endTime, char courseType, boolean[] days) {
		super();
		this.id = count++;
		this.startTime = startTime;
		this.endTime = endTime;
		this.courseType = courseType;
		this.days = days;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getStartTime() {
		return startTime;
	}

	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}

	public double getEndTime() {
		return endTime;
	}

	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}

	public char getCourseType() {
		return courseType;
	}

	public void setCourseType(char courseType) {
		this.courseType = courseType;
	}

	public boolean[] getDays() {
		return days;
	}

	public void setDays(boolean[] days) {
		this.days = days;
	}

	public static int getCount() {
		return count;
	}
	
	public static void generateTimeSlots() {
		boolean SMW []= {true,true,false,true, false};
		boolean TR []= {false,false, true, false, true};
		coursesTimeSlots = new ArrayList<>();
		labsTimeSlots = new ArrayList<>();
		for (int i=8; i<17 ; i++) {
			TimeSlot slot = new TimeSlot (i, i+1, 'c', SMW);
			coursesTimeSlots.add(slot);
		}
		for (double i=8; i<17 ;i+=1.5) {
			TimeSlot slot = new TimeSlot(i, i+1.5, 'c', TR);
			coursesTimeSlots.add(slot);
		}
		TimeSlot labSlot1 = new TimeSlot (2,5, 'l', new boolean[] {true, false,false,false,false} );
		TimeSlot labSlot2 = new TimeSlot (2,5, 'l', new boolean[] {false, true,false,false,false} );
		TimeSlot labSlot3 = new TimeSlot (2,5, 'l', new boolean[] {false, false,false,true,false} );
		labsTimeSlots.add(labSlot1);
		labsTimeSlots.add(labSlot2);
		labsTimeSlots.add(labSlot3);
		
		
		for (int i=8 ; i<=14 ; i+=3) {
			TimeSlot labSlot4 = new TimeSlot (i,i+3, 'l', new boolean[] {false, false,true,false,false} );
			TimeSlot labSlot5 = new TimeSlot (i,i+3, 'l', new boolean[] {false, false,false,false,true} );
			labsTimeSlots.add(labSlot4);
			labsTimeSlots.add(labSlot5);
		}
	}
	
	public static ArrayList<TimeSlot> getCoursesTimeSlots() {
		if (coursesTimeSlots == null) {
			generateTimeSlots();
		}
		return coursesTimeSlots;
		
	}

	public static ArrayList<TimeSlot> getLabsTimeSlots() {
		if (labsTimeSlots == null) {
			generateTimeSlots();
		}
		return labsTimeSlots;
	}
	
	
	

}
