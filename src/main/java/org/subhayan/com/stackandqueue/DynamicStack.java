package org.subhayan.com.stackandqueue;

public class DynamicStack extends StackCustom{
    public DynamicStack(int size) {
        super(size);
    }

    public DynamicStack() {
        super();  // It will call StackCustom(), with DEFAULT_SIZE
    }

    @Override
    public boolean push(int item) throws StackException {
        if (this.isFull()) {
            int[] temp = new int[stack.length * 2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;  // stack variable now points to temp array
        }
        return super.push(item);
    }

    public static void main(String[] args) throws StackException {
        StackCustom stack = new DynamicStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(18);

        System.out.println(stack);
    }
}
