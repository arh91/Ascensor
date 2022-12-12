
public class Viaje extends Thread{

	Cabina cabina;
	int destino;
	int plantaInicio;
	int numeroViaje;
	
	

	public Viaje(Cabina cabina, int plantaInicio, int destino, int numeroViaje) {
		super();
		this.cabina = cabina;
		this.plantaInicio = plantaInicio;
		this.destino = destino;
		this.numeroViaje = numeroViaje;
	}



	public void run() {
					
			if(destino>plantaInicio) {
				cabina.subePersona(plantaInicio, destino, numeroViaje);
			}
			if(destino<plantaInicio) {
				cabina.bajaPersona(plantaInicio, destino, numeroViaje);
			}
			
	}
}
