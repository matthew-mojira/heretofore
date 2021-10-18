import java.util.HashSet;
import java.util.Set;

public class CourseSet {
	
	/* for when no title is supplied */
	private static final String DEFAULT_TERM = "Unknown Term";
	
	private String 			termName;
	private Set<Course> 	courses;
	
	public CourseSet(String termName) {
		this.termName = termName;
		courses = new HashSet<>();
	}
	
	public CourseSet() {
		this(DEFAULT_TERM);
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}

}
