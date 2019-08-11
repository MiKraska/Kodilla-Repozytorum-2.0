package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers) {
        numbers.removeIf(a -> (a % 2 != 0));
        return numbers;
    }
}
