class Stack {
    private final int SIZE = 10;
    private int top;

    private int[] array;

    Stack(){
        array = new int[SIZE];
        top=-1;
    }
    public void push(int value){
        if(top<SIZE-1){
            top++;
            array[top]=value;
        }else{
            System.out.println("Stack is Full!");
        }
    }
    public int pop(){
        if(!empty()){
            top--;
            return array[top+1];
        }else{
            System.out.println("Stack is Full!");
            return -1;
        }
    }
    public boolean empty(){
        return top==-1;
    }
}
