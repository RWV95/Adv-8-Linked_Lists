package nl.hva.miw.ads.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void add() {
        SinglyLinkedList l = new SinglyLinkedList();

        l.add(0, 100);
        l.add(1, 200);
        l.add(2, 300);
        l.add(3, 400);
        l.add(4, 500);

        String expected = "SinglyLinkedList{size=5} 100 200 300 400 500";
        String actual = l.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void get() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(0, 100);
        list.add(1, 200);
        list.add(2, 300);

        assertEquals(200, list.get(1));
    }

    @Test
    public void remove() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(0, 100);
        list.add(1, 200);
        list.add(2, 300);

        list.remove(1);
        assertEquals(300, list.get(1));
    }
}