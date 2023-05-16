package ejercicios.ejercicio3;

public class Reader extends Thread
{

    Buffer myBuffer;
    int reads = 1;

    public Reader(Buffer aBuffer)
    {
        myBuffer = aBuffer;
    }

    public void run() 
    {
        while(reads != 9)
        {
            try 
            {
                myBuffer.read();
                //System.out.println("reads: " + reads);
                reads++;
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
