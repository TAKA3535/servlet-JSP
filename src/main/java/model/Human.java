package model;
import java.io.Serializable;
//P192 JavaBeansの例
public class Human implements Serializable {
	private String name;
	private int age;
	
	public Human() { }
	public Human(String name , int age) {
		this.name = name;
		this.age = age;
	}
//	public String getName() {return name;}
//	public void setName(String name) {this.name = name;}
//	public int getAge() {return age;}
//	public void setAge(int age) {this.age = age;}
	//右クリック→ソース→geter及びseter生成クリックで下のように上の4行と同じものが記述される
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
	
}
