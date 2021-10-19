
public class Main {

	
	public static void main(String[] args) {
		AssignmentList aList = new AssignmentList();
		
		Course sampleCourse = new Course("MATH410");
		
		Assignment sampleAssignment = new Assignment();
		
		aList.addAssignment(sampleAssignment);
		
		aList.printAssignmentList();
	}
}
