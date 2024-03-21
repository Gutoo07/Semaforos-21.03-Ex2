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
				manobrar(id, "Norte");
				taxiar(id, "Norte");
				decolar(id, "Norte");
				afastar(id, "Norte");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			} finally {
				norte.release();
			}
		} else {
			try {
				sul.acquire();
				manobrar(id, "Sul");
				taxiar(id, "Sul");
				decolar(id, "Sul");
				afastar(id, "Sul");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				sul.release();
			}
		}
		
		
	}

	private void manobrar(int id, String pista) {
		int sleep = (int) ((Math.random()*401) + 300);
		if (pista=="Norte") {
			System.err.println("Aviao #" + id + " esta manobrando na pista " + pista);
		} else {
			System.out.println("Aviao #" + id + " esta manobrando na pista " + pista);
		}
		try {
			sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void taxiar(int id, String pista) {
		int sleep = (int) ((Math.random()*501) + 500);
		if (pista=="Norte") {
			System.err.println("Aviao #" + id + " esta taxiando na pista " + pista);
		} else {
			System.out.println("Aviao #" + id + " esta taxiando na pista " + pista);
		}
		try {
			sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void decolar(int id, String pista) {
		int sleep = (int) ((Math.random()*201) + 600);
		if (pista=="Norte") {
			System.err.println("Aviao #" + id + " esta decolando na pista " + pista);
		} else {
			System.out.println("Aviao #" + id + " esta decolando na pista " + pista);
		}
		try {
			sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void afastar(int id, String pista) {
		int sleep = (int) ((Math.random()*501) + 300);
		if (pista=="Norte") {
			System.err.println("Aviao #" + id + " esta se afastando da pista " + pista);
		} else {
			System.out.println("Aviao #" + id + " esta se afastando da pista " + pista);
		}
		try {
			sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}
