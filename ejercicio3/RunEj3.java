package ejercicios.ejercicio3;

public class RunEj3 {
    public static void main(String[] args) {
        Buffer buf = new Buffer(2);

        var w1 = new Writer(buf);
        var r1 = new Reader(buf);

        w1.start();
        r1.start();
    }
}
