package ejercicios.ejercicio4;

public class Barrier
{
    int waitingSlots;
    boolean open = false;

    public Barrier(int aWaitingSlots)
    {
        waitingSlots = aWaitingSlots;
    }

    public synchronized void toWait() 
    {
        if(!open)
        {
            waitingSlots--;
            while(waitingSlots != 0)
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            open = true;
            notifyAll();
        }
        
    }

}