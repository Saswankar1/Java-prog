class A {
    int a = 10;

    void display() {
        B b = new B();
        b.show();
    }

    class B {
        int b = 20;

        void show() {
            System.out.println(" a value is " + a);
            System.out.println(" b value is " + b);
        }
    }
}

class Demo {
public static void main(String args[])
{
    A a=new A();
    a.display( );
}
}