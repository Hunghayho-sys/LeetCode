/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Tạo nút giả (dummy node) để làm mốc khởi đầu
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Duyệt qua cả hai danh sách khi chưa hết phần tử
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // Gắn phần còn lại của list1 hoặc list2 (nếu có danh sách nào chưa chạy hết)
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // Trả về danh sách đã trộn (bỏ qua nút giả dummy)
        return dummy.next;
    }
}