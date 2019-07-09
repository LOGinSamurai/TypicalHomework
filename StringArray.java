import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
	String[] locations;
	locations = new String[5];
	//Scanner in = new Scanner(System.in);
	 //щбьектов стоько же сколько индикаторов new
	locations[0]= "Chishinau,Eminescu,101";
	locations[1]= "Chishinau,Eminescu,88";
	locations[2]= "Chishinau,Vieru,1";
	locations[3]= "Chishinau,Micle,2";
	locations[4]= "Chishinau,Tighina,65";
	for(int i=0 ;i<5;i++){
		String[] parts = locations[i].split(",");
		 System.out.println("City."+parts[0]+" Street."+parts[1]+" №."+parts[2]);
	 
		// locations[i]=in.nextLine();
		
	}
	}

}
