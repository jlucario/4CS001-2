public class TestPerson {

	public static void main(String[] args) {
		// create default object
		Person p1 = new Person();
		// print default values
		System.out.println(p1.getName());
		// set values
		p1.setName("Homer");
		// print new values
		System.out.println(p1.getName());
	}
}