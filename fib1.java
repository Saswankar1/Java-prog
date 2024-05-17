
class fib {
   int a, b, c;

   void nonrecursive(int n) // Non recursive function to find the Fibonacci series.
   {
      a = 0;
      b = 1;
      System.out.print(a + "" + b);
      c = a + b;
      while (c <= n) {
         System.out.print(c);
         a = b;
         b = c;
         c = a + b;
      }
   }

   int recursive(int n) // Recursive function to find the Fibonacci series.
   {
      if (n == 0)
         return (0);
      if (n == 1)
         return (1);
      else
         return (recursive(n - 1) + recursive(n - 2));
   }
}

// Class that calls recursive and non recursive functions
class fib1 {
   public static void main(String args[]) {
      int n = 5;
      System.out.println("The Fibonacci series using non recursive is");
      // Creating object for the fib class.
      fib f = new fib();
      // Calling non recursive function oF fib class.
      f.nonrecursive(n);
      System.out.println("\n The Fibonacci series using recursive is");
      for (int i = 0; i <= n; i++) {
         // Calling recursive function of fib class.
         int F1 = f.recursive(i);
         System.out.print(F1);
      }
   }
}
