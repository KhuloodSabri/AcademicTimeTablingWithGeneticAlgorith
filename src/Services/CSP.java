
package Services;
import java.util.ArrayList;

import Basics.*;
import Basics.Class;
public class CSP {
	static Class variables[] = new Class[ReadFiles.numOfSections];
	static ArrayList<Value> availableValues[] = new ArrayList[ReadFiles.numOfSections];

	public static void solveCSP() {
		initializeVariables();
		
		
	}
//	public static void BackTrackingCSP();
	
	private static void initializeVariables() {
		int variableIndex = 0;
		for (int i = 0; i < ReadFiles.courses.size();i++) {
			Course course = ReadFiles.courses.get(i);
			for(int j = 0; j < course.getNumOfSections(); j++) {
				variables[variableIndex++] = new Class(course, j+1);
			}
		}
		
	}
	
	private static void initializeValues() {
		for(int i = 0; i < availableValues.length; i++) {
			availableValues[i] = new ArrayList<Value>();
			
		}
	}

}
