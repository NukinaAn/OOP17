package uits.jv1614.oop17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class B {
    
    private String name; 
    private String Components;
    List<A> music;
    
public B(){
    music = new ArrayList<>();
}

public B(String name, A...Components){ 
    this.name = name;
    music = new ArrayList<>();
    for (A v : Components) {
	this.music.add(v);
		}
}
    public B setname(String name) { 
        this.name = name;
        return this;
    }
    public String getname() {
        return name;
    }

    public B setComponents(A f) {
	this.music.add(f);
	return this;
    }
    public String getComponents() {
        return Components;
    } 
    
private int presentCalor(){ 
    int f = 0;
    for(A c: music){
        f += Math.round((int) c.gettime() * 4); 
    }
        return f;
}  


public class Comp implements Comparator<A> { 
  @Override
	public int compare(A one, A two) {
            if (one.getstyle() == two.getstyle()){
		return 1;
            }else if (one.getstyle () != two.getstyle ()){
                return -1;
                
            }
      return 0;
        
        }
}

@Override
    public String toString() {
    music.sort(new Comp());
    int a = this.presentCalor();
    String s = "Диск " + this.getname()+ ": \n";
        for (A f: music) {
            if ( f.gettime() > 190 && f.gettime() <= 200){ 
            System.out.println("Заданный трек: " + f.toString()); 
            }
            s = s + f.getname() + "  " + f.gettime() + " сек " + f.getstyle() +"\n";
        }
	return s + "Продолжительность альбома " + a + " сек " ;
    }
}
    



public class SortComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
