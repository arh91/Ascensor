
public class Principal {

    public static void main (String[] args){

        Cabina cabina = new Cabina();
        int destino;
        int plantaInicio=0;
        

        Viaje[] viaje = new Viaje[11];
        
        Thread[] v = new Thread[11];

        
        for(int i=1; i<11; i++){

        	do {
        		destino = (int) (Math.random() * (20 - 0)) + 0;
        	}while(destino == plantaInicio);
        	
        	viaje[i] = new Viaje (cabina, plantaInicio, destino, i);
        	v[i] = new Thread(viaje[i]);        	
        	v[i].start();
        	
        	
        	try {
				v[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	plantaInicio = destino;
        }

        
    }

}
