package source;

public class CircleList {
    protected Node cursor; 
    protected int size; 
    public CircleList() { cursor = null; size = 0; }
    public int size() { return size; }
    public Node getCursor() { return cursor; }
    public void advance() { cursor = cursor.getNext(); }
    public void add(Node newNode) {
        if (cursor == null) { 
            newNode.setNext(newNode); cursor = newNode;
        } else {
            newNode.setNext(cursor.getNext());
            cursor.setNext(newNode);
        }
        size++;
    }
    public Node remove() {
        Node auxNode = cursor.getNext(); 
        if (auxNode == cursor) cursor = null; 
        else {
            cursor.setNext(auxNode.getNext()); 
    antigo}
            auxNode.setNext(null);
        }
        size--;
        return auxNode;
    }
    public String toString() {
         if (cursor == null) return "[ ]";
         String s = "[..." + cursor.getElement();
         Node auxCursor = cursor;
         for (advance(); auxCursor != cursor; advance())
               s += ", " + cursor.getElement();
         return s + "...]";  
    }
}