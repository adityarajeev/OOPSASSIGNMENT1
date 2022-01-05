package Departments;

public class SuperDepartment{
	void departmentName() {
		System.out.println("Super Department");
	}
	void getTodaysWork() {
		System.out.println("No work as of now");
	}
	void getWorkDeadline() {
		System.out.println("Nil");
	}
	void isTodayAHoliday() {
		System.out.println("Today is not a holiday");
	}
	public static void main(String args[])
	{
		new SuperDepartment();
		new AdminDepartment();
		new HRDepartment();
		new TechDepartment();
	}
}

class AdminDepartment extends SuperDepartment{
	void departmentName() {
		System.out.println("Admin Department");
	}
	void getTodaysWork() {
		System.out.println("Complete your document submission");
	}
	void getWorkDeadline() {
		System.out.println("Complete by EOD");
}
}
class HRDepartment extends SuperDepartment{
	void departmentName() {
		System.out.println("HR Department");
	}
	void getTodaysWOrk() {
		System.out.println("Fill todays timesheet and makr your attendance");
	}
	void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	void doActivity() {
		System.out.println("team Lunch");
	}
}
class TechDepartment extends SuperDepartment{
	void departmentName() {
		System.out.println("Tech Department");
	}
	void getTodaysWork() {
		System.out.println("Complete coding of module 1");
	}
	void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	void getTechStackInformation() {
		System.out.println("core Java");
	}

	
}