
public class Enquiry {
	private int enquiryid;
	private String title;
	private String date;
	
	public Enquiry(int enquiryid, String title, String date) {
		this.enquiryid = enquiryid;
		this.title = title;
		this.date = date;
	}
	public int getenquiryid() {
		return enquiryid;
	}
	public String gettitle() {
		return title;
	}
	public String getdate() {
		return date;
	}
	public void setenquiryid(int enquiryid) {
		this.enquiryid = enquiryid;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}
}


