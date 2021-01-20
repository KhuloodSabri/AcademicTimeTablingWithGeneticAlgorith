package Basics;

public class Value {
	private Doctor doctor;
	private TimeSlot time;
	private Room room;
	
	public Value(Doctor doctor, TimeSlot time, Room room) {
		super();
		this.doctor = doctor;
		this.time = time;
		this.room = room;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public TimeSlot getTime() {
		return time;
	}
	public void setTime(TimeSlot time) {
		this.time = time;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
}
