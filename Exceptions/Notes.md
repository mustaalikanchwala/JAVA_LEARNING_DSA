=== Exception ===
When an exception occurs in Java and is not handled, the program terminates abruptly and any code after the exception will never execute.

When Compiler show u that there is and excepton in ypur code , it is called  Checked Exception.
When we get Exception in RunTime it is called UnChecked Exception.
Exception Hierarchy :- https://i0.wp.com/www.benchresources.net/wp-content/uploads/2017/02/exception-hierarchy-in-java.png?w=1710&ssl=1

try-catch block is used when when we are not sure if exception will come or not so we use tty-catch block.
we can handel multipel exception by using multipel catch block.
finally block is used if we have written a code in try related to db connection , it need to close after excution completes so this can happen by using Finally block.
finally block will always excute.

Wiriting Catch Block with try is not requried , but it is not good habit to not to write catch block

Feature      |  throw(Throw class)                               |  throws(Throws class)                 
-------------+---------------------------------------------------+---------------------------------------
Where used   |  Inside method body                               |  In method signature                  
Purpose      |  Actually throws exception                        |  Warns caller about possible exception
Who handles  |  Same method (try-catch inside)                   |  Caller method (try-catch in main)    
Followed by  |  Exception object (new ArithmeticException(...))  |  Exception class name (Exception)     

throw = I'm throwing it NOW (you handle it in same method)

throws = I MIGHT throw it later (caller must handle it)​