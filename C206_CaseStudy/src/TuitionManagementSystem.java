
import java.util.ArrayList;



public class TuitionManagementSystem {
	private static final int OPTION_QUIT = 4;
	private static final int admin_QUIT = 4;
	public static void main(String[] args) {
		ArrayList<Timetable> timetableList = new ArrayList<Timetable>();
		ArrayList<Timetable> registrationList = new ArrayList<Timetable>();

	
		//AINI DID THIS

		//creatiing objects
		Administrator admin = new Administrator("Admin", "Admin");
		Student student = new Student("Student", "Student");
		Manager manager = new Manager("Manager", "Manager");
		
		// LOGIN PAGE
//password setting
		int option = 0;
		while (option != OPTION_QUIT) {
			TuitionManagementSystem.menu();
			option = Helper.readInt("Login as > ");
			if (option == 1) {
				boolean isCorrect1 = false; 
				
			if (isCorrect1 == false) {
				String Username1 = Helper.readString("Username >  ");
				String Password1 = Helper.readString("Password >  ");
					
				if(student.getUsername().equals(Username1) && student.getPassword().equals(Password1)) {
					isCorrect1 = true;
				} else {
					System.out.println("Username or password is incorrect, please try again!");
				}
				Helper.line(80, "-");
				}
			
	     	if (option == 2) {
			boolean isCorrect2 = false; 
			
			if (isCorrect2 == false) {
				String Username2 = Helper.readString("Username >  ");
				String Password2 = Helper.readString("Password >  ");
				
				if(admin.getUsername().equals(Username2) && admin.getPassword().equals(Password2)) {
					isCorrect2 = true;
				} else {
					System.out.println("Username or password is incorrect, please try again!");
				}
				Helper.line(80, "-");
			}
				if (option == 3) {
					boolean isCorrect3 = false; 
					
					if (isCorrect3 == false) {
						String Username3 = Helper.readString("Username >  ");
						String Password3 = Helper.readString("Password >  ");
						
						if(manager.getUsername().equals(Username3) && manager.getPassword().equals(Password3)) {
							isCorrect3 = true;
						} else {
							System.out.println("Username or password is incorrect, please try again!");
						}
						Helper.line(80, "-");
					}
				
			}else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
		
			//administrator menu
		int adminOption = 0;
		while (adminOption != admin_QUIT) {
			TuitionManagementSystem.adminmenu();
			adminOption  = Helper.readInt("Enter option to select  > ");
            
			if(adminOption == 1) {
				Helper.line(80, "-");
				System.out.println("VIEW TUITION TIMETABLE");
				System.out.println("ALL THE VIEW TIMETABLE WILL BE HERE!!!");
				Helper.line(80, "-");

			} else if(adminOption == 2) {
				Helper.line(80, "-");
				System.out.println("ADD TUITION TIMETABLE");
				System.out.println("ADD FUNCTION WILL BE HERE!!!");

			} else if(adminOption == 3) {
				Helper.line(80, "-");
				System.out.println("DELETE TUITION TIMETABLE");
				System.out.println(" DELETE FUNCTION WILL BE HERE!!!");
				Helper.line(80, "-");

			}
			
			else if(adminOption == 4) {
				Helper.line(80, "-");
				System.out.println("THANKS FOR USING TUITION MANAGEMENT CENTRE!");

			}
		}
		}else if (option == admin_QUIT) {
			System.out.println("Bye!");
		} else {
			System.out.println("Invalid option");
		}
		
	
			
}
}
		
		
	
		
	

	
	public static void menu() {
		TuitionManagementSystem.setHeader("TUITION MANAGEMENT SYSTEM");
		System.out.println("1. Student");
		System.out.println("2. Tuition Administrator");
		System.out.println("3. Tuition Manager");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}
	//menusss
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static void adminmenu() {
		
		System.out.println("1. View Timetable");
		System.out.println("2. Add Timetable");
		System.out.println("3. Delete Timetable");
		System.out.println("4. Quit");
		Helper.line(80, "-");
		
	}
	public static void studentmenu() {
		System.out.println("1.Register Tuition Timetable");
		System.out.println("2.Edit Student Details");
		System.out.println("3.Cancel Registration");
		System.out.println("4.Quit");
	}
	public static void managermenu() {
		System.out.println("1.View All Registrations");
		System.out.println("2.View Teacher Details");
		System.out.println("3.Edit Tuition Teacher Details");
		System.out.println("4.Delete Tuition Teacher Details");
		System.out.println("5.View Enquiry");
		System.out.println("6.Add Enquiry");
		System.out.println("7.Delete Enquiry");
		System.out.println("8.Quit");
		
	}

}

	
