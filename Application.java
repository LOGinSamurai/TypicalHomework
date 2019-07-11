import com.github.javafaker.Faker;
import java.util.Locale;
public class Application {

	public static void main(String[] args) {
		Student s1 = new Student("Ion Studentin",20, "Chishinau,Sudentilor");
		System.out.println(s1);
		Student s2 = new Student();
		System.out.println(s2);
	}

}

class Student {
	public String fullname;
	public int age;
	public String address;
	
	public Student(){
		//Generate fake data
		Faker f = new Faker(new Locale("ru"));
		this.fullname = f.name().fullName();
		this.address = f.address().fullAddress();
		this.age = f.random().nextInt(18,25);
	}
	public Student(String fullname, int age, String address) {
		super();
		this.fullname = fullname;
		this.age = age;
		this.address = address;
	}
	

	public String toString() {
		return "Student [\nfullname=" + fullname + ", \nage=" + age + ", \naddress=" + address + "\n]";
	}
	
	
}
