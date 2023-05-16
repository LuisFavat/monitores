package ejercicios.ejercicio4;

public class BarrierUser extends Thread
{
    Barrier myBarrier;
    String firstData;
    int secondData;

    public BarrierUser(Barrier aBarrier, String aFirstData, int aSecondData)
    {
        myBarrier = aBarrier;
        firstData = aFirstData;
        secondData = aSecondData;
    }

    public void run()
    {
        System.out.println(firstData);
        myBarrier.toWait();
        System.out.println(secondData);

    }
}