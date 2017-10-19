package uits.jv1614.oop17;


public  class A {
    private String name;
    private String style;
    private int time;
    private AList a = AList.a;
    private enum AList {a, Студент, Молоком, БудуВуду, Алешка, Исповедь, Купола,  Понты, Лондон}
    
public A(String name, String style) {
    this.name = name;
    this.style = style;
}
    
    int gettime() {
	switch (a.valueOf(name)){
            case Студент:
                time = 192; 
            break;
            case Молоком: 
                time = 199; 
            break;
            case БудуВуду: 
                time = 204; 
            break;
            case Алешка: 
                time = 245; 
            break;
            case Исповедь:
                time = 234; 
            break;
            case Купола: 
                time = 214; 
            break;
            case Понты: 
                time = 192; 
            break;
            case Лондон: 
                time = 178; 
            break;
                                        
	default: 
                time = 0; 
                System.out.println("песни нет");
		}
		return time;
	}
     
    String getstyle() {
        return style;
    }
        
    String getname() {
        return name;
    }
    public int compareTo(A p) {
        int result = this.style.compareTo(p.style);
        return result;         
    }

}
    
@Override
    public String toString() {
      return "Treck{ " + "name = " + name + ", time = " + time + '}';
    }
}

    


    

