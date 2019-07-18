import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

public class InputIoutputStreamsApp {

	public static void main(String[] args) {
     saveToFile();
	 //loadFromFile();
		 
		}
	public static void saveToFile(){
    String firstname;
    String lastname;
    Integer age;
    //////////////////////INPUT FROM CONSOLE
    Scanner in =  new Scanner(System.in);
    
    System.out.println("Enter your firstame\n");
    firstname = in.next();
    System.out.println("Enter your lastname\n");
    lastname = in.next();
    System.out.println("Enter your age\n");
    age = in.nextInt();
    //////////////////////OUTPUT TO FILE
    try{
    FileWriter fr = new FileWriter("Person.txt",true);
    fr.write(firstname+" "+lastname+" "+age+"\n");
    fr.close();}
    catch(Exception e){
    	System.out.println("Error while saving file!");
    };
    
	}  
	public static void loadFromFile(){
		  String firstname;
		    String lastname;
		    Integer age;
		    /////////////////INPUT FROM FILE
		    try{
		    Scanner in = new Scanner(new File("Person.txt"));
		    firstname  = in.next();
		    lastname   = in.next();
		    age        = in.nextInt();
		    System.out.println(firstname+" "+lastname+" "+age+"\n");
		    }catch(Exception e){
		    	e.printStackTrace();
		    	System.out.println("Error while loading file!");
		    	}
	}
	}


