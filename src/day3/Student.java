package day3;

public class Student {
	private int studentid;
	private String studentname;
	private int score;
	
	public void setStudentid(int studentid) {
		this.studentid=studentid; //class level value will be initialized with parameter
	}
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentname(String studentname) {
		this.studentname=studentname; //class level value will be initialized with parameter
	}
	
	public String getStudentname() {
		return studentname;
	}
	
	public void setStudentscore(int score) {
		this.score=score; //class level value will be initialized with parameter
	}
	
	public int getScore() {
		return score;
	}
}
