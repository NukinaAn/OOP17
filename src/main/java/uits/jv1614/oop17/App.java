package uits.jv1614.oop17;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        
    B disk1 = new B("1 ", new A("Студент", "pop"), new A("БудуВуду", "rock"), new A("Алешка", "pop"),  new A("Молоком", "rock"));
	System.out.println(disk1);
	System.out.println();
	System.out.println();
        
        List<B> disk1 = new ArrayList<>();
		disk1.add(new B()
				.setname("Весняний")
				.setComponent("Студент", "pop")
				.setComponent(new Soft("Часник", 1))
				);
		System.out.println(salad2);
    B disk2 = new B("2 ", new A("Исповедь", "chanson"), new A("Купола", "chanson"), new A("Понты", "rap"), new A("Лондон", "rap") );
	System.out.println( disk2);
	System.out.println();
	System.out.println();
        
    }
}