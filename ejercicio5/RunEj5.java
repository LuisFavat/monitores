package ejercicios.ejercicio5;

public class RunEj5 {
    public static void main(String[] args) 
    {
            var event = new Event();

            var s1 = new Subscriber(1, event);
            var s2 = new Subscriber(2, event);
            var s3 = new Subscriber(3, event);
            var p1 = new Publisher(event);

            s1.start();
            s2.start();
            s3.start(); 
            p1.start();
    }
}
