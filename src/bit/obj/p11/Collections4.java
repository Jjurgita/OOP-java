package bit.obj.p11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Collections4 {
    /*
                COLLECTIONS - Queue, Deque (eilė)
     */
    public static void main(String[] args) {

        /*
            Queue, Deque - tai sąsajos panašios į sąrašą tik turinčios papildomas funkcijas ir apribojimus kaip elementai gali būti pridėti ir išimti.

            Queue - eilę aprašanti sąsaja dirbanti dažniausia FIFO (first-in-first-out) metodu.
            Deque yra labai panaši kolekcija į Queue tik dirba iš abiejų eilės galų.

            Queue sąsają realizuoja LinkedList, o Deque - ArrayDeque

         */

        testQueue(new PriorityQueue<>());

    }

    private static void testQueue(Queue<Integer> queue) {

        queue.add(30);
        queue.add(20);
        queue.add(50);
        queue.add(20);
        queue.add(10);

        System.out.print("Eilė:");
        for (Integer i : queue) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Ar yra 20? = " + queue.contains(20));

        System.out.println("Išmetam is sąrašo paskutinį/pirmą, t.y. 10");
        queue.poll();

        System.out.print("Eilė:");
        for (Integer i : queue) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
