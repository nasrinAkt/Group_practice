package non_staticexample;

public class non_static {

	public static void main(String[] args) {
		
		non_static my = new non_static();
		my.name();
		non_static lamp = new non_static();
		lamp.mobile();
		
		non_static.laptop();
		
		non_static.computer();
		
		
	}

public void name() {
int a = 642;
int b = 754;
int c = a+b;
System.out.println(c);
	
	}
	
public void mobile() {
double a = 10.56;
double b = 22.44;
double c = a*b;
System.out.println(c);
	
	
	
}
public static void laptop() {
String city = "jamaica";
String state = ",newyork";
String address = city + state;
System.out.println(address);
	
	
}
public static void computer() {
char a = 'h';
System.out.println(a);
	
	
}


	
}
