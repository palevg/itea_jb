package itea.lsn6.Developers;

public abstract class Developer extends Person {

	public Developer(String name, double basicSalary, int experience) {
		super(name, basicSalary);
		this.experience = experience;
	}
}