package LinkedLIst;

import java.util.LinkedList;

public class StockPriceChange {

//    incomplete
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // -2, 4, 1, 5, 7,-5, 4
        list.add(-2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(-5);
        list.add(4);

        sortTheList(list, 4);
    }

    private static void sortTheList(LinkedList<Integer> list, int x) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int temp : list) {
            if (temp <= x) {
                result.addFirst(temp);
            } else {
                result.add(temp);
            }
        }
        System.out.println(result);
    }
}
