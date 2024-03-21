package view;
import java.util.concurrent.Semaphore;

import controller.Metodos2;

public class Main2 {

	public static void main(String[] args) {
		Semaphore norte = new Semaphore(1);
		Semaphore sul = new Semaphore(1);
		
		for (int i = 0; i < 12; i++) {
			Thread aviao = new Metodos2(norte, sul, i);
			aviao.start();
		}
	}

}
