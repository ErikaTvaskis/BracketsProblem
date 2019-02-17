
/* **********************************************************
* Programmer:       Erika Tvaskis
* Class:            CS40S
* Assignment 3.2:   Data Structure Implementation
* Description:      Create Stack class with operations
* *************************************************************
*/

public class Stack<Character>
{ //Begin class

private int length = 0;
private Node top = null;

/******************************************************
Purpose: Push node on top of the stack
In: Payload (Object)
Out: None
/******************************************************/ 
public void push(char Payload) {
    Node node = new Node(Payload);
    if (top == null) {
        top = node;
    } //End if 
    else {
        node.Next = top;
        top = node;
    } //End else
    length++;
} //End push method

/******************************************************
Purpose: Pop the node on top of the stack
In: None
Out: result (Object)
/******************************************************/ 
public char pop() {
    
    char result = 'e';
    
    //char op = (char) result;
    if (top != null) {
        result = (char) top.Payload;
        top = top.Next;
        length--;
    } //End if
    return result;
} //End pop method
   
/******************************************************
Purpose: Returns node on the top of the stack, doesn't remove it
In: None
Out: top.Payload (Node: object on top of stack)
/******************************************************/ 
public Object peek() {
    return (top == null) ? -1 : top.Payload;
} //End peek method

/******************************************************
Purpose: get stack size
In: None
Out: length (int)
/******************************************************/ 
public int size() {
    return length;
} //End size method

  public boolean isEmpty() {
        if (length == 0) { 
            return true; 
        } 
        return false; 
    }

/******************************************************
Purpose: toString method
In: None
Out: result (String)
/******************************************************/ 
@Override
public String toString() {
    StringBuilder result = new StringBuilder();
    Node tempNode = null;
    result.append("");
    if (top != null) {
        for(tempNode = top; tempNode != null; tempNode = tempNode.Next) {
            result.append(tempNode.Payload+ " ");
        } //End for loop
    } //End if statement
    result.append("");
    return result.toString();
} //End toSting() method
   
} //End class

