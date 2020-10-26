package _99_extra;

public class PixelPartyRunner {
	public static void main(String[] args) {
		PixelParty Pixel = new PixelParty();
		Pixel.setColor(1, 0, 1);
		Pixel.drawCircle(200, 200, 200);
		Pixel.drawRectangle(50, 50, 50, 50);
		Pixel.drawTriangle(50, 50, 50, 50, 50, 50);
		Pixel.drawCircle(60, 45, 65);
		Pixel.drawRectangle(56, 65, 76, 89);
		Pixel.drawTriangle(56, 89, 87, 65, 45, 32);
		Pixel.drawCircle(70, 70, 70);
		Pixel.drawRectangle(60, 90, 60, 50);
		Pixel.drawTriangle(65, 67, 65, 45, 32, 43);
		Pixel.saveImage();
		Pixel.displayImage();
	}
}
