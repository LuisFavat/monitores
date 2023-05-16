package ejercicios.ejercicio1;
public class RunEj1 
{
    public static void main(String[] args) {
        var adder = new Adder();

           for (int i = 0; i < 10; i++)
           {
                var tx = new Counter(adder, "" + i);
                tx.start(); 
           }
    }
}