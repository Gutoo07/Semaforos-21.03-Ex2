package controller;
import java.util.concurrent.Semaphore;

public class Metodos2 extends Thread {
	private Semaphore norte;
	private Semaphore sul;
	private int id, pista;
	
	public Metodos2(Semaphore norte, Semaphore sul, int i) {
		id = i;
		this.norte = norte;
		this.sul = sul;
	}
	
	public void run() {
		pista = (int) ((Math.random()*2) + 1);
		if (pista == 1) {
			try {
				norte.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			} finally {
				norte.release();
			}
		} else {
			try {
				sul.acquire();
				manobrar(id);
				taxiar(id);
				decolar(id);
				afastar(id);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				sul.release();
			}
		}
		
		
	}

	private void manobrar(int id) {
		
	}

	private void taxiar(int id) {
		
	}

	private void decolar(int id) {
		
	}

	private void afastar(int id2 {
		
	}

	
}
