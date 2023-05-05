package p21_merge_two_sorted_lists;

public class MergeLists {

    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        list1.next = mergeTwoSortedLists(list1.next, list2);
        return list1;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(5, null));
        ListNode list2 = new ListNode(3, new ListNode(4, null));
        mergeTwoSortedLists(list1, list2);
    }
}
