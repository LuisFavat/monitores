package ejercicios.ejercicio7;

public class RWa implements RW
{

    private int data;
    private boolean isWritten = false;
    private boolean writing = false;
    private int amonuntOfReaders = 0;

    public synchronized void beginRead() throws InterruptedException
    {
        //mientras el buffer no haya sido escrito que esperen pues no hay nada que leer
        while(!isWritten)
        {
            wait();
        }
        
        if(amonuntOfReaders == 0)
        {
            while(writing)
            {
                wait();
            }
        }
        amonuntOfReaders++;
        System.out.println("reading " + data);
        

    }

    public synchronized void endRead()
    {
        amonuntOfReaders--;
        if(amonuntOfReaders == 0)
        {
            notifyAll();
        }
       
    }

    public int read()
    {
        return data;
    }

    public synchronized void beginWrite() throws InterruptedException
    {
        while(amonuntOfReaders != 0 && writing) 
        {
            wait();
        }
        writing = true;
        
    }

    public synchronized void endWrite()
    {
        writing = false;
        notifyAll();
    }

    public synchronized void writing(int aData)
    {
        data = aData;
        if(!isWritten)
        {
            isWritten = true;
        }
        System.out.println("writing******************************************** " + aData);
    }
}
