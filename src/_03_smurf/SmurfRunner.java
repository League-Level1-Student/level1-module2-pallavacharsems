package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		String name = Handy.getName();
		System.out.println(name);
		Handy.eat();
		Smurf Papa = new Smurf("Papa");
		String nam = Papa.getName();
		String red = Papa.getHatColor();
		String boy = Papa.isGirlOrBoy();
		System.out.println(nam);
		System.out.println("My hat color is " + red);
		System.out.println("I am a " + boy);
		Smurf Smurfette = new Smurf("Smurfette");
		String na = Smurfette.getName();
		String white = Smurfette.getHatColor();
		String girl = Smurfette.isGirlOrBoy();
		System.out.println(na);
		System.out.println("My hat color is " + white);
		System.out.println("I am a " + girl);
	}
}
