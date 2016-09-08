/*
Write a program to print the result of the following expressions provided the integer variable a is 20 and b is 10.
int 
int 
int 
int 
*/

public class FindValues {

public static void main(String ar[]) {

int a,b,c,d,e;
a=20;
b=10;
System.out.println(" Value of a before operation"+a+"\n Value of b before operation\n"+b);
b= a-- - --a;										// Here a-- having value 20 and --a having value 18 so we get b= 2
System.out.println("Value of b after operation"+b);
c=a--;												// here value of a is 18 assign to c first then decrement a
System.out.println("Value of c after operation"+c);
d=a>>2;												// here a =17 so when we are doing right shift 2 times we get 4
System.out.println("Value of d after operation"+d);
e=a&b;												// here a=17 and b=2 perform bitwise and we get e=0
System.out.println("Value of e after operation"+e);
}
}