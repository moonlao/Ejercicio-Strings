
public class clasePalabra {

	String palabra;
	float posX;
	float posY;
	
	//en este constructor me tocó cambiar los parámetros de int a float porque no me agarraba con int'
	public clasePalabra(String palabra, float posX, float posY) {
		this.palabra = palabra;
		this.posX = posX;
		this.posY = posY;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}
