class Node {
    public int val;
    public Node next;
    
    public Node(int val, Node next){
        this.val=val;
        this.next=next;
    }
}

class MyLinkedList {
    Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node cur = this.head;
        int pos=0;
        while (pos<index && cur.next != null){
            cur=cur.next;
            pos++;
        } 
        if(pos==index){
            return cur.val;
        } else {
            return -1;
        }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node cur= new Node(val, this.head);
        this.head=cur;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node last = this.head;
        while (last.next!=null){
            last=last.next;
        }
        Node cur = new Node(val, null);
        last.next=cur;
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node cur = this.head.next;
        Node prev=null;
        int pos=0;
        while(pos<index && cur.next != null){
            prev=cur;
            cur=cur.next;
            pos++;
        }
        if(pos==index){
            if(cur.next==null){
                Node theNode = new Node(val, null);
                cur.next=theNode;
            } else {
                Node theNode = new Node(val, cur);
                if(prev!=null){
                    prev.next=theNode;
                }
            }
            
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node cur = this.head.next;
        Node prev=null;
        int pos=0;
        while(pos<index && cur.next != null){
            prev=cur;
            cur=cur.next;
            pos++;
        }
        if(pos==index){
            if(prev==null){
                this.head = cur.next;
            } else {
                prev.next=cur.next;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
