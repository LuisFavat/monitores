package ejercicios.ejercicio6;



public class Promise implements Future{
    
    private Object calculation = null;

    public synchronized Object get()
    {
        while(calculation == null)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return calculation;
    }

    public synchronized void set(Object aCalculation)
    {
        calculation = aCalculation;
        notifyAll();
    }

}
