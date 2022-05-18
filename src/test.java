
public class test {

	public static void main(String[] args) {
		empmethod em = new empmethod();
		employee e = new employee();
		e.setId(10);
		e.setName("hemanth");
		e.setPhone(36265524);
		em.saveEmployee(e);
	}
}
