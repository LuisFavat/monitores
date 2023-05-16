package ejercicios.ejercicio1;

public class Counter extends Thread
{

    private Adder myAdder;
    private String name;

    public void run()
    {
        System.out.println("thread " + name);
        myAdder.add(this);
    

    }


    public String Name()
    {
        return name;
    }

    public Counter(Adder aAdder, String aName)
    {
        myAdder = aAdder;
        name = aName;
    }
} 