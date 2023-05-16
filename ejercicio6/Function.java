package ejercicios.ejercicio6;

import java.util.Random;

public class Function implements Runnable
{

    Promise myPromise;
    Random rand;

    public Function(Promise aPromise, int aSeed)
    {
        myPromise = aPromise;
        rand = new Random(aSeed);
    }

  
    public void run()
    {    
        int result = rand.nextInt();

        for(int i = 0; i<10000; i++)
        {
            result = result * i;
        }
    }



    public Future async(Object x)
    {
        Promise promise = new Promise();
        //crear un thread
        return promise;

    }
}
