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

// предположим есть класс обьекта контейнера с коробками внутри
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
// а так же есть класс обьекта коробки с значением типо "String" внутри
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


// 1) добавить классам конструктор, геттер, сеттер
// 2) конструктор класса "Container" получает кол-во коробок
//    т е - насколько большой массив выделить внутри обьекта
//    напр. Container c = new Container(3) долже создать массив boxes 
//    с 3 ячейками
// 3) сеттер setBox(int index, Box box)  установит коробку на указанный 
//    index при этом может возникнуть ситуация когда мы ссылаемся на 
//    несуществующий индекс "ArrayIndexOutOfBoundsException", в таком случае
//    по умолчанию ваша программа остановится и вы не сможете далее работать с ней
//    путем добавления try {} catch() {}  добейтесь того чтобы в ситуации когда
//    возникает такая проблема - ваша программа просто вывела сообщение 
//    "The index XX does not exist!" 
