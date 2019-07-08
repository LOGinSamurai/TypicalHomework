 public class DriverCarObjectsRu {

	public static void main(String[] args) {
		 Driver my_friend = new Driver("Vasile Vasilievici",1960);//создается новый бьект класса Driver
         my_friend.setCar( new Car("BMW",2000,(float)2.4,240,10000) );//свойству сar обьекта класса Driver присваются новые значения
         System.out.println( my_friend );//на экран выводится все свойства и методы оьекта my_friend
	}

}
class Car{
    private String model;       // "BMW", "Mercedes", "Ford"
    private    int year;        // 1999 .. 2018
    private  float volume;      // 1.2 .. 3.6 L
    private    int max_speed;   // 60 .. 300  km/h
    private    int price;       // 5000 .. 1000000 Euro
    // добавить contructor,set/get,toString
    // ограничения свойств написаны рядом 
	public Car(String model, int year, float volume, int max_speed, int price) {
		if(model=="BMW"|| model=="Mercedes" || model=="Ford") {
		this.model =  model;}else{System.out.println("Wrong model pal");}
		
		if(year<=2018&&year>=1999){
		this.year = year;}else{System.out.println("Wrong year pal");}
		
		if(volume<=3.6&&volume>=1.2){ 
		this.volume = (float)volume;}else{System.out.println("Wrong volume pal");}
		
		if(max_speed<=300 && max_speed>=60){
		this.max_speed = max_speed;}else{System.out.println("Wrong speed pal");}
		
		if(price<=1000000 && price>=5000){
		this.price = price;}else{System.out.println("Wrong price pal");}
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model=="BMW"|| model=="Mercedes" || model=="Ford") {
		this.model = model;}else{System.out.println("Wrong model pal");}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<=2018&&year>=1999){
		this.year = year;}else{System.out.println("Wrong year pal");}
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		if(volume<=3.6&&volume>=1.2){
		this.volume = (float)volume;}else{System.out.println("Wrong volume pal");}
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		if(max_speed<=300 && max_speed>=60){
		this.max_speed = max_speed;}else{System.out.println("Wrong speed pal");}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
	if(price<=1000000 && price>=5000){
		this.price = price;}else{System.out.println("Wrong price pal");}
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", volume=" + volume + ", max_speed=" + max_speed + ", price="
				+ price + ", getModel()=" + getModel() + ", getYear()=" + getYear() + ", getVolume()=" + getVolume()
				+ ", getMax_speed()=" + getMax_speed() + ", getPrice()=" + getPrice() + "]";
	}
	
}
class Driver{
    private String name;   // "Ion Petru" (как минимум 5 сивмоловб внутри должен быть 1 пробел смтр. класс String)
    private int    year;   // 1900 .. 2000
    private Car    car;    // ссылка на обьект из класса Car
	public Driver(String name, int year, Car car) {
		if(name.length()>5 && name.contains(" ")){
		this.name = name;}else{System.out.println("Wrong name format pal");}
		
		if(year<=2000&&year>=1900){
		this.year = year;}else{System.out.println("Wrong year pal");
		
		if(car.getModel()=="BMW"|| car.getModel()=="Mercedes")  {
		this.car = car;}else {System.out.println("wrong car pal");}
	}
	}
	
	public Driver(String name, int year) {
		if(name.length()>5 && name.contains(" ")){
			this.name = name;}else{System.out.println("Wrong name format pal");}
		
		if(year<=2000&&year>=1900){
		this.year = year;}else{System.out.println("Wrong year pal");}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>5 && name.contains(" ")){
			this.name = name;}else{System.out.println("Wrong name format pal");}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<=2000&&year>=1900){
		this.year = year;}else{System.out.println("Wrong year pal");}
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		if(car.getModel()=="BMW"|| car.getModel()=="Mercedes")  {
			this.car = car;}else {System.out.println("wrong car pal");}
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", year=" + year + ", car=" + car + ", toString()=" + super.toString() + "]";
	}

	 
	
	
    
    // добавить contructor,set/get,toString
    // ограничения свойств написаны рядом 
    // * примечания
    //      - конструктор Driver не дожен назначать сразу автомобиль - только имя и год рождения
    //        может же быть водитель без авто?
    //      - setter для свойства "car" должен принимать только авто марки "BMW" или "Mercedes" ;)
    //      - toString выдает как данные драйвера так и автомобиля на котором он ездит 
}


  // допишите код чтобы работал
  // и попытайтесь озвучить то что происходит в main()
  
