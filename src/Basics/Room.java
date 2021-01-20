package Basics;

import java.util.ArrayList;

public class Room {
	private static int count=0;
	private int id;
	private String name;
	private char type;
	private ArrayList<Course> possibleLabs = new ArrayList <>();
	
	public Room() {
		super();
		this.id = count++;
	}

	public Room(String name, char type) {
		super();
		this.id = count++;
		this.name = name;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public ArrayList<Course> getPossibleLabs() {
		return possibleLabs;
	}

	public void setPossibleLabs(ArrayList<Course> possibleLabs) {
		this.possibleLabs = possibleLabs;
	}

	public static int getCount() {
		return count;
	}
	
	

}
