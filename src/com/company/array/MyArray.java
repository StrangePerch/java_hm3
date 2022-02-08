package com.company.array;

import com.company.interfaces.IMath;
import com.company.interfaces.ISort;

import java.util.*;
import java.util.stream.Collectors;

public class MyArray implements IMath, ISort {
    private ArrayList<Integer> array;
    private Scanner in = new Scanner(System.in);
    private Random rand = new Random();

    public MyArray() {
        this.array = new ArrayList<>();
    }

    public void fillWithKeyboard() {
        System.out.println("Input numbers to initialize array");
        System.out.print("Separator: ");
        var separator = in.nextLine();
        System.out.print("Numbers: ");
        var numbersInput = in.nextLine();
        array = Arrays.stream(numbersInput.split(separator)).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
    }

    private int randomInRange(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }


    public void fillWithRandom(int length, int min, int max) {
        for (int i = 0; i < length; i++) {
            array.add(i, randomInRange(min,max));
        }
    }

    public void print()
    {
        System.out.println("Array: " + array.toString());
    }

    public void set(int index, int value)
    {
        array.set(index, value);
    }

    public void replace(int value, int new_value)
    {
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) == value)
                array.set(i, new_value);
        }
    }

    public int find(int value)
    {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == value) return i;
        }
        return -1;
    }

    @Override
    public int max() {
        var max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }

    @Override
    public int min() {
        var min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }

    @Override
    public float avg() {
        float sum = 0;
        for (int i = 1; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum / array.size();
    }

    @Override
    public void SortAsc() {
        array.sort(Comparator.naturalOrder());
    }

    @Override
    public void SortDesc() {
        array.sort(Comparator.reverseOrder());
    }
}
