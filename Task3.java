package homeTask;


public class Task3 {
    private int value = 0;

    //синхронизация по классу
    public int getNextValue () {
        synchronized (homeTask.Task3.class) {
            return value++;
        }
    }

    // синхронизация по методу
    public synchronized int getNextValue(int value){
        return value++;
    }

    // синхронизация по данным
    public int getNextValue(int value,int value1){
        synchronized (this) {
            return value++;
        }
    }
}




