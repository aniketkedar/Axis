package Day11;

import java.util.ArrayList;

public class Demo {
    private int data;

    public Demo(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
    public static void main(String[] args) {
        ArrayList<Demo> list = new ArrayList<Demo>();

        // Adding elements to the ArrayList
        list.add(new Demo(1));
        list.add(new Demo(2));
        list.add(new Demo(3));

   
        for (Demo d : list) {
            System.out.println(d.getData());
        }

        list.remove(1); 
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 0: " + list.get(0).getData());
    }
}

