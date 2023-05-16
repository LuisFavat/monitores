package ejercicios.ejercicio7;

public class RWb implements RW
{
    private int data;
    private boolean isWritten = false;
    private boolean writing = false;
    private boolean writerWaiting = false;
    private boolean wasRead = false;
    private int amonuntOfReaders = 0;

    public synchronized void beginRead() throws InterruptedException
    {
        //mientras el buffer no haya sido escrito que esperen pues no hay nada que leer
        /* 
        while(!isWritten)
        {
            wait();
        }

        while(writerWaiting)
        {
            wait();
        }

        
        if(amonuntOfReaders == 0 )
        {
            while(writing)
            {
                wait();
            }
        }
        */
        if(amonuntOfReaders == 0)
        {
            while(!isWritten || writerWaiting || writing )
            {
                wait();
            }
        }
        while(writerWaiting)
        {
            wait();
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
        wasRead = true;
       
    }

    public int read()
    {
        return data;
    }

    public synchronized void beginWrite() throws InterruptedException
    {


        while(amonuntOfReaders != 0 && writing || wasRead) 
        {
            if(!writerWaiting)
            {
                writerWaiting = true;
            }
            wait();
        }
        writing = true;
        
    }

    public synchronized void endWrite()
    {
        writing = false;
        writerWaiting = false;
        wasRead = false;
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
