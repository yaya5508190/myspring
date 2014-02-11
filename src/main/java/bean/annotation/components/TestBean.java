package bean.annotation.components;

/**
 * @author MisakaMikoto
 * 
 */
public class TestBean {
	String name;
	int age;
	String country;
	TestBean spouse;

	public TestBean() {
		super();
	}

	public TestBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public TestBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public TestBean getSpouse() {
		return spouse;
	}

	public void setSpouse(TestBean spouse) {
		this.spouse = spouse;
	}

}
