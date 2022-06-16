package oopsConcept;

public class MultilevelChild2 extends MultilevelChild1 {
public void resourse() {
	System.out.println("This is resourse");
}
public static void main(String[] args) {
	MultilevelChild2 acess = new MultilevelChild2();
	acess.Fun(15, 20);
	acess.show(4, 10);
	acess.maintai();
	acess.resourse();
}}

