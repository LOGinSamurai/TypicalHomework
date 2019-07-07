
public class ReastaurantObjectsAppRU {

	public static void main(String[] args) {

		Aliment D = new Drink(null, null, 0);
       D.getName();
	}

}
//предположим есть 3 класса
//что-то что можно употреблять как пища
//1) добавить constructor,setters,getters,tostring
class Aliment{
 private String name;
 private float price;
public Aliment(String name, float price) {
	this.name = name;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Aliment [name=" + name + ", price=" + price + "]";
}


 
}
class Food extends Aliment{
 private double weight;    
 // kg

public Food(String name, float price, double weight) {
	super(name, price);
	this.weight = weight;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

@Override
public String toString() {
	return "Food [weight=" + weight + "]";
}



	
}
class Drink extends Aliment{
 private double volume;  
 // L

public Drink(String name, Float price, double volume) {
	super(name, price);
	this.volume = volume;
}

public double getVolume() {
	return volume;
}

public void setVolume(double volume) {
	this.volume = volume;
}

@Override
public String toString() {
	return "Drink [volume=" + volume + "]";
}

}


//есть так же класс места где это все подают
//допишите логику так чтобы
//2) в массив с пищей воявилось 6 обьектов (3 - напитки / 3 - еда  )
//3) printMenu() вывел на экран перечень всех пунтков
//4) printMenu(int,int) вывел на экран перечень всех пунтков меню с этим диапазоном стоимости!
class Restaurant{
 private String name;
 private Aliment[] menu; 
 Drink d;
 Food f;// список блюд и напитков (ПОЛИМОРФИЗМ!)
 public Restaurant(String name ){
     this.name = name;
     this.menu = new Aliment[6]; // резервируем 6 пунтков меню!
     // первые 3 - напитки
     for(int i = 0; i < 3; i++){
         this.menu[i] = new Drink(d.getName(), d.getPrice(), d.getVolume());
     }
     // след 3 - еда
     for(int i = 3; i < 6; i++){
         this.menu[i] = new Food(f.getName(), f.getPrice(), f.getWeight());
     }
 }
 public void printMenu(){
	 for(int i = 0; i <6; i++){
         System.out.println(this.menu[i]);
 }
 }
 public void printMenu(int min_price,int max_price){
	 if(d.getPrice()<min_price&&d.getPrice()>max_price){
 
	 for(int i = 0; i <3; i++){
         System.out.println(this.menu[i]);
	 } 
	 if(f.getPrice()<min_price&&f.getPrice()>max_price){
		 
		 for(int i = 3; i <6; i++){
	         System.out.println(this.menu[i]);
		 } 
 }else{System.out.println("");}
 }
}
 
}
