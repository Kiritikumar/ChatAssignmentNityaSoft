

package com.samples.example1;

interface IBase {

}


class Base 
{ 

} 

class Derived extends Base implements IBase 
{ 
public static void main(String[] args) 
{ 
Base myData = new Derived(); 

if(myData instanceof Base){
System.out.println("Base");
}
if(myData instanceof IBase){
System.out.println("IBase");
}
if(myData instanceof Object){
System.out.println("Object");
}
String str = "Hello Captain America";

str.replaceAll("America", "Marvel");

System.out.println(str.length());
} 
} 

