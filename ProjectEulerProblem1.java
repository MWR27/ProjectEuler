public class ProjectEulerProblem1 {
   public static void main(String[] args) {
      problem1();
   }
   
   public static void problem1() {
      System.out.println(sumOfMultiplesOf(3, 1000) + sumOfMultiplesOf(5, 1000) - sumOfMultiplesOf(15, 1000));
   }
   
   public static int sumOfMultiplesOf(int factor, int limit) {
      limit -= 1;
      int n = limit - limit % factor;
      return n * (n + factor) / (2 * factor);
   }
}
