/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if (head == null) {
        return null;
       } 

       HashMap <Node,Node> map = new HashMap<>(); // key = node.val , val = node.random
       Node node = head;

       while(node != null) { //after this loop we have hash map with nodes and their randoms
        map.put(node , new Node (node.val));
        node = node.next;
       }

       Node old = head;
       while (old != null) {
        map.get(old).next = map.get(old.next);
        map.get(old).random = map.get(old.random);
        old = old.next;
       }
       
       return map.get(head);
    }
}
