package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import Services.ReadFiles;

public class Chromosome {
	public static int headers[] = new int[ReadFiles.numOfSections];
	public int[] chromosome = new int[ReadFiles.numOfSections * 3];

	public static void initializeHeader() {
		int variableIndex = 0;
		for (int i = 0; i < ReadFiles.courses.size(); i++) {
			Course course = ReadFiles.courses.get(i);
			for (int j = 0; j < course.getNumOfSections(); j++) {
				headers[variableIndex++] = course.getId();
			}
		}
		headers = RandomizeArray(headers);

	}

	public static int[] RandomizeArray(int[] array) {
		Random rgen = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomPosition = rgen.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomPosition];
			array[randomPosition] = temp;
		}

		return array;
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public Chromosome() {
		int j = 0;
		for (int i = 0; i < headers.length; i++) {
			// doctor timeSlot room
			int doctorId = getRandomNumberInRange(0, ReadFiles.doctors.size());
			chromosome[j++] = doctorId;
			int numOfTimeSlots = (ReadFiles.courses.get(headers[i]).getType() == 'c')
					? TimeSlot.getCoursesTimeSlots().size()
					: TimeSlot.getLabsTimeSlots().size();
			int timeSlotId = getRandomNumberInRange(0, numOfTimeSlots);
			chromosome[j++] = timeSlotId;

			int roomId = getRandomNumberInRange(0, ReadFiles.rooms.size());
			chromosome[j++] = roomId;
		}
	}

	public static int calcConflicts(int[] c) {
		return 0;
	}

	public static int calcCorrectAssignedCources(int[] c) {
		int correctNum = 0;
		for (int i = 0; i < c.length; i += 3) {
			Doctor doctor = ReadFiles.doctors.get(i);
			Course course = ReadFiles.courses.get(headers[i / 3]);
			boolean found = false;
			
			for (int j = 0; j < doctor.getFavCourses().length; j++) {
				if (doctor.getFavCourses()[j].getId() == course.getId()) {
					found = true;
					break;
				}
			}

			for (int j = 0; j < doctor.getFavLabs().length; j++) {
				if (doctor.getFavLabs()[j].getId() == course.getId()) {
					found = true;
					break;
				}
			}
			
			if(found) {
				correctNum++;
			}

		}
		return correctNum;
	}

//	public static int hardFittness(int[] c) {
//		float fittness = 0;
//
//		fittness += (ReadFiles.numOfSections - calcConflicts(c)) / ReadFiles.numOfSections * 10;
//		
//		fittness += calcCorrectAssignedCources(c) / ReadFiles.numOfSections * 10;
//
//	}

}
