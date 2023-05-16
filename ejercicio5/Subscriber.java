package ejercicios.ejercicio5;

public class Subscriber extends Thread
{
    int id;
    Event myEvent;

    public Subscriber(int aId, Event aEvent)
    {
        id = aId;
        myEvent = aEvent;
    }

    public void run()
    {
        //kkkkkkkkkkk,o,System.out.println("subscribe");
        myEvent.subscribe();
        System.out.println("hello " + id);
    }
}
