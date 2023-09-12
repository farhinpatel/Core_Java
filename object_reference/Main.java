package object_reference;

public class Main {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpId(125);
		e.setEmpName("Farhin");
		
		Manager m = new Manager(e);
		m.showManagerData();
		
	}

}
