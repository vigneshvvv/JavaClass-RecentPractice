package practice;

public class Products implements PreRun, Cart{

	@Override
	public void defaultEx() {
		// TODO Auto-generated method stub
		System.out.println("working");
	}

	@Override
	public String cart() {
		// TODO Auto-generated method stub
		return "valueAdded";
	}

}
