
public class Administrador{

    public static void main(String[] args) {
        Memoria memoryGlobal = new Memoria(1000);

        new Thread(new Proceso(1,memoryGlobal, 600, 5)).start();
        new Thread(new Proceso(2,memoryGlobal, 800, 4)).start();
        new Thread(new Proceso(3,memoryGlobal, 300, 8)).start();
        new Thread(new Proceso(4,memoryGlobal, 800, 10)).start();
        new Thread(new Proceso(5,memoryGlobal, 900, 5)).start();
        new Thread(new Proceso(6,memoryGlobal, 1000, 4)).start();
        new Thread(new Proceso(7,memoryGlobal, 300, 8)).start();
        new Thread(new Proceso(8,memoryGlobal, 500, 10)).start();
    }
}