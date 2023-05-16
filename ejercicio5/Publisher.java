package ejercicios.ejercicio5;

public class Publisher extends Thread
{

    Event myEvent;

    public Publisher(Event aEvent)
    {
        myEvent = aEvent;
    }
    
    public void run()
    {
        //kkkkkkSystem.out.println("publishing");
        myEvent.publish();
    }
}
