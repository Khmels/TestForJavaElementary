package homeTask;


import java.util.List;

public class Task2 {

    public <T> void addToList(T[] t, List<T> list){
        for (int i = 0; i < t.length; i++) {
            list.add(t[i]);
        }
        System.out.println(list);
    }

}
