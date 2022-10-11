package com.harunaydin.tutorials;

import java.sql.SQLOutput;
import java.util.*;

public class JavaTutorials {
    public static void main(String[] args) {
        /*
        Set ->  küme (aynı elemanları tutamas)
        HashSet         -Sıralama Önemsiz
        LinkedHashSet   -Girilen sırayla yazdırır
        TreeSet         -Küçükten büyüğe sıralar

        List -> Tekrarlanan verilere izin verilir
        ArrayList       -Aramada o1 Silmede on
        LinkedList      -Aramada on Silmede o1
        Vector          -.capacity() = 10  .capacity(10,5) ilk kapasite 10 sonra 5 5 artacak

        Queue -> element(ilk-atmaz) offer(ekler) peek(ilk-atmaz-null) pool(ilk-atar-null) remove(ilk-atar)
        LinkedList      -   Queue linkedList = new LinkedList();    FIFO
        PriorityQueue   -   Küçükten byüğe sıralar

        Map -> clear, get, put
        HashMap         -Sıralama önemsiz
        LinkedHashMap   -Koyduğu sıra geçerli
        TreeMap         -Key e göre sıralama yapacak küçükten büyüpğe yadan a-z

        Generics



1.
        for (Object o: hashSet) {
            System.out.println(o);
        }
2.
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
3.
        hashSet.forEach(item -> System.out.println(item));

        Set set = xMap.entrySet();
        Iterator iterator = set.Iterator();
        iterator.hasNext()...
         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);

        for (Integer i : arrayList) {
            System.out.println(i);
        }



    }
}
