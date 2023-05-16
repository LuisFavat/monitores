package ejercicios.ejercicio4;

public class RunEj4
{
    public static void main(String[] args) {

        Barrier barrier = new Barrier(3);
        
        BarrierUser u1 = new BarrierUser(barrier, "a", 1);
        BarrierUser u2 = new BarrierUser(barrier, "b", 2);
        BarrierUser u3 = new BarrierUser(barrier, "c", 3);


        u1.start();
        u2.start();
        u3.start();

    }
}
