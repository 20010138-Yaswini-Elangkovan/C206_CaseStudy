import java.util.ArrayList;

public class C206_CaseStudy {
	
	
		// TODO Auto-generated method stub
             



	//wini was here
	  private static final int OPTION_QUIT = 15;
	  public static void main(String[] args) {
	    ArrayList<Timetable> timetableList = new ArrayList<Timetable>();
	    ArrayList<Timetable> registrationList = new ArrayList<Timetable>();
	    Administrator admin = new Administrator("Admin", "Admin");
	    
	    int option = 0;
	    while (option != OPTION_QUIT) {
	      //extract constants
	    	 C206_CaseStudy .menu();
	      option = Helper.readInt("Login as > ");
	      
	      
	    //administrator
	    if (option == 2) {
	    boolean isValid = false; 
	    
	    if (isValid == false) {
	      String Username = Helper.readString("Username >  ");
	      String Password = Helper.readString("Password >  ");
	      
	      if(admin.getUsername().equals(Username) && admin.getPassword().equals(Password)) {
	        isValid = true;
	      
	    
	      Helper.line(80, "-");
	      C206_CaseStudy .adminmenu();
	      int adminOption  = Helper.readInt("Enter option to select  > ");

	      if(adminOption == 1) {
	        Helper.line(80, "-");
	        System.out.println("VIEW TUITION TIMETABLE");
	        System.out.println("ALL THE VIEW TIMETABLE WILL BE HERE!!!");
	        Helper.line(80, "-");
	        C206_CaseStudy .adminmenu();
	        int adminOption1  = Helper.readInt("Enter option to select  > ");
	        
	        
	      }
	      else if(adminOption == 2) {
	        Helper.line(80, "-");
	        System.out.println("ADD TUITION TIMETABLE");
	        System.out.println("ADD FUNCTION WILL BE HERE!!!");
	        Helper.line(80, "-");
	        C206_CaseStudy .adminmenu();
	        int adminOption2  = Helper.readInt("Enter option to select  > ");
	        
	        
	      }
	      
	      else if(adminOption == 3) {
	        Helper.line(80, "-");
	        System.out.println("DELETE TUITION TIMETABLE");
	        System.out.println(" DELETE FUNCTION WILL BE HERE!!!");
	        Helper.line(80, "-");
	        C206_CaseStudy .adminmenu();
	        int adminOption3  = Helper.readInt("Enter option to select  > ");
	      }
	      
	      else if(adminOption == OPTION_QUIT) {
	        Helper.line(80, "-");
	        System.out.println("THANKS FOR USING TUITION MANAGEMENT CENTRE!");
//	        C206_CaseStudy .menu();
//	      option = Helper.readInt("Login as > ");
	        
	      }
	      
	    } else {
	      System.out.println("Invalid option");
	    }
	      
	    } else {
	        System.out.println("Username or password is incorrect, please try again!");
	      }
	   
	      
	    }
	    }
	    }
	  

	  
	  public static void menu() {
		  C206_CaseStudy .setHeader("TUITION MANAGEMENT SYSTEM");
	    System.out.println("1. Student");
	    System.out.println("2. Tuition Administrator");
	    System.out.println("3. Tuition Manager");
	    Helper.line(80, "-");

	  }
	  
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
		  
	  }
	  public static void managermenu() {
	  }
	}				