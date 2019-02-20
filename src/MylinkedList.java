import Main.linkedList1;

public class MylinkedList {
    private linkedList1 head;
    private linkedList1 tail;
private int currentSize;
    public linkedList1 getHead() {
        return head;
    }

    public void setHead(linkedList1 head) {
        this.head = head;
    }

    public linkedList1 getTail() {
        return tail;
    }

    public void setTail(linkedList1 tail) {
        this.tail = tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public MylinkedList() {
        this.head=null;
        this.tail=null;
        currentSize=0;
    }

    public static void main(String[] args) {
        MylinkedList linkedList = new MylinkedList();
        linkedList1 linkedList1 = new linkedList1(10,null);
    }
}
