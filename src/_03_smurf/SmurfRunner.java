package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	Handy.eat();
	String name = Handy.getName();
	System.out.println(name);
}
}
