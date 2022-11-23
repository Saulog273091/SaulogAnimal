import java.util.*;
public class RunAnimal {
        

    public static void main(String[] args) {
    	String choice;
        Scanner sc = new Scanner(System.in);
      Bird b = new Bird();
      Cat c = new Cat();
      Dog d = new Dog(); 
    System.out.println("Choose an Animal. B for Bird, C for Cat, or D for Dog: " );
    	choice = sc.nextLine();
    if(choice.equalsIgnoreCase("B")){
    b.eat();
    b.sleep();
    b.makeSound();
    }
    else if(choice.equalsIgnoreCase("C")){
    c.eat();
    c.sleep();
    c.makeSound();	
    }
    else if(choice.equalsIgnoreCase("D")){
    d.eat();
    d.sleep();
    d.makeSound();	
    }
    else{
    	System.out.println("Invalid Input!!!");
    }	 
    }
}
