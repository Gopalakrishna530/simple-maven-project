package myprojectDomaindemojan.mvndemo1jan;

public class Student {
	String firstName;
	String LastName;
	int RollNo;
	int Marks;
	String Subject1;
	String Subject2;
	String Subject3;
	
	// constrator
	public Student() {
		this.firstName=firstName;
		this.LastName=LastName;
		this.RollNo=RollNo;
		this.Marks=Marks;
		this.Subject1=Subject1;
		this.Subject2=Subject2;
		this.Subject3=Subject3;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getSubject1() {
		return Subject1;
	}

	public void setSubject1(String subject1) {
		Subject1 = subject1;
	}

	public String getSubject2() {
		return Subject2;
	}

	public void setSubject2(String subject2) {
		Subject2 = subject2;
	}

	public String getSubject3() {
		return Subject3;
	}

	public void setSubject3(String subject3) {
		Subject3 = subject3;
	}
	
}
