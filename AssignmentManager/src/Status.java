
public enum Status {
	NOT_ASSIGNED, NOT_STARTED, IN_PROGRESS, FINAL_REVIEW, DONE, SKIPPED;
	
	/* implementation note: there is a class that compares statuses and uses the
	 * ordinal to do such comparison. so we should make sure that we don't change
	 * the order of the enums too much
	 */
}
