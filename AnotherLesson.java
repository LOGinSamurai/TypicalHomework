import java.util.Scanner;
public class AnotherLesson {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[]product_array={"ogurtzi","kolbasa","Xleb","pelmeny" };
		
     	   float[]price_array={10.00f,150.00f,0.50f,40.0f};
		float min = in.nextFloat();
		float max = in.nextFloat();
		for (int i=0 ;i<product_array.length;i++){
			if(price_array[i]>max&&price_array[i]<min){System.err.println("invalid price");}else{
		System.out.println(product_array[i]+": "+price_array[i]+"$");};}
		
	}

}
