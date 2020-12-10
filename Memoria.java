/**
 * @author: Saúl Moreyra
 * @date: 09/12/2020
 * @time 10:48 p. m.
 * @proyect: Procesos
 * @email drone_cam@outlook.es
 */
public class Memoria {
    private int cantidadMemoria;

    public Memoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public int getMemoria() {
        return cantidadMemoria;
    }

    public void dameMemoria(int memoriaConsumida) {
        this.cantidadMemoria = cantidadMemoria - memoriaConsumida;
    }

    public void regresarMemoria(int memoriaConsumida) {
        this.cantidadMemoria = cantidadMemoria + memoriaConsumida;
    }
}
