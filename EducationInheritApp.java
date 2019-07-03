

public class EducationInheritApp{
    public static void main(String[] args){
    	Educated E1 = new Educated("Ivan",(byte)7,8,(byte)5);
    	Educated E2 = new Pupil("Ivan",(byte)7,8,(byte)5,"Cantemir");
    	Educated E3 = new Student("Ivan",(byte)7,8,(byte)5,"MoldGU","programmer");
    	Educated E4 = new Master("Ivan",(byte)7,8,(byte)5,"MoldGU","Master");
    	E1.printInfo();
    	System.out.println();
    	E2.printInfo();
     	System.out.println();
    	E3.printInfo();
     	System.out.println();
    	E4.printInfo();
     	System.out.println();
    	
      // ��������� ������ ����� �����
      // �������� �������� � ������ �������
    }
}
////////////////////////////////////////////
// ����� ������������
class Educated{
  private String fullname;     // ���
  protected byte   age;          // �������
  private float  average_grade; // ���� ���
  protected byte   level;          // ������� ( ����  5-�� ����� )
	public Educated(String fullname, byte age, float average_grade, byte level) {
		this.fullname = fullname;
		this.age = age;
		if (average_grade>0 && average_grade<=10) {
		this.average_grade = average_grade;}else{System.out.println("invalid average_grade");};
		this.level = level;
	}
	public String getFullname() {
		return this.fullname;
	}
	public void setFullname(String fullname) {
		this.fullname=fullname;
	}
	
	public byte getAge() {
		return this.age;
	}
	public void setAge(byte age) {
		this.age=age;
	}
	
	public float getAverageGrade() {
		return this.average_grade;
	}
	public void setAverageGrade(float average_grade) {
		this.average_grade=average_grade;
	}
	
	protected byte getLevel() {
		return this.level;
	}
	protected void setLevel(byte level) {
		this.level=level;
	}
	protected void printInfo(){
		System.out.println("Fullname: "+getFullname() +"."+"("+getAge()+")");
		System.out.println("Class: "+getLevel());
		System.out.println("Grade: "+getAverageGrade());
	}
    
    // �������� ����������� � ������� ������� ��� ���� �������
    // �������� �������� �� ������ "average_grade" �������� 1..10
    // �������� ����� printInfo() ������� ������� ���� �� ���� �������� ���
        // > fullname: John Doe Jr. (17 years)
        // > class: 10
        // > grade: 9.75
}

// ����� ������ - �������� ��� ��� ���������� ������ "Educated"
class Pupil extends Educated{
String school_name;
	public Pupil(String fullname, byte age, float average_grade, byte level,String school_name) {
		super(fullname, age, average_grade, level);
		this.school_name=school_name;
    }

	public byte getLevel() {
		if(level >=1 && level<12){
		return level;}else {return 0;}
	}
	public void setLevel(byte level) {
		if(level >=1 && level<12){
			this.level=level;}else{this.level=0;}}
		
		public byte getAge() {
			if(age >=6 && age<=20){
			return age;}else {return 0;}
		}
		public void setAge(byte age) {
			if(age >=6 && age<=12){
				this.age=age;}else{this.age=0;}
	 
	}
		protected void printInfo(){
			System.out.println("Fullname: "+getFullname() +"."+"("+getAge()+")");
			System.out.println("Class: "+getLevel());
			System.out.println("Grade: "+getAverageGrade());
			System.out.println("School name: "+school_name);
		}
    // �������� ��� ����� ��� �� ������/������ - "school_name"
    // �������� ����������� ������� ��������� �����
    // � ����������� � ������/������ �������� "level"  ��������
    // �������� ����� ����� ���� ��������� ������ 1..12 �������� �������
    // ��� �� � ����������� � ������ ������ �������� "age" �������� �� 
    // �������� � ��������� 6..20 ���
    // printInfo() �������� ����� �������� �������� �������
}

// ����� �������� - �������� ��� ��� ���������� ������ "Pupil"
class Student extends Pupil{
	String university_name;
	String speciality;
	public Student(String fullname, byte age, float average_grade, byte level,
			String university_name,String speciality) {
		super(fullname, age, average_grade, level,university_name);//
		//�� ������ ������� ������ �� �������� ��� ���� �������� (String)
		this.university_name=university_name;
		this.speciality=speciality;
	}
	public byte getLevel() {
		if(level >=1 && level<7){
		return level;}else {return 0;}
	}
	public void setLevel(byte level) {
		if(level >=1 && level<7){
			this.level=level;}else{this.level=0;}}
	public byte getAge() {
		if(age >=19 && age<=30){
		return age;}else {return 0;}
	}
	public void setAge(byte age) {
		if(age >=19 && age<=30){
			this.age=age;}else{this.age=0;}}
    protected void printInfo(){
			System.out.println("Fullname: "+getFullname() +"."+"("+getAge()+")");
			System.out.println("Class: "+getLevel());
			System.out.println("Grade: "+getAverageGrade());
			System.out.println("University name: "+university_name);
			System.out.println("Speciality: "+speciality);
		}
 
		
	
	
    // �������� ��� ������� ��� �� ������/������ - "university_name"
    // �������� ��� ����������� �������� ��� ��  - "speciality"
    // �������� ����������� ������� ��������� ������, �����������
    // � ����������� � ������/������ �������� "level"  ��������
    // �������� ����� ����� ���� ��������� ������ 1..7 �������� ������
    // ��� �� � ����������� � ������ ������ �������� "age" �������� �� 
    // �������� � ��������� 19..30 ���
    // printInfo() �������� ����� �������� �������� ��������
}

// ����� ������� - �������� ��� ��� ���������� ������ "Student"
class Master extends Student{

	public Master(String fullname, byte age, float average_grade, byte level,
			String university_name, String speciality) {
		super(fullname, age, average_grade, level, university_name,speciality);
		
	}
	public byte getLevel() {
		if(level >=1 && level<3){
		return level;}else {return 0;}
	}
	public void setLevel(byte level) {
		if(level >=1 && level<3){
			this.level=level;}else{this.level=0;}}
	public byte getAge() {
		if(age >=22 && age<=33){
		return age;}else {return 0;}
	}
	public void setAge(byte age) {
		if(age >=22 && age<=33){
			this.age=age;}else{this.age=0;}}
	 protected void printInfo(){
			System.out.println("Fullname: "+getFullname() +"."+"("+getAge()+")");
			System.out.println("Class: "+getLevel());
			System.out.println("Grade: "+getAverageGrade());
			System.out.println("University name: "+university_name);
			System.out.println("Speciality: "+speciality);
		}
    // � ����������� � ������/������ �������� "level"  ��������
    // �������� ����� ����� ���� ��������� ������ 1..3 �������� ���
    // ��� �� � ����������� � ������ ������ �������� "age" �������� �� 
    // �������� � ��������� 22..33 ���
    // printInfo() �������� ����� �������� �������� ��������
}

