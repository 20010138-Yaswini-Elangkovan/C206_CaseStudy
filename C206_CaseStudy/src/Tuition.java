
public class Tuition {
	private String tuitionCode;
	private String tuitionTitle;
	private String subjectGroup;
	private String description;
	private String duration;
	private String Name;
	private String teacherGender;
	private String teacherEmail;
	private String teacherQualification;
	//
	public Tuition(String tuitionCode, String tuitionTitle,String tuitionGroup, String Description, String Name,String teacherGender,String teacherEmail, String teacherQualification) {
		this.tuitionCode = tuitionCode;
		this.tuitionTitle = tuitionTitle;
		this.subjectGroup = subjectGroup;
		this.description =  description;
		this.duration =  duration;
		this.Name =  Name;
		this.teacherGender = teacherGender;
		this.teacherEmail = teacherEmail;
		this.teacherQualification =  teacherQualification;
	}

	public String getTuitionCode() {
		return tuitionCode;
	}

	public void setTuitionCode(String tuitionCode) {
		this.tuitionCode = tuitionCode;
	}

	public String getTuitionTitle() {
		return tuitionTitle;
	}

	public void setTuitionTitle(String tuitionTitle) {
		this.tuitionTitle = tuitionTitle;
	}

	public String getSubjectGroup() {
		return subjectGroup;
	}

	public void setSubjectGroup(String subjectGroup) {
		this.subjectGroup = subjectGroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTeacherGender() {
		return teacherGender;
	}

	public void setTeacherGender(String teacherGender) {
		this.teacherGender = teacherGender;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getTeacherQualification() {
		return teacherQualification;
	}

	public void setTeacherQualification(String teacherQualification) {
		this.teacherQualification = teacherQualification;
	}

}
