
public class ReastaurantObjectsAppRU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//����������� ���� 3 ������
//���-�� ��� ����� ����������� ��� ����
//1) �������� constructor,setters,getters,tostring
class Aliment{
 private String name;
 private String price;
public Aliment(String name, String price) {
	this.name = name;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
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

public Food(String name, String price, double weight) {
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

public Drink(String name, String price, double volume) {
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


//���� ��� �� ����� ����� ��� ��� ��� ������
//�������� ������ ��� �����
//2) � ������ � ����� ��������� 6 �������� (3 - ������� / 3 - ���  )
//3) printMenu() ����� �� ����� �������� ���� �������
//4) printMenu(int,int) ����� �� ����� �������� ���� ������� ���� � ���� ���������� ���������!
class Restaurant{
 private String name;
 private Aliment[] menu;  // ������ ���� � �������� (�����������!)
 public Restaurant(String name){
     this.name = name;
     this.menu = new Aliment[6]; // ����������� 6 ������� ����!
     // ������ 3 - �������
     for(int i = 0; i < 3; i++){
         this.menu[i] = new Drink(Drink.classgetName(), getPrice(), GetVolume());
     }
     // ���� 3 - ���
     for(int i = 0; i < 3; i++){
         this.menu[i] = new Food(????);
     }
 }
 public void printMenu(){
     ???
 }
 public void printMenu(int min_price,int max_price){
     ???
 }
 
}
