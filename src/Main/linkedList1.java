package Main;
//Node
public class linkedList1 {
    private int data;
private linkedList1 next;
    public int getData() {                //Alt+insert
        return data;
    }

    public void setData(int data) {
        this.data = data;

    }

    public linkedList1 getNext() {
        return next;
    }

    public void setNext(linkedList1 next) {
        this.next = next;
    }

    public linkedList1(int data) {
        this.data = data;
    }

    public linkedList1(linkedList1 next) {
        this.next = next;
    }
}
