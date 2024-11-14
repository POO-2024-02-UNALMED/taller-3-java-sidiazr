package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 120) {
			tv.setCanal(canal);
		}
	}
	
	public void setVolumen(int volumen) {
		if (volumen >= 0 && volumen <= 7) {
			tv.setVolumen(volumen);
		}
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
	
	//getters y setters
	
	public TV getTV() {
		return tv;
	}
	
	public void setTV(TV tv) {
		this.tv = tv;
	}

}
