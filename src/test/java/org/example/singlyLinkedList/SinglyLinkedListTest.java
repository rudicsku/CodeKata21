package org.example.singlyLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList singlyLinkedList;

    @BeforeEach
    void setUp() {
        singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add("1");
        singlyLinkedList.add("2");
        singlyLinkedList.add("3");
    }

    @Test
    void add() {
        //Arrange

        //Act
        int size = singlyLinkedList.getSize();

        //Assert
        assertEquals(3, size);

    }

    @Test
    void contains() {
        //Arrange

        //Act
        boolean actual = singlyLinkedList.contains("3");

        //Assert
        assertEquals(true, actual);
    }

    @Test
    void deleteFromMiddle() {
        //Arrange
        List<String> expected = List.of("1", "3");
        //Act
        singlyLinkedList.delete("2");
        List<String> actual = singlyLinkedList.getElements();

        //Assert
        assertEquals(2, singlyLinkedList.getSize());
        assertFalse(singlyLinkedList.contains("2"));
        assertEquals(expected, actual);
    }

    @Test
    void deleteFirstElement() {
        //Arrange
        List<String> expected = List.of("2", "3");

        //Act
        singlyLinkedList.delete("1");
        List<String> actual = singlyLinkedList.getElements();

        //Assert
        assertEquals(2, singlyLinkedList.getSize());
        assertFalse(singlyLinkedList.contains("1"));
        assertEquals(expected, actual);
    }

    @Test
    void deleteLastElement() {
        //Arrange
        List<String> expected = List.of("1", "2");

        //Act
        singlyLinkedList.delete("3");
        List<String> actual = singlyLinkedList.getElements();

        //Assert
        assertEquals(2, singlyLinkedList.getSize());
        assertFalse(singlyLinkedList.contains("3"));
        assertEquals(expected, actual);
    }

    @Test
    void getElements() {
        //Arrange
        List<String> expected = List.of("1", "2", "3");

        //Act
        List<String> actual = singlyLinkedList.getElements();

        //Assert
        assertEquals(expected, actual);
        assertEquals(expected.size(), actual.size());
        assertNotNull(actual);
    }

    @Test
    void get() {
        //Arrange

        //Act
        String actual = singlyLinkedList.get(2);

        //Assert
        assertEquals("3", actual);
    }
}