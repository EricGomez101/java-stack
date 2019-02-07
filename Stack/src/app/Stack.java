package app;

import java.util.Arrays;
public class Stack
{
    private String[] stack;
    private final int MAX;

    public Stack(int limit)
    {
        stack = new String[0];
        this.MAX = limit;
    }

    public void print()
    {
        System.out.print("[ ");
        for(String e: stack)
        {
            System.out.print("'" + e + "', ");
        }
        System.out.println(" ]");
    }

    public String pop()
    {
        String item = stack[stack.length - 1];
        stack =  Arrays.copyOfRange(stack, 0, stack.length - 1);
        return item;
    }

    public void push(String item)
    {
        if (MAX > stack.length)
        {
            String[] t = new String[(stack.length + 1)];
            for(int i = 0; i < stack.length; i++)
            {
                t[i] = stack[i];
            }
            t[(t.length - 1)] = item;
            stack = t;
        }
    }

    public String numOfItems()
    {
        return stack.length < 1 ? "There are no items in your Stack" : "" + stack.length;
    }

}
