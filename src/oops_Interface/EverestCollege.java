package oops_Interface;

public class EverestCollege extends HigherEduBoard implements GeorgiaUniversity, HarvardUniversity, UniversityHouston {
	
	public void accounting () {
		System.out.println("everest-----degree of accounting");
		
	}
	public void softwareEng () {
		System.out.println("everest-----degree of softwareEng");
		
	}
	@Override
	public void scholarship() {
		System.out.println("everest----scholarship program");
		
	}
	@Override
	public void literature() {
		System.out.println("everest----university of huston literature degree program");
		
	}
	@Override
	public void journalism() {
		
		System.out.println("everest----university of huston journalism degree program");
		
	}
	@Override
	public void arts() {
		System.out.println("everest----university of huston degree of art program");
		
	}
	@Override
	public void computerScience() {
		System.out.println("everest------Harvard University computer science degree");
		
	}
	@Override
	public void engineering() {
		System.out.println("everest------Harvard University engineering degree");
		
	}
	@Override
	public void publicHealth() {
		System.out.println("everest------Georgia university public health degree");
		
	}
	@Override
	public void economis() {
		System.out.println("everest------Georgia university public health degree");
		
	}
	@Override
	public void MBA() {
		System.out.println("MBA program-everest college");
		
	}

}
