package object_reference;

public class Manager {
	private int managerId;
	private String managerName;
	
	public Manager(Employee e) {
		managerId = e.getEmpId();
		managerName = e.getEmpName();
	
	}
	public void showManagerData() {
		System.out.println("Manager id is : "+managerId);
		System.out.println("Manager Name is :"+ managerName);
	}

}
