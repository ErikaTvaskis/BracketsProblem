
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BracketBalance {

public static void main (String[] args) throws IOException {
        
//VARIABLES
BufferedReader fin = null;  //Declaring fin as BufferedReader
String strin;               //String that reads file
String[] tokens;            //Array for splitting strings
String delim = "[ ]+";      //Delimiter string for splitting input string
char[] CharArray = new char[] { '(', ')', '{', '}', '[', ']' };

//GETTING BANNER AND PRINTING IT
ProgramInfo programInfo = new ProgramInfo(); 
System.out.println(programInfo.getBanner("Bracket Balance"));

//CHECKING FOR ISSUES
try {
    fin = new BufferedReader(new FileReader("Brackets.txt"));
} //End try statement 
catch (FileNotFoundException e) {
    System.out.println("file not found");
} //End catch statement
    
//PROCESSING
strin = fin.readLine();   
while (strin != null) {
    System.out.println("The Brackets: " + strin);
    Stack<Character> st=new Stack<Character>();  
    for (int i=0;i<strin.length();++i) {
        if (Character.isLetterOrDigit(strin.charAt(i))) {
            System.out.println("The data file does not contain appropriate values");
            System.exit(0);
        } //End if for checking if data is correct
        if((strin.charAt(i) == '(') || (strin.charAt(i) == '{') || (strin.charAt(i) == '[')) {
            st.push(strin.charAt(i));
        } //End if statement
        else if(st.isEmpty()==false) {   
            switch(strin.charAt(i)) {
            case']':
                if(st.pop()!='[') {
                    System.out.println("= Unbalanced");
                    System.exit(0);
                } //End if
                break;
            case'}':
                if(st.pop()!='{') {
                    System.out.println("= Unbalanced");
                    System.exit(0);
                } //End if
                break;
            case')':
                if(st.pop() != '(') {
                    System.out.println("= Unbalanced");
                    System.exit(0);
                } //End if
            break;
            } //End switch
        } //End else if
    } //End for loop   
    
    //System.out.println("STRING: " + st.toString());
    //System.out.println("EMPTY: " + st.isEmpty());
    //Old testing
    
    if(st.isEmpty()) {
        System.out.println("= Balanced!");
    } //End if stack is empty
    else {
        System.out.println("= Not balanced");
    } //End if stack is not emtpy 
        
    System.out.println("***********************");
    strin = fin.readLine();
} //End of while loop 

} //End of main

} //End of class
