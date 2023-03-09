package oops_Interface;

public class TestCollege {

	public static void main(String[] args) {
		GrandeCollege gc = new GrandeCollege();
		//overridden from interface
		gc.engineering();
		gc.arts();
		gc.computerScience();
		
		//static method from parent class
		GrandeCollege.Examination();
		
		//individual methods of grande college
		gc.biomedical();
		gc.agriculture();
		
		gc.welfareFund(200);
		
		EverestCollege ec = new EverestCollege();
		// individual methods of everest college
		ec.accounting();
		ec.softwareEng();
		
		//common method in interface
		ec.MBA();
		ec.welfareFund(100);
		//grandparent interface class
		ec.scholarship();
		
		//top casting with grande college class object
		HarvardUniversity hu = new GrandeCollege();
		hu.computerScience();
		hu.engineering();
		hu.MBA();
		hu.scholarship();
		
		//top casting with everest class objects
		HarvardUniversity hu1 = new EverestCollege();
		hu1.computerScience();
		hu1.engineering();
		hu1.MBA();
		hu1.scholarship();
		

	}

}
