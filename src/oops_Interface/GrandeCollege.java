package oops_Interface;

public class GrandeCollege extends HigherEduBoard implements GeorgiaUniversity, HarvardUniversity, UniversityHouston{
	public void agriculture() {
		System.out.println("grandee------Agriculture degree");
		
	}
	public void biomedical() {
		System.out.println("grandee------Biomedical degree");
		
	}
	@Override
	public void literature() {
		System.out.println("grandee------University of houston literature degree");
		
	}
	@Override
	public void journalism() {
		System.out.println("grandee------University of houston journalism degree");
		
	}
	@Override
	public void arts() {
		System.out.println("grandee------University of houston art degree");
		
	}
	@Override
	public void computerScience() {
		System.out.println("grandee------Harvard University computer science degree");
		
	}
	@Override
	public void engineering() {
		System.out.println("grandee------Harvard University engineering degree");
		
	}
	@Override
	public void publicHealth() {
		System.out.println("grandee------Georgia University public health degree");
		
	}
	@Override
	public void economis() {
		System.out.println("grandee------Georgia University Economics degree");
		
	}
	@Override
	public void MBA() {
		System.out.println("grandee------MBA program");
		
	}
	@Override
	public void scholarship() {
		System.out.println("grandee------scholarship program");
		
	}
	//overridden from parent class with different variable name but same parameter
	@Override
	public int welfareFund (int k) {
		System.out.println("Grandee college welfare fund");
		return 200;
		
	}

}
