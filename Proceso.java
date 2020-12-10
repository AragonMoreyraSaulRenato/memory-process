import java.util.Random;

public class Proceso implements Runnable {
    private int identificador;
    private int memoriaConsumida;
    private int tiempo;
    private Memoria memoriaGlobal;

    public Proceso(int identificador, Memoria memoria, int memoriaConsumida, int timepo){
        this.identificador = identificador;
        this.memoriaConsumida = memoriaConsumida;
        this.memoriaGlobal = memoria;
        this.tiempo = timepo;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            System.out.println("INICIO proceso "+identificador);
            while (true){
                if(memoriaConsumida <= memoriaGlobal.getMemoria() ){
                    int memoriaRestante = memoriaGlobal.getMemoria() - memoriaConsumida;
                    memoriaGlobal.dameMemoria(memoriaConsumida);
                    System.out.println(identificador + " PROCESO" + " tomo "+ memoriaConsumida + " memoria global " + memoriaRestante);
                    Thread.sleep(tiempo * 1000);
                    memoriaGlobal.regresarMemoria(memoriaConsumida);
                    System.out.println(identificador + " PROCESO" + " dejo "+ memoriaConsumida + " memoria global " + memoriaGlobal.getMemoria());
                    break;
                }else {
                    System.out.println(identificador + " PROCESO" + " requiere memoria "+ memoriaConsumida + " Memoria disponible "+memoriaGlobal.getMemoria());
                    Thread.sleep(getRandomNumber(3));
                }
            }
        }catch (InterruptedException e) {}
        long end = System.currentTimeMillis();
        System.out.println("TERMINO proceso "+identificador + " Tiempo: " + ((end - start) / 1000));
    }

    private int getRandomNumber (int segundos) {
        return new Random().nextInt(1000) * segundos;
    }
}