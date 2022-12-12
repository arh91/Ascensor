
public class Cabina {

	boolean ocupado = false;
	int pesoActual = 0;
	int tiempo = 1000;

	
		
		public synchronized void subePersona(int plantaInicio, int plantaDestino, int numeroViaje) {
			
			if(ocupado) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			ocupado = true;
			
			System.out.println("Comienza el trayecto numero "+numeroViaje);
			System.out.println("\n");
			
			for(int i=plantaInicio; i<=plantaDestino; i++) {
				System.out.println("Planta "+ i);
				System.out.println("\n");
				
				try {
					Thread.sleep(tiempo);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			ocupado = false;
			
			System.out.println("Fin del trayecto numero "+numeroViaje);
			System.out.println("\n");
			System.out.println("\n");
			
			notify();
		}
			
		
		public synchronized void bajaPersona(int plantaInicio, int plantaDestino, int numeroViaje) {
			
			if(ocupado) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			ocupado = true;
			
			System.out.println("Comienza el trayecto numero "+numeroViaje);
			System.out.println("\n");
			
			for(int i=plantaInicio; i>=plantaDestino; i--) {
				System.out.println("Planta "+ i);
				System.out.println("\n");
				
				try {
					Thread.sleep(tiempo);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			ocupado = false;
			
			System.out.println("Fin del trayecto numero "+numeroViaje);
			System.out.println("\n");
			System.out.println("\n");
			
			notify();
			
		}
	
}
