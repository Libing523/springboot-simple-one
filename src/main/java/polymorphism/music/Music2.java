package polymorphism.music;


class Stringed extends Instrument{
	public void play(Note n) {
		System.out.println("Stringed.play()"+n);
	}
}

class Brass extends Instrument{
	public void play(Note n) {
		System.out.println("Brass.play()"+n);
	}
}

public class Music2 {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	
	public static void main(String[] args) {
		Wind wind = new Wind();
		Stringed stringed = new Stringed();
		Brass brass = new Brass();
		tune(wind);
		tune(stringed);
		tune(brass);

	}

}
