
import java.util.ArrayList;



public class TuitionManagementSystem {
	private static final int OPTION_QUIT = 5;
	public static void main(String[] args) {
		ArrayList<Timetable> timetableList = new ArrayList<Timetable>();
		
		timetableList.add(new Timetable("A001", 100.00,"2021-10-20", "10:00", "2021-10-20","11:00", "English",true));
		
		
	}
	
	
	public static String showClassFull(boolean isClassFull) {
		String full;

		if (isClassFull == true) {
			full = "Yes";
		} else {
			full = "No";
		}
		return full;
	}
}
