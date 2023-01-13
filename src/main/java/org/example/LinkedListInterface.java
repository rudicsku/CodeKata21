package org.example;

import java.util.List;

public interface LinkedListInterface {

    void add(String str);

    void delete(String str);

    boolean contains(String str);

    List<String> getElements();

    String get(int index);

}
