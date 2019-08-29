
 import java.util.Scanner;
public class Application {
	
      public static void main(String[] args){
    	 
    	  Scanner in = new Scanner(System.in);
    	  
    	  
	Restaurant good_restaurant = new Restaurant("La Java");
	             good_restaurant.addFood(new Food("Pizza 4 formage",500,75.00f));
	             good_restaurant.addFood(new Food("Burger King",250,65.00f));
	             good_restaurant.addFood(new Food("Salad",900,45.00f));
	             good_restaurant.addFood(new Food("Salad",900,45.00f));
	System.out.println(good_restaurant );
	
	System.out.println("Which food do you want?");
	String fname = in.nextLine();
	System.out.println(good_restaurant.getPriceof(fname));
	System.out.println( good_restaurant.getCheapestFood());
	System.out.println( good_restaurant.getExpensiveFood());
	
}
}