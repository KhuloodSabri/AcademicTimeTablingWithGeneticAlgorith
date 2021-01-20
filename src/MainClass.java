import java.io.FileNotFoundException;

import Basics.*;
import Services.*;
public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		ReadFiles.readFiles();
//		System.out.println(ReadFiles.numOfSections);
//		System.out.println(ReadFiles.courses.size());
//		System.out.println(ReadFiles.doctors.size());
//		System.out.println(TimeSlot.getCoursesTimeSlots().size());
//		System.out.println(TimeSlot.getLabsTimeSlots().size());
//		System.out.println(ReadFiles.courses.get(0).getName());
		Chromosome c= new Chromosome();
		for (int i=0; i<c.chromosome.length;i++)
		System.out.print(c.chromosome[i]+" ");
		System.out.println(c.chromosome.length);
		
	
	}

}
