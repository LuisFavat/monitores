package ejercicios.ejercicio7;

import java.util.Random;

public class Writer extends Thread
{
    RW myRW;
    int max;
    int min;

    public Writer(RW aRw, int aMin, int aMax)
    {
        myRW = aRw;
        max = aMax;
        min = aMin;
    }

    public void run()
    {
        try {
            myRW.beginWrite();
            //mega super calculo costoso
            Random rand = new Random(System.currentTimeMillis());
            int index = rand.nextInt(2)* (max - min) + min;
            int result = 1;
            for(int i = 1; i < index; i++)
            {
                result ++;
            }
            //end calculo costoso
            
            myRW.writing(result);
            myRW.endWrite();
        } catch (InterruptedException e) {
            System.out.println("exploto todo");
            e.printStackTrace();
        }
        
    }
}
