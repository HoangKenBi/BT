package session3;

import ass.Account;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.run();
        Dog d = new Dog();
        d.run();
        d.eat();
        BullDog bd = new BullDog();
        bd.run();
    }



    public static void main2(String[] args){
        int[] intarray = new int[5];
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Hello world");
        arrayList.add(new Account());
        arrayList.remove(1);
        //arrayList.remove("Hello world");
        System.out.println(arrayList.size());

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("Hello");
        strArray.add("world");

        // cách 1 ngắn hơn
        for(String s: strArray){
            System.out.println(s);
        }

        /* cách 2 dài hơn
        for(int i = 0; i < strArray.size(); i++){
            System.out.println(strArray.get(i));
        }
        */

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(11);
        ArrayList<Double> dArr = new ArrayList<>();
        dArr.add(5.5);

    }
}
