/**
 * I declare that this code was written by me. 
* I will not copy or allow others to copy my code. 
* I understand that copying code is considered as plagiarism. 
* yaswini, Aug 4, 2021 4:40:13 PM
 */

/**
 * @author Yaswini
 *
 */

			public class TuitionManagement {
			  private static final int OPTION_QUIT = 4;
			  
			  public static void main(String[] args) {
			  
			    
			    Administrator admin = new Administrator("Admin", "Admin");
			    Student student = new Student("Student", "Student");
			    Manager manager = new Manager("Manager", "Manager");
			    
			    // LOGIN PAGE
			    int option = 0;
			    while (option != OPTION_QUIT) {
			      TuitionManagement.menu();
			      option = Helper.readInt("Login as > ");
			      
			      
			      if (option == 1) {
			        boolean isCorrect1 = false; 
			        
			        if (isCorrect1 == false) {
			          String Username1 = Helper.readString("Username >  ");
			          String Password1 = Helper.readString("Password >  ");
			          
			          if(student.getUsername().equals(Username1) && student.getPassword().equals(Password1)) {
			            isCorrect1 = true;
			            TuitionManagement.studentmenu();
			            int studentOption = Helper.readInt("Enter a option >");
			            if (studentOption == 1) {
			              TuitionManagement.registration();
			            }else if (studentOption == 2) {
			              TuitionManagement.editStudentDetails();
			            }else if (studentOption == 3) {
			              TuitionManagement.cancelStudentRegistration();
			            }else if (studentOption == 4) {
			              TuitionManagement.quit();
			            }
			            } 
			          }
			      }
			          
			          else if (option == 2) {
			              boolean isCorrect2 = false; 
			              
			              if (isCorrect2 == false) {
			                String Username2 = Helper.readString("Username >  ");
			                String Password2 = Helper.readString("Password >  ");
			                
			                if(admin.getUsername().equals(Username2) && admin.getPassword().equals(Password2)) {
			                  isCorrect2 = true;
			                  TuitionManagement.adminmenu();
			                  int adminOption = Helper.readInt("Enter a option >");
			                  if (adminOption == 1) {
			                    TuitionManagement.viewTimetable();
			                  }else if (adminOption == 2) {
			                    TuitionManagement.addTimetable();
			                  }else if (adminOption == 3) {
			                    TuitionManagement.deleteTimetable();
			                  
			            }
			                }
			              }
			          } else if (option == 3) {
			            boolean isCorrect3 = false; 
			            
			            if (isCorrect3 == false) {
			              String Username3 = Helper.readString("Username >  ");
			              String Password3 = Helper.readString("Password >  ");
			              
			              if(manager.getUsername().equals(Username3) && manager.getPassword().equals(Password3)) {
			                isCorrect3 = true;
			                TuitionManagement.managermenu();
			                int managerOption = Helper.readInt("Enter a option >");
			                if (managerOption == 1) {
			                  TuitionManagement.viewAllregistration();
			                }else if (managerOption == 2) {
			                  TuitionManagement.viewTeacherDetails();
			                }else if (managerOption == 3) {
			                  TuitionManagement.editTuitionTeacherDetails();
			                }else if (managerOption == 4) {
			                  TuitionManagement.deleteTuitionTeacherDetails();
			                }else if (managerOption == 5) {
			                  TuitionManagement.viewEnquiry();
			                }else if (managerOption == 6) {
			                  TuitionManagement.addEnquiry();
			                }else if (managerOption == 7) {
			                  TuitionManagement.deleteEnquiry();
			                }else if (managerOption == 8) {
			                  TuitionManagement.quit();
			              
			                  
			              
			            
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
			    }

			//administrator menu
			        
			    
			}
			      
	
			  
			  public static void menu() {
			    TuitionManagement.setHeader("TUITION MANAGEMENT SYSTEM");
			    System.out.println("1. Student");
			    System.out.println("2. Tuition Administrator");
			    System.out.println("3. Tuition Manager");
			    System.out.println("4. Quit");
			    Helper.line(80, "-");

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
			      Helper.line(80, "-");
			      System.out.println("1.Register Tuition Timetable");
			      System.out.println("2.Edit Student Details");
			      System.out.println("3.Cancel Registration");
			      System.out.println("4.Quit");
			      Helper.line(80, "-");
			    }

			public static void registration() {
			  Helper.line(80, "-");
			    System.out.println("1.Registeration of Tuition Timetable function will be here");
			    
			    
			  }

			public static void editStudentDetails() {
			  Helper.line(80, "-");
			    System.out.println("1.edit of student details function will be here");
			   
			    
			  }
			public static void cancelStudentRegistration() {
			  Helper.line(80, "-");
			    System.out.println("1. cancel student registration function will be here");
			   
			    
			  }
			public static void quit() {
			  Helper.line(80, "-");
			    System.out.println("BACK TO MAIN MENU FUNCTION WILL BE HERE");
			   
			    
			  }
			public static void viewTimetable() {
			  Helper.line(80, "-");
			    System.out.println("view of timetable FUNCTION WILL BE HERE");
			   
			    
			  }
			public static void addTimetable() {
			  
			    System.out.println("Add timetable FUNCTION WILL BE HERE");
			   
			    
			  }
			public static void deleteTimetable() {
			  Helper.line(80, "-");
			    System.out.println("delete of timetable FUNCTION WILL BE HERE");
			    
			  }

			public static void viewAllregistration() {
			  Helper.line(80, "-");
			    System.out.println("viewallregistrations FUNCTION WILL BE HERE");
			  
			  }
			public static void viewTeacherDetails() {
			  Helper.line(80, "-");
			    System.out.println("viewteacher details FUNCTION WILL BE HERE");
			    
			  }
			public static void editTuitionTeacherDetails() {
			  Helper.line(80, "-");
			    System.out.println("editTuitionTeacherDetails FUNCTION WILL BE HERE");
			    
			  }
			public static void deleteTuitionTeacherDetails() {
			  Helper.line(80, "-");
			    System.out.println("DeleteTuitionTeacherDetails FUNCTION WILL BE HERE");
			    
			  }
			public static void viewEnquiry() {
			  Helper.line(80, "-");
			    System.out.println("viewEnquiry FUNCTION WILL BE HERE");
			  
			  }
			public static void addEnquiry() {
			  Helper.line(80, "-");
			    System.out.println("addEnquiry FUNCTION WILL BE HERE");
			   
			  }
			public static void deleteEnquiry() {
			  Helper.line(80, "-");
			    System.out.println("deleteEnquiry FUNCTION WILL BE HERE");
			    System.out.println("deleteEnquiry FUNCTION WILL BE HERE");
			    System.out.println("deleteEnquiry FUNCTION WILL BE HERE");

			  
			  }
//
			}

			
