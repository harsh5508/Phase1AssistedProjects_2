package phase1programs_2;

class Area {

public void getArea(int l, int b) {
 
	int area = l*b;
	System.out.println("Area: " + area);
}
}

class P8Encapsulation {
public static void main(String[] args) {

	Area r = new Area();
	r.getArea(2 , 16);
    }
}
