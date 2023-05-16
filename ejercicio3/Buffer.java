package ejercicios.ejercicio3;

public class Buffer {
    private int[] buffer;
    private int writePlace;
    private int readPlace;

    public Buffer(int bufferSize)
    {
        buffer = new int[bufferSize + 1];
        writePlace   = 0;
        readPlace   = 0;
    }

    public synchronized int read() throws InterruptedException
    {
        //se usa while porque sigue desde el wait
        while(isEmpty())
        {
            System.out.println("reader waiting: " );
            wait();
        }

        System.out.println("buffer read: " + buffer[readPlace] );
        readPlace = next(readPlace);
        notifyAll();
        return buffer[readPlace];
    }

    public synchronized void write(int aInt)throws InterruptedException
    {
        while(isFull())
        {
            System.out.println("writer waiting: " );
            wait();
        }
        buffer[writePlace] = aInt;
        System.out.println("buffer write: " + buffer[writePlace] );
        writePlace = next(writePlace);
        notifyAll();
    }

    private boolean isFull()
    {
        return next(writePlace) == readPlace;
        /* aca deberia haber sido |el valor absoluto|
        if(writePlace - readPlace == 1)
        {
            return true;
        }
        return false;
        */
    }

    private boolean isEmpty()
    {
        return writePlace == readPlace;
    }


    private int next(int aPlace)
    {
        int place = (aPlace+1)%(buffer.length);
        //System.out.println("place: " + place);
        return place;
    }
     
}
