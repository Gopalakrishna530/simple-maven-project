package myprojectDomaindemojan.mvndemo1jan;

public class StudentDetails {

	public static void main(String[] args) {
		Student sc=new Student();
		sc.setFirstName("Gopalakrishna");
		sc.setLastName("LastName");
		sc.setMarks(1000);
		sc.setRollNo(530);
		sc.setSubject1("phy");
		sc.setSubject2("maths");
		sc.setSubject3("chemistory");
		System.out.println(sc.firstName);
		System.out.println(sc.LastName);
		System.out.println(sc.RollNo);
		System.out.println(sc.Marks);
		System.out.println(sc.Subject1);
		System.out.println(sc.Subject2);
		System.out.println(sc.Subject3);
	}
}
