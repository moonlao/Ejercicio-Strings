import java.util.ArrayList;
import processing.core.PApplet;

public class Main extends PApplet{

	String[] texts;
	ArrayList<String> words;
	ArrayList<clasePalabra> palabritas;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}

	
	
	public void settings() {
		size(400, 400);
		words = new ArrayList<String>();
		palabritas = new ArrayList<clasePalabra>();
	}
	
	public void setup() {
		texts = loadStrings("assets/strings.txt");
		
		for (int i = 0; i < texts.length; i++) {
			String[] arrayWords = texts[i].split(" ");
			for (int j = 0; j < arrayWords.length; j++) {
				words.add(arrayWords[j]);
			}
		}
		
		for (int i = 0; i < words.size(); i++) {
			palabritas.add(new clasePalabra(words.get(i),random(20, 380),random(20, 380)));
	
		}
	}
	
	public void draw() {
		background(220);
		
		fill(0);
		for (int i = 0; i < palabritas.size(); i++) {
			text(palabritas.get(i).getPalabra(),palabritas.get(i).getPosX(),palabritas.get(i).getPosY());
		}
	}
	
}
