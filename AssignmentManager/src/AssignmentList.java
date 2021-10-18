import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AssignmentList {

	private List<Assignment> assignments;

	public AssignmentList() {
		assignments = new ArrayList<>();
	}

	public void sortListByPriority() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getPriority() - o2.getPriority();
			}

		});
	}

	public void sortListByAssignedDate() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getAssignedDate().compareTo(o2.getAssignedDate());
			}

		});
	}

	public void sortListbyDueDate() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getDueDate().compareTo(o2.getDueDate());
			}

		});
	}

	public void sortListByCourse() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getCourse().getCourseCode().compareTo(o2.getCourse().getCourseCode());
				/* TODO should we make getCourse Comparable? */
			}

		});
	}

	public void sortListByTitle() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}

		});
	}

	public void sortListByDescription() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getDescription().compareTo(o2.getDescription());
			}

		});
	}

	public void sortListByStatus() {
		assignments.sort(new Comparator<Assignment>() {

			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o1.getStatus().ordinal() - o2.getStatus().ordinal();
			}

		});
	}

}
