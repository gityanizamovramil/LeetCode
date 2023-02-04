package programmer.yanizamovramil.problems.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    //case 1
    //l1 = [2,4,3]
    //l2 = [5,6,4]
    //expected = [7,0,8]
    @Test
    void addTwoNumbers_Case_1() {
        //Given
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        //When
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.byHashTable(l1, l2);
        ListNode newResult = addTwoNumbers.byNode(l1, l2);
        //Then
        assertAll(
                () -> assertNotNull(result),
                () -> assertEquals(7, result.val),
                () -> assertEquals(0, result.next.val),
                () -> assertEquals(8, result.next.next.val)
        );
        assertAll(
                () -> assertNotNull(newResult),
                () -> assertEquals(7, newResult.val),
                () -> assertEquals(0, newResult.next.val),
                () -> assertEquals(8, newResult.next.next.val)
        );
    }

    //case 2
    //l1 = [0]
    //l2 = [0]
    //expected = [0]
    @Test
    void addTwoNumbers_Case_2() {
        //Given
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        //When
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.byHashTable(l1, l2);
        ListNode newResult = addTwoNumbers.byNode(l1, l2);
        //Then
        assertAll(
                () -> assertNotNull(result),
                () -> assertEquals(0, result.val)
        );
        assertAll(
                () -> assertNotNull(newResult),
                () -> assertEquals(0, newResult.val)
        );
    }

    //case 3
    //l1 = [9,9,9,9,9,9,9]
    //l2 = [9,9,9,9]
    //expected = [8,9,9,9,0,0,0,1]
    @Test
    void addTwoNumbers_Case_3() {
        //Given
        ListNode l1 = new ListNode(9, new ListNode());
        ListNode l2 = new ListNode(9, new ListNode());
        ListNode l1Next = l1.next;
        ListNode l2Next = l2.next;
        for (int i = 1; i <= 6; i++) {
            l1Next.val = 9;
            if (i != 6) {
                l1Next.next = new ListNode();
            }
            l1Next = l1Next.next;
        }
        for (int i = 1; i <= 3; i++) {
            l2Next.val = 9;
            if (i != 3) {
                l2Next.next = new ListNode();
            }
            l2Next = l2Next.next;
        }
        //When
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.byHashTable(l1, l2);
        ListNode newResult = addTwoNumbers.byNode(l1, l2);
        //Then
        assertAll(
                () -> assertNotNull(result),
                () -> assertEquals(8, result.val)
        );
        assertAll(
                () -> assertNotNull(newResult),
                () -> assertEquals(8, newResult.val)
        );
    }

    //case 4
    //l1 = [8,3,2]
    //l2 = [9,2,1]
    //expected = [7,6,3]
    @Test
    void addTwoNumbers_Case_4() {
        //Given
        ListNode l1 = new ListNode(8, new ListNode(3, new ListNode(2)));
        ListNode l2 = new ListNode(9, new ListNode(2, new ListNode(1)));
        //When
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode newResult = addTwoNumbers.byNode(l1, l2);
        //Then
        assertAll(
                () -> assertNotNull(newResult),
                () -> assertEquals(7, newResult.val),
                () -> assertEquals(6, newResult.next.val),
                () -> assertEquals(3, newResult.next.next.val)
        );
    }

}