import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class C206_CaseStudyTest {
	//Aini did this, timetable
	private Timetable tt1;
	private Timetable tt2;
	private ArrayList<Timetable> timetableList;
	
	//Luna
	
	//Ophelia
	
	//Yaswini
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		//Aini, timetable test data
		tt1 = new Timetable(101, 100.00, "10-10-2021", "10:00AM", "10-10-2021", "11:00AM", "English",false);
		tt2 = new Timetable(102, 100.00, "10-10-2021", "10:00AM", "10-10-2021", "11:00AM", "English",false);
		timetableList = new ArrayList<Timetable>();
		
		//Luna
		
		//Ophelia
		
		//Yaswini
	}
	
	@Test
	public void addTimetableTest() {
		// Test that the timetable list is not null before a new timetable can be added to - BOUNDARY
		assertNotNull("Check if there is a valid Timetable arrayList to add to", timetableList);
		// given that an empty list, after adding 1 item, the size of the list is 1 - NORMAL
		TuitionManagement.addTimetable(timetableList, tt1);
		assertEquals("Check that timetable arraylist size is 1", 1,timetableList.size());
		assertSame("Check that timetable is added",tt1,timetableList.get(0));
		
		//Add another timetable test that the size of the list is 2 - NORMAL
		// the timetable just added is as the same as the second timetable of the list
		TuitionManagement.addTimetable(timetableList, tt2);
		assertEquals("Check that timetable arraylist size is 2", 2,timetableList.size());
		assertSame("Check that timetable is added",tt2,timetableList.get(1));
	}
	
	@Test
	public void retrieveAllTimetableTest() {
		//test if timetable list is not null but empty - BOUNDARY
		assertNotNull("Test if there is a valid timetable arraylist to retrieve item",timetableList);
		
		//test if the list of timetable retrieved from the sourceCentre is empty - boundary
		String allTimetable = TuitionManagement.retrieveAllTimetable(timetableList);
		String testOutput = "";
		assertEquals("Check that ViewAllTimetableList",testOutput,allTimetable);
		
		//given an empty list, after adding 2 timetable, test if the size of the list is 2 - normal
		TuitionManagement.addTimetable(timetableList, tt1);
		TuitionManagement.addTimetable(timetableList, tt2);
		assertEquals("Test that timetableList size is 2",2,timetableList.size());
	}
	
		@Test
		public void doDeleteTimetableTest() {
			
			//error
	        boolean isDeleted = TuitionManagement.dodeleteTimetable(timetableList, 101);
	        assertFalse("Test if full class is deleted", isDeleted);
	        
	      //normal
			TuitionManagement.dodeleteTimetable(timetableList, 102);
			tt1.setClassFull(true);
			
			
			
		}

	@After
	public void tearDown() throws Exception {
		tt1 = null;
		tt2 = null;
		timetableList = null;
		
	}


	

}
