1
Find GCD of Two Numbers
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println(a);
    }
}


2 Find LCM of Two Numbers
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = a, temp = b;

        while (temp != 0) {
            int t = temp;
            temp = gcd % temp;
            gcd = t;
        }
        System.out.println((a * b) / gcd);
    }
}

3
Simple Interest Calculation
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat(), r = sc.nextFloat(), t = sc.nextFloat();
        System.out.println((p * r * t) / 100);
    }
}


Inheritance Example
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

4
Remove Spaces from String
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(s.replace(" ", ""));
    }
}

Count Frequency of a Character
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        int count = 0;

        for (char c : s.toCharArray())
            if (c == ch) count++;

        System.out.println(count);
    }
}

Check Perfect Number
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;

        System.out.println(sum == n ? "Perfect" : "Not Perfect");
    }
}

5
Sum of Array Elements
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

Find Second Largest Element
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        System.out.println(second);
    }
}

6
Count Even and Odd Numbers in Array
import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}


Check String Palindrome
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}

7
Count Characters (Excluding Spaces)
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c != ' ')
                count++;
        }
        System.out.println(count);
    }
}


Check Number is Positive, Negative or Zero
import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero");
    }
}


Print Multiplication Table
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}

Find Largest of Three Numbers
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest: " + largest);
    }
}
Factorial Using Recursion
import java.util.Scanner;

public class FactorialRecursion {

    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}

Check Armstrong Number
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0, digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            int r = temp % 10;
            sum += Math.pow(r, digits);
            temp /= 10;
        }

        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
    }
}
Sort an Array (Bubble Sort)
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}
