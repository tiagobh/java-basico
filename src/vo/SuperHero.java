package vo;

public class SuperHero extends Person{

	private Boolean specialPower;

	public SuperHero() {

	}

	public SuperHero(Boolean specialPower) {

		this.specialPower = specialPower;
	}

	public SuperHero(String name, Boolean specialPower, Integer age) {

		super(name, age);
		this.specialPower = specialPower;

	}

	public Boolean hasSpecialPower() {

		return specialPower;
	}

	public void setSpecialPower(Boolean specialPower) {

		this.specialPower = specialPower;
	}


	public String getName(){
		return "My name is: " + super.getName();
	}

	public void move(){

		System.out.println("I'm a Hero and fly");
	}

}
