public class Answers
{
	public static void main (String[] args) {
    // question 1
    for (int n = 1; n <= 100; n++) {
      if (n % 3 == 0 && n % 5 == 0) // if divisible by 3 and 5
        System.out.println("FizzBuzz");
        else if (n % 3 == 0) // if divisible by only 3
        System.out.println("Fizz");
        else if (n % 5 == 0) // if divisible by only 5
        System.out.println("Buzz");

    }

    // question 2
    String str = "something";
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed = reversed + str.charAt(i);
    }
    System.out.println(reversed);
    // question 3
    int n = 8;
    for(int i = 1; i <= 12; i++)
    System.out.println(n*i);
    
    // question 4
    int n1=0;
    int n2=1;
    System.out.println(n1);
    System.out.println(n2);

    for (int i = 2; i < 100; i++) {
      int n3 = n1+n2;
      System.out.println(n3);
      n1=n2;
      n2=n3;
    }
	}
}
