package assissment.enumtest;

public enum WEEKDAYS {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	private int value;

	private WEEKDAYS(int value) {
		this.value = value;
	}
}
