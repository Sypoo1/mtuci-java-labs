public class CustomStack {
    int length = 0;
    Node top = null;
    public CustomStack(){
    }
    public void push(int data){
        Node tempNode = new Node(data);
        tempNode.setNextNode(top);
        top = tempNode;
        length++;
    }
    public int pop() throws CustomEmptyStackException {
        if (isEmpty()) throw new CustomEmptyStackException("Stack is empty. pop method is not available");
        Node node = top;
        top = top.getNextNode();
        length--;
        return node.getData();
    }
    public int peek() throws CustomEmptyStackException {
        if (isEmpty()) throw new CustomEmptyStackException("Stack is empty. peek method is not available");
        return top.getData();
    }
    public int size(){ return length; }
    public boolean isEmpty(){
        return length == 0;
    }
}
