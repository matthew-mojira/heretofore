
public enum Status {
	NOT_ASSIGNED("Not assigned"), NOT_STARTED("Not started"), 
	IN_PROGRESS("In progress"), FINAL_REVIEW("Final review"),
	DONE("Done"), SKIPPED("Skipped");

	/*
	 * implementation note: there is a class that compares statuses and uses the
	 * ordinal to do such comparison. so we should make sure that we don't change
	 * the order of the enums too much
	 */

	private String statusName;

	private Status(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return this.statusName;
	}
}
