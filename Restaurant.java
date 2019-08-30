  import java.util.HashSet;

public class Restaurant {
	public String name;
	
	HashSet<Food> menu;

	public Restaurant(String name) {
		this.name = name;
		
		this.menu = new HashSet<Food>();
		
	}
	public void addFood(Food f){
		if(this.menu.contains(f)){
			System.out.println("alreadyexists");
		}
		else{this.menu.add( f );}
		
	}
	@Override
	public String toString() {
		return "Restaurant \"" + name + "\" \n\n" + menu.toString()
		                                                .replaceAll(",","")
		                                                .replaceAll("\\[","")//regex
		                                                .replaceAll("\\]","");
	}
	public String getPriceof(String food_name){
		
		for (Food food : menu) {
         if(food_name.toLowerCase().contains( food.name.replaceAll( " ","").toLowerCase())){return food.name +" "+food.price;}
    else if(food.name.equalsIgnoreCase(food_name)){ return food.name +" "+food.price;}
		}
		return null;
		}
	
	

	public Food getCheapestFood(){
		Food food_cheap = null;		  
		for (Food food : menu) {
			  if( food_cheap == null || food.price < food_cheap.price )
			  {food_cheap = food;}
		}
	   return food_cheap;
	   }
		

	public Food getExpensiveFood(){
		Food food_cheap = null;		  
		for (Food food : menu) {
			  if( food_cheap == null || food.price > food_cheap.price )
			  {food_cheap = food;}
		}
	   return food_cheap;
	   }
 
	}
	
	

	
	

	
