//To DO: your name here
//To Do: import statements

public class GuessingGame {
  public static void main(String[] args) {
    
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.println(number);
  

    int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);


      int randomIntBounded = random.nextInt(100);
      System.out.println("Random Integer (0-99): " + randomInt);

      int min = 1;
      int max = 100;
      int randomIntInRange = random.nextInt(max - min + 1) + min;
      System.out.println("Random Integer (" + min + "-" + max + "): " + randomIntInRange);

      double randomDouble = random.nextDouble();
      System.out.println("Random Double: " + randomDouble);
    
     boolean randomBoolean = random.nextBoolean();
     System.out.println("Random Boolean: " + randomBoolean);
  
    
    
   }
}
