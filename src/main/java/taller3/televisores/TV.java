package taller3.televisores;

public class TV {
	
	private static int numTV;
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		
		numTV++;
	}
	
	public void canalUp() {
		if (canal < 120 && estado == true) {
			canal ++;
		}
	}
	
	public void canalDown() {
		if (canal > 1 && estado == true) {
			canal --;
		}
	}
	
	public void volumenUp() {
		if (volumen < 7 && estado == true) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (volumen > 0 && estado == true) {
			volumen--;
		}
	}
	
	//getters y setters
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if (estado == true && canal >= 1 && canal <= 120) {
			this.canal = canal;
		}
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		if (estado == true && volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
		}
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	
	

}
