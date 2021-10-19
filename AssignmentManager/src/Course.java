
public class Course {
	
	/* for when no title is supplied */
	private static final String DEFAULT_TITLE = "Unknown"; 
	
	private String	courseCode;
	private String	courseTitle;
	
	public Course(String courseCode, String courseTitle) {
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
	}
	
	public Course(String courseCode) {
		this(courseCode, DEFAULT_TITLE);
	}
	
	@Override
	public String toString() {
		return this.courseCode;
	}
	
	@Override
	public int hashCode() {
		return this.courseCode.hashCode();
	}
	
	/*
	 * Equality checking is only for the course code, not the title.
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Course)) {
			return false;
		}
		Course other = (Course) o;
		return other.courseCode.equals(this.courseCode);
	}

	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * @return the courseTitle
	 */
	public String getCourseTitle() {
		return courseTitle;
	}

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	/**
	 * @param courseTitle the courseTitle to set
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

}
