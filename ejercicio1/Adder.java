package ejercicios.ejercicio1;

public class Adder 
{
    private int count = 0;

    public synchronized void add(Counter counter)
    {

            count++;
            System.out.println("Thread " + counter.Name()  + " count = " + count);

    }

}


