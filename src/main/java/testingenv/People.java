package testingenv;

public class People {
	
	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return id;//add by second
		//fixed a critical bug!!!
		//v1
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
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

}
