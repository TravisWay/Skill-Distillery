package Initialization;


// Filename: A.java
class A{
   public static void main(String args[]){
      A a = new A();
      B b = new B();
      a = b;  // 1
      b =  (B) a;  // 2
      a = (B) b; // 3
      b = (B) a; // 4
      System.out.println("hi");
   }
}
class B extends A { }