 import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//import java.io.File;

public class Filework{
    public static Car[] cars;
    public static void main(String[] args){
        // 1) Создайте редактором файл который называется так "cars.txt"
        //    в текущую папку.
        // 2) Запишите в файл след. структуру:
        //    > BMW 1999 1000000 1000  
        //    > BMW 2011 10000 20000  
        //    > Mercedes 2002 20000 10000  

        //   это: модель год пробег стоимость

        // 3) Ниже приведен метод для чтения из данного файла
    	
   File file = new File("cars.txt");

	    try {
	        
	        if(!file.exists()){
	            file.createNewFile();
	        }

	       
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile());

	        try {
	             
	            out.print( "  BMW 1999 1000000 1000 "
	        			+ "\n BMW 2011 10000 20000 "
	        			+ "\n Mercedes 2002 20000 10000" );
	        } finally {
	           
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	 
    }
    /**
        метод который читает из файла
        он получает @param filename - путь до файла что нужно открыть
        суть метода:
        1) открыть файл через Scanner() + File()
        2) путем цикла while() + Scanner.hasNext() сделайте так
           чтобы метод загрузил в массив "cars" все данные
         * что это коммент тут с раскраской ;) ? javadoc?
     */
    public static void loadFileToArray( String filename ) {
    	 Scanner in = new Scanner(filename);
    /**
        метод который выведит список данных из массива "cars"
        суть метода:
        1) цикл for (each) по массиву "cars"
        2) используя Car.toString() преобразует результат
           на экране в такой
           > 1. CAR: BMW 1999 1000000km  1000USD
           > 2. CAR: BMW 2011 10000km   20000USD
           > 3. ....
     */
    }
    public static void printArrayData() {

    }
}

class Car{
    String model;
    Integer year;
    Integer km;
    Integer price;
    // добавить конструктор и toString()
    // БОНУС - валидировать данные (вдруг отрицательный год или прайс)
}
