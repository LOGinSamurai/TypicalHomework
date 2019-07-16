
public class ObjectRelationshipApp {

	public static void main(String[] args) {
		Woman w = new Woman("Anastasia");
		Man m = new Man("Ivan");
		House h = new House("Street",200);
		
        //relations - house
		m.propriety = h;
		h.owner = m;
		
		//relations -mariage
		w.husband = m;
		m.wife    = w;
		m.wife.hello();
	 
		
	    //

	}

}
 class Woman{
	 public House propriety;
	 public String fullname;
public Man husband;
	public Woman(String fullname) {
		this.fullname = fullname;
	}
	public void hello(){
		System.out.println("oooo");
	}
	 
	 
 }
 
 class Man{
	 public House propriety;
	 public String fullname;
public Woman wife;
	public Man(String fullname) {
		this.fullname = fullname;
	}
	 
	 
 }
 class House{
	 Object owner;
	 public String address;
	 public float area;
	public House(String address, float area) {
		
		this.address = address;
		this.area = area;
	}
	 
 }
 
 
 
 
 
