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
	
boolean a = true;
  
	
while(a==true) {
	System.out.println("������� ������������ �����?");
	String yes = in.nextLine();
	if(yes!="��"){a=false;}
	
	 System.out.println("������� ����� �����");
	int num = in.nextInt();
System.out.println("������� ��� �����");
	int row = in.nextInt();
	 
	  if(num==0){System.out.println("������ ����� �� ����������");}else{ num=num-1;}
	  if(row==0){System.out.println("������ ���� �� ����������");}else{ row=row-1;}
	 if (room[row][num]==-1||room[row][num]==1){System.out.println("����� ����������");}
	 else{System.out.println("��������� �����: "+price[row]+"lei");};
System.out.println("���������� �������?");

	String str = in.nextLine();
	 if(str=="��"){room[row][num]=1;}
	 
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
	 System.out.println("���������� ��������� ����: " + k);
	 
}
if(a==false){System.out.println("����������");}
}
}