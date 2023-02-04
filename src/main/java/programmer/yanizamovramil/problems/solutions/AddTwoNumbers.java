package programmer.yanizamovramil.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {

    public ListNode byNode(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        ListNode next1 = l1.next;
        ListNode next2 = l2.next;
        ListNode next3 = new ListNode();

        int sum = l1.val + l2.val;
        if (sum > 9) {
            l3.val = sum % 10;
            l3.next = next3;
            l3.next.val = sum / 10;
        } else {
            l3.val = sum;
            if (next1 != null || next2 != null) {
                l3.next = new ListNode();
            }
            next3 = l3.next;
        }

        if (next1 == null && next2 == null) {
            return l3;
        }

        while (next1 != null || next2 != null) {
            if (next1 == null) {
                sum = next2.val + next3.val;
                next2 = next2.next;
            } else if (next2 == null) {
                sum = next1.val + next3.val;
                next1 = next1.next;
            } else {
                sum = next1.val + next2.val + next3.val;
                next1 = next1.next;
                next2 = next2.next;
            }
            if (sum > 9) {
                next3.val = sum % 10;
                next3.next = new ListNode(sum / 10);
            } else {
                next3.val = sum;
            }
            if (next1 != null || next2 != null) {
                if (next3.next == null) {
                    next3.next = new ListNode();
                }
                next3 = next3.next;
            }
        }
        return l3;
    }

    public ListNode byHashTable(ListNode l1, ListNode l2) {
        ListNode l1Next = l1.next;
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(0, l1.val);

        ListNode l2Next = l2.next;
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(0, l2.val);

        while (l1Next != null) {
            map1.put(map1.size(), l1Next.val);
            l1Next = l1Next.next;
        }
        while (l2Next != null) {
            map2.put(map2.size(), l2Next.val);
            l2Next = l2Next.next;
        }

        int biggest = Math.max(map1.size(), map2.size());
        Map<Integer, Integer> mapSum = new HashMap<>();

        for (int i = 0; i < biggest; i++) {
            int quotient = 0;
            int remainder = 0;
            int i1 = map1.size() - 1 >= i ? map1.get(i) : 0;
            int i2 = map2.size() - 1 >= i ? map2.get(i) : 0;
            int sum = i1 + i2;
            if (mapSum.containsKey(i)) {
                int value = mapSum.get(i);
                if (value + sum > 9) {
                    remainder = (value + sum) % 10;
                    quotient = (value + sum) / 10;
                    mapSum.put(i, remainder);
                    if (mapSum.containsKey(i + 1)) {
                        int nextValue = mapSum.get(i + 1);
                        if ((nextValue + quotient) > 9) {
                            remainder = nextValue % 10;
                            quotient = nextValue / 10;
                            mapSum.put(i + 1, remainder);
                            mapSum.put(i + 2, quotient);
                        } else {
                            mapSum.put(i + 1, mapSum.get(i + 1) + quotient);
                        }
                    } else {
                        mapSum.put(i + 1, quotient);
                    }
                } else {
                    mapSum.put(i, mapSum.get(i) + sum);
                }
            } else {
                if (sum > 9) {
                    remainder = sum % 10;
                    quotient = quotient + sum / 10;
                    mapSum.put(i, remainder);
                    mapSum.put(i + 1, quotient);
                } else {
                    mapSum.put(i, sum);
                }
            }
        }

        ListNode head = new ListNode(mapSum.get(0));
        if (mapSum.size() > 1) {
            head.next = new ListNode();
            ListNode tail = head.next;
            for (int i = 1; i < mapSum.size(); i++) {
                tail.val = mapSum.get(i);
                if (i != mapSum.size() - 1) tail.next = new ListNode();
                tail = tail.next;
            }
        }
        return head;
    }

}
