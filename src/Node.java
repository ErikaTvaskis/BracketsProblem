
/* **********************************************************
* Programmer:       Erika Tvaskis
* Class:            CS40S
* Assignment 3.2:   Data Structure Implementation
* Description:      Create Node class 
* *************************************************************
*/

public class Node 
{ //Begin class
    
Node Next;
Object Payload;

//CONSTRUCTORS   

/******************************************************
Purpose: Default constructor
In: data (Object)
Out: None
/******************************************************/ 
public Node(Object data) {
    this(data, null);
} //End default constructor

/******************************************************
Purpose: Initialized constructor
In: data (Object) and next (Node)
Out: None
/******************************************************/ 
public Node(Object data, Node next) {
    this.Next = next;
    this.Payload = data;
} //End intialized constructor

//GETTERS AND SETTERS

/******************************************************
Purpose: Get the node's data
In: None
Out: Payload (Object of the node)
/******************************************************/ 
public Object getData() {
    return this.Payload;
} //End getData method

/******************************************************
Purpose: Get the next node
In: None
Out: Next (Node)
/******************************************************/ 
public Node getNext() {
    return this.Next;
} //End getNext method

/******************************************************
Purpose: Set the node's data
In: data (Object)
Out: None
/******************************************************/ 
public void setData(Object data) {
    this.Payload = data;
} //End setData method

/******************************************************
Purpose: Set the next node
In: nextNode (Node)
Out: None
/******************************************************/ 
public void setNext(Node nextNode) {
    this.Next = nextNode;
} //End setNext method

} //End of class

