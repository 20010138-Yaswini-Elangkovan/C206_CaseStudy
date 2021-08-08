

public class Timetable {

	private int tuitionID;
	private double price;
	private String startDate;
	private String startTime;
	private String endDate;
	private String endTime;
	private String mode;
	private boolean classFull;
	//aini wee
	public Timetable(int tuitionID, double price, String startDate, String startTime, String endDate, String endTime,String mode, boolean classFull) {
		this.tuitionID = tuitionID;
		this.price = price;
		this.startDate =startDate;
		this.startTime = startTime;
		this.endDate = endDate;
		this.endTime = endTime;
		this.mode = mode;
		this.classFull = false;
		
	}
	public int getTuitionID() {
		return tuitionID;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getstartDate() {
		return startDate;
	}
	
	public String getstartTime() {
		return startTime;
	}
	
	public String getendDate() {
		return endDate;
	}
	
	public String getendTime() {
		return endTime;
	}
	public String getMode() {
		return mode;
	}
	
	public boolean getclassFull() {
		return classFull;
	}
	
	public void setClassFull(boolean classFull) {
		this.classFull = classFull;
	}
	public static void add(Timetable timetable) {
		// TODO Auto-generated method stub
		
	}
	

	
	}
	