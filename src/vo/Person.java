package vo;

public class Person extends Alien{

	private String name;
	private Integer age;

	public Person() {

	}

	public String getName() {

		return name;
	}

	public Person(String myName, Integer age) {

		name = myName;
		this.age = age;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Integer getAge() {

		return age;
	}

	public void setAge(Integer age) {

		this.age = age;
	}

	public void move(){

		System.out.println("I'm a Person and running.");
	}
}
