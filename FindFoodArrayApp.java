import java.util.Scanner;
public class FindFoodArrayApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final float MDL_TO_EURO =19.50f;
		String[] food = {
				"Pizza,400g,70MDL",
				"Lazanga,500g,100MDL",
				"Mamaligue,1000g,20MDL",
				"Tiramisou,150g,150MDL",
				"Caesar,300g,50MDL",
				};
		System.out.println("Minimal Weight?");
		int min_gramms = in.nextInt();
		System.out.println("Maximal Weight?");
		int max_gramms = in.nextInt();
		
		System.out.println("Minimal price?(MDL)");
		int min_price = in.nextInt();
		System.out.println("Maximal price?(MDL)");
		int max_price = in.nextInt();
		for(String f :food) {
			String[] parts = f.split(",");
			if (min_gramms<=Integer.parseInt(parts[1].replace("g", ""))&&
				max_gramms>=Integer.parseInt(parts[1].replace("g", ""))&&
				 (min_price<=Integer.parseInt(parts[2].replace("MDL", ""))&&
				   max_price>=Integer.parseInt(parts[2].replace("MDL", "")))){
				 System.out.println(parts[0]+" "+
					Math.round ((Integer.parseInt(parts[2].replace("MDL",""))/MDL_TO_EURO)*100)/100.0+"EURO");}
			//else {System.out.println("***");}
			 
		}
		
	
	 
		
	 

	}
}


