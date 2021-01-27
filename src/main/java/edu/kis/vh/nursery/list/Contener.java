
package edu.kis.vh.nursery.list;


public interface Contener {

    public static int MinusOne = -1;
    public static int Zero = 0;
    
    boolean isFull();
    boolean isEmpty();   
    void push(int in);
    public int top();
    public int pop();
 
}
