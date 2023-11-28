package nl.hva.miw.ads.linkedlists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    public void add() {
        DoublyLinkedList l = new DoublyLinkedList();
        System.out.println(l);

        l.add(0, 100);
        l.add(1, 200);
        l.add(2, 300);
        l.add(3, 400);
        l.add(4, 500);

        String expected = "DoublyLinkedList{size=5} 100 200 300 400 500";
        String actual = l.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(0, 100);
        list.add(1, 200);
        list.add(2, 300);

        list.remove(0);
        assertEquals(200, list.get(0));
    }

    @Test
    public void removeOutOfBoundsIndex() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(0, 100);
        list.add(1, 200);
        list.add(2, 300);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
    }
    // NOTE this test would pass if the message of the exception that was thrown is the same as expected
//     IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class,
//        () -> list.get(3), "Index out of bounds");
//     assertTrue(thrown.getMessage().contains("Index out of bounds"));
}