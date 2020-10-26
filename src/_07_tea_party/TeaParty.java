package _07_tea_party;

public class TeaParty {
	private String welcome;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String y = "";
		if (isWoman == true) {
			if (isKnighted == true) {
				y = "Hello " + "Lady " + name;
			} else {
				y ="Hello " + "Ms. " + name;
			}
		} else {
			if(isKnighted == true) {
				y= "Hello " + "Sir " + name;
			} else {
				y= "Hello " + "Mr. " + name;
			}

		}
System.out.println(y);
return y;
	}

}
