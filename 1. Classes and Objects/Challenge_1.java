class Outer1{
    public int x=15;
    public static int y=20;

    class Inner1{
        private int a=10;
        private int b=30;

        void display(){
            System.out.println(x+" "+y+" "+a+" "+b);

        }
    }

}

class Outer2{
    public int x=15;
    public static int y=20;

    static class Inner2 {
        private int a=10;
        private int b=30;

        void display(){
            System.out.println(y+" "+a+" "+b);
            // Cannot print x because a static nested class can't directly access non static member in the outer class
            //must create  object of outer class to access x
            Outer2 outer2obj = new Outer2();
            System.out.println("x = "+ outer2obj.x);
        }
    }

}

public class Challenge_1 {
    public static void main(String[] args){

        //Inner class
        Outer1 outerObj = new Outer1();
        Outer1.Inner1 innerObj = outerObj.new Inner1();
        innerObj.display();

        //Static inner class
        Outer2.Inner2 static_innerObj = new Outer2.Inner2();
        static_innerObj.display();
    }
}
