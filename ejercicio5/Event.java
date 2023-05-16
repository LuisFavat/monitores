package ejercicios.ejercicio5;

public class Event {
    
    int ticket     = 0;
    int waitingForTicket = 0;

    public synchronized void subscribe()
    {
        waitingForTicket = ticket + 1;
        while(waitingForTicket > ticket)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void publish()
    {
        ticket++;
        notifyAll();
    }
}
