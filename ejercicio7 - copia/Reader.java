package ejercicios.ejercicio7;
import java.util.Random;

public class Reader extends Thread
{
    
    RW myRW;
    int min;
    int max;

    public Reader(RW aRw, int aMin, int aMax)
    {
        myRW = aRw;
        min = aMin;
        max = aMax;
    }

    public void run()
    {
        try {
            myRW.beginRead();
            int data = myRW.read();
            
            //mega super calculo costoso
            Random rand = new Random(System.currentTimeMillis());
            int index = rand.nextInt(2)* (max - min) + min;
            int result = 1;
            for(int i = 1; i < index; i++)
            {
                result ++;
            }
            //end calculo costoso
            myRW.endRead();
        } catch (InterruptedException e) {
            System.out.println("exploto el reader");
            e.printStackTrace();
        }
        
    }
}
