 import java.util.Scanner;
public class BasicArrayTest {

	public static void main(String[] args) {
int[][] room = {
			     {-1, 0, 0, 0, 0, 0, 0,-1 },
			     { 0, 0, 0, 1, 1, 1, 0, 0 },
			     { 0, 0, 0, 0, 0, 0, 0, 0 },
			     { 0, 0, 0, 0, 0, 0, 0, 0 },
			     { 0, 0, 0, 0, 0, 0, 0, 0 }
			        };
			       
int[]   price = {
			      100,
			      100,
			       75,
			       75,
			       50
			     };
	Scanner in = new Scanner(System.in);
	Scanner in01 = new Scanner(System.in);
	
boolean a = true;
  
	
while(a==true) {
	System.out.println("Желаете збронировать место?");
	String yes = in01.nextLine();
	if(!yes.equals("да")){a=false;}
	
	 System.out.println("Введите номер места");
	int num = in.nextInt();
System.out.println("Введите ряд места");
	int row = in.nextInt();
	 
	  if(num==0){System.out.println("такого места не существует");}else{ num=num-1;}
	  if(row==0){System.out.println("такого ряда не существует");}else{ row=row-1;}
	 if (room[row][num]==-1||room[row][num]==1){System.out.println("Место недоступно");}
	 else{System.out.println("Стоимость места: "+price[row]+"lei");};
System.out.println("Подвердить покупку?");

	String str = in01.nextLine();
	 if(str.equals("да")){room[row][num]=1;}
	 
	 for(int j = 0;j<5;j++){
		for(int i = 0;i<8;i++){
			if(i%8==0){System.out.println(" ");}
			if(room[j][i]==-1){System.out.print(room[j][i]);}else {
			System.out.print(" "+room[j][i]);}
		} 
	 }
	 System.out.println("");
	 int k = 0 ;
	 for(int j = 0;j<5;j++){
			for(int i = 0;i<8;i++){
				if(room[j][i]==0){k++;}
			} 
		 }
	 System.out.println("Количество свободных мест: " + k);
	 
}
if(a==false){System.out.println("Досвидания");}
}
}
