package com.java;
//Different Blocks
//main, constructor, static, method, normal block


public class JavaBlocks {

static {
System.out.println("static executes before main");
}
//normal block
{
System.out.println("normal block");
System.out.println("normal block will executes on object creation before constructor");
}
JavaBlocks(){
System.out.println("Constructor block");
}
public static void main(String[] args) {
System.out.println("MainBlock");
JavaBlocks ob=new JavaBlocks();
}

}





