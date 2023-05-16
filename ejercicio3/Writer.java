package ejercicios.ejercicio3;


public class Writer extends Thread
{
    
    private Buffer myBuffer;
    int data = 1;


    public Writer(Buffer aBuffer)
    {
        myBuffer = aBuffer;

    }

    public void run()
    {
        while(data != 9)
        {
            try 
            {
                myBuffer.write(data);
                //System.out.println("data: " + data);
                data++;
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
