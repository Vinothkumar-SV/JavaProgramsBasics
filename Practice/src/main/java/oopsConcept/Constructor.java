package oopsConcept;

public class Constructor {
	int ID;
	  String Name;
	  String Dept;
	  int age;
	  

	  public Constructor(int ID, String Name,String Dept,int age) {
	  this.ID = ID;
	  this.Name= Name;
	  this.Dept= Dept;
	  this.age= age;
	  }
	  public static void main(String[] args) {
		Constructor cons = new Constructor(120,"Vinoth","Test Engineer",27);
		//Constructor cons1 = new Constructor(121,"Vinoth Kumar","Automation Engineer",28);
		//Constructor cons2 = new Constructor(122,"Vinoth Jackson","CEO",28);
	    System.out.println(cons.Dept);
	    System.out.println(cons.Name);
	    System.out.println(cons.ID);
	
	  }
	  
	  }
