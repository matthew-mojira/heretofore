import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment implements Cloneable {

	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEE MM/dd 'at' hh:mm aaa");

	private int priority;
	private Date assignedDate;
	private Date dueDate;
	private Course course;
	private String title;
	private String description;
	private Status status;

	public Assignment() {
		this.priority = 0;
		this.assignedDate = new Date(); // now
		this.dueDate = new Date(); // now
		this.course = null;
	}

	@Override
	public Assignment clone() {
		Assignment clone = new Assignment();

		clone.priority = this.priority;
		clone.assignedDate = (Date) this.assignedDate.clone();
		clone.dueDate = (Date) this.dueDate.clone();
		clone.course = this.course;
		clone.title = this.title;
		clone.description = this.description;
		clone.status = this.status;

		return clone;
	}

	@Override
	public String toString() {
		return String.format("(%d) [%s] %s - %s: %s", priority, DATE_FORMAT.format(dueDate), course, title,
				description);
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return the assignedDate
	 */
	public Date getAssignedDate() {
		return assignedDate;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @param assignedDate the assignedDate to set
	 */
	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
}
