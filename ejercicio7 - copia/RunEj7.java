package ejercicios.ejercicio7;

public class RunEj7 {
    public static void main(String[] args) {
        RWb rw = new RWb();
        Writer w1 = new Writer(rw, 15235, 356485);
        Writer w2 = new Writer(rw, 235, 548);
        Writer w3 = new Writer(rw, 5235, 9348);
        Writer w4 = new Writer(rw, 2535, 2548);
        Writer w5 = new Writer(rw, 11, 48);


        w2.start();
        w1.start(); 
        w3.start();
        w4.start();
        w5.start();
      
        for (int i = 0; i < 500; i++)
        {
            new Reader(rw, 9999999, 99999999).start();;

        }

       


    }
}
