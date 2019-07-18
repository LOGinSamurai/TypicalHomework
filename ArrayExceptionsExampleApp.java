import java.util.Scanner;
 public class ArrayExceptionsExampleApp{
    public static void main(String[] args){
 Container c = new Container(5);
 Box b = new Box("Some_Value");
 c.setBox(6,b);
 
 Scanner in = new Scanner(System.in);
  String a = in.nextLine();
  System.out.println(a);
  
    }
}

// ����������� ���� ����� ������� ���������� � ��������� ������
class Container {
    private Box[] boxes ;

	public Container(Integer box_number) {
		this.setBoxes(new Box[box_number]);
	}

	public Box[] getBoxes() {
		return boxes;
	}

	public void setBoxes(Box[] boxes) {
		this.boxes = boxes;
	}
 
	public void setBox(int index, Box box) {
		try{this.boxes[index] = box;}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("The index "+index+" does not exist!");}
    }
	 
}
// � ��� �� ���� ����� ������� ������� � ��������� ���� "String" ������
class Box {
    private String content;

	public Box(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
}


// 1) �������� ������� �����������, ������, ������
// 2) ����������� ������ "Container" �������� ���-�� �������
//    � � - ��������� ������� ������ �������� ������ �������
//    ����. Container c = new Container(3) ����� ������� ������ boxes 
//    � 3 ��������
// 3) ������ setBox(int index, Box box)  ��������� ������� �� ��������� 
//    index ��� ���� ����� ���������� �������� ����� �� ��������� �� 
//    �������������� ������ "ArrayIndexOutOfBoundsException", � ����� ������
//    �� ��������� ���� ��������� ����������� � �� �� ������� ����� �������� � ���
//    ����� ���������� try {} catch() {}  ��������� ���� ����� � �������� �����
//    ��������� ����� �������� - ���� ��������� ������ ������ ��������� 
//    "The index XX does not exist!" 