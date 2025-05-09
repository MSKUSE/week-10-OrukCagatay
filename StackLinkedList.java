public class StackLinkedList implements Stack {


    StackItem top;

    public void push(Object item){
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }


    public Object pop(){
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public boolean isEmpty() {
        return this.top == null ;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
}
