package org.example.DoubleLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    private DoubleLinkedList doubleLinkedList;

    @BeforeEach
    void setUp() {
        doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add("1");
        doubleLinkedList.add("2");
        doubleLinkedList.add("3");
    }


    @Test
    void add() {
        //Arrange

        //Act
        int size = doubleLinkedList.getSize();

        //Assert
        assertEquals(3, size);
    }

    @Test
    void deleteFirstElement() {
        //Arrange
        List<String> expected = List.of("2", "3");

        //Act
        doubleLinkedList.delete("1");
        List<String> actual = doubleLinkedList.getElements();

        //Assert
        assertEquals(2, doubleLinkedList.getSize());
        assertFalse(doubleLinkedList.contains("1"));
        assertEquals(expected, actual);
    }

    @Test
    void deleteLastElement() {
        //Arrange
        List<String> expected = List.of("1", "2");

        //Act
        doubleLinkedList.delete("3");
        List<String> actual = doubleLinkedList.getElements();

        //Assert
        assertEquals(2, doubleLinkedList.getSize());
        assertFalse(doubleLinkedList.contains("3"));
        assertEquals(expected, actual);
    }

    @Test
    void deleteMiddleElement() {
        //Arrange
        List<String> expected = List.of("1", "3");
        //Act
        doubleLinkedList.delete("2");
        List<String> actual = doubleLinkedList.getElements();

        //Assert
        assertEquals(2, doubleLinkedList.getSize());
        assertFalse(doubleLinkedList.contains("2"));
        assertEquals(expected, actual);
    }

    @Test
    void contains() {
        //Arrange

        //Act
        boolean actual = doubleLinkedList.contains("3");

        //Assert
        assertEquals(true, actual);
    }

    @Test
    void getElements() {
        //Arrange
        List<String> expected = List.of("1", "2", "3");

        //Act
        List<String> actual = doubleLinkedList.getElements();

        //Assert
        assertEquals(expected, actual);
        assertEquals(expected.size(), actual.size());
        assertNotNull(actual);
    }

    @Test
    void get() {
        //Arrange

        //Act
        String actual = doubleLinkedList.get(2);

        //Assert
        assertEquals("3", actual);
    }
}