package ejercicios.ejercicio7;

public interface RW {
    public void beginRead()throws InterruptedException;
    public void endRead();
    public void beginWrite()throws InterruptedException;
    public void endWrite();
    public void writing(int aData);
    public int read();

}
