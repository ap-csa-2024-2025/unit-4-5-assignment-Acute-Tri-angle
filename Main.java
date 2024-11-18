import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    Scanner sc = new Scanner(System.in);
    System.out.println("enter word");
    String str = sc.nextLine();
    sc.nextLine();
    System.out.println("enter int");
    int x = sc.nextInt();
    printNTimes(str, x);
    System.out.println("");

    printNums();

    System.out.println("enter a postive int");
    x = sc.nextInt();
    uprightNumberTriangle(x);

    System.out.println("how many layers of star tree?");
    x = sc.nextInt();
    starTree(x);

    System.out.println("mult table up to?");
    x = sc.nextInt();
    multTable(x);

    sc.close();
  }

  public static void printNTimes(String word, int N)
  {
    // code solution here
    for (int i = 0; i < word.length(); i++){
      for (int a = 0; a < N; a++){
        System.out.print(word.substring(i, i+1));
      }
    }
  }

  public static void printNums()
  {
    // code solution here
    for (int i = 10; i > 0; i--){
      for (int a = 0; a < i; a++){
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
    for (int i = 1; i <= N; i++){
      for (int a = 1; a <= i; a++){
        System.out.print(a + " ");
      }
      System.out.println("");
    }
  }

  public static void starTree(int height)
  {
    // code solution here
    int tabbing = 0;
    for (int i = 0; i < height; i++){
      for(int t = 0; t < tabbing; t++){
        System.out.print(" ");
      }
      tabbing++;
      for(int a = 0; a < height - i; a++){
        System.out.print("* ");
      }
      System.out.println("");
    }

  }

  public static void multTable(int N)
  {
    // code solution here
    for (int i = 1; i <= N; i++){
      for (int a = 1; a <= N; a++){
        System.out.print((a*i) + " ");
      }
      System.out.println("");
    }
  }
}
