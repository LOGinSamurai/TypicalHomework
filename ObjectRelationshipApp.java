
 public class ObjectRelationshipApp {

	public static void main(String[] args) {
		Woman w = new Woman("Anastasia");
		Man m = new Man("Ivan");
		House h = new House("Street",200);
		
        //relations - house
		m.propriety = h;
	 
		 
		//relations -mariage
		m.wife    = w;
		w.husband = m;
		h.owners[0] = m;
		h.owners[1] = m.wife;
		m.wife.hello();
		System.out.println(w.husband.propriety.address);
	 
		for(Person p:h.owners){
			System.out.println(p.fullname);
		}
			
			
		//}
	    //

	}

}
class Person{
	 public String fullname;
}

 class Woman extends Person{
	 public House propriety;
	 
public Man husband;
	public Woman(String fullname) {
		this.fullname = fullname; 
	}
	public void hello(){
		System.out.println("helloooo");
	}
	 
	 
 }
 
 class Man extends Person{
	 public House propriety;
	 
public Woman wife;
	public Man(String fullname) {
		this.fullname = fullname;
	}
	 
	 
 }
 class House{
	 Person[] owners= new Person[2];
	 public String address;
	 public float area;
	public House(String address, float area) {
		
		this.address = address;
		this.area = area;
	}
	 
 }
 
 
 
 
 
