import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class AssignmentList {

	private List<Assignment> assignments;
	private SortingFields currentSortingMethod;

	public AssignmentList() {
		assignments = new Vector<>();
		this.currentSortingMethod = SortingFields.DUE_DATE;
	}
	
	public void printAssignmentList() {
		for (Assignment a : assignments) {
			System.out.println(a);
		}
	}
	
	public void addAssignment(Assignment assignmentToAdd) {
		assignments.add(assignmentToAdd);
		this.sortListByField(this.currentSortingMethod);
	}
	
	public void removeAssignment(Assignment assignmentToRemove) {
		assignments.remove(assignmentToRemove);
	}
	
	public enum SortingFields {
		PRIORITY, ASSIGNED_DATE, DUE_DATE, COURSE, TITLE, DESCRIPTION, STATUS;
	}
	
	public void sortListByField(SortingFields field) {
		this.currentSortingMethod = field;
		
		switch (field) {
		case PRIORITY:
			this.sortListByPriority();
			break;
		case ASSIGNED_DATE:
			this.sortListByAssignedDate();
			break;
		case DUE_DATE:
			this.sortListbyDueDate();
			break;
		case COURSE:
			this.sortListByCourse();
			break;
		case TITLE:
			this.sortListByTitle();
			break;
		case DESCRIPTION:
			this.sortListByDescription();
			break;
		case STATUS:
			this.sortListByStatus();
			break;
		}
	}
	

	private void sortListByPriority() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getPriority() - o2.getPriority();
			}

		});
	}

	private void sortListByAssignedDate() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getAssignedDate().compareTo(o2.getAssignedDate());
			}

		});
	}

	private void sortListbyDueDate() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getDueDate().compareTo(o2.getDueDate());
			}

		});
	}

	private void sortListByCourse() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getCourse().getCourseCode().compareTo(o2.getCourse().getCourseCode());
				/* TODO should we make getCourse Comparable? */
			}

		});
	}

	private void sortListByTitle() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}

		});
	}

	private void sortListByDescription() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getDescription().compareTo(o2.getDescription());
			}

		});
	}

	private void sortListByStatus() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getStatus().ordinal() - o2.getStatus().ordinal();
			}

		});
	}

}
