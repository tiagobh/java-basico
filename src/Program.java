import util.Calculation;
import vo.Person;
import vo.SuperHero;

public class Program {

	public static void main(String[] args) {

		Person myHero = new SuperHero();
		myHero.setName("Super man");
		myHero.move();


		Person myPerson = new Person();
		myPerson.setName("Joaozinho");
		myPerson.move();


	}

}
