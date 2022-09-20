import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean winGame = false;
    String response;
    int range = 10;
    int min = 1;
    int guesses = 3;
    int max = 10;
    
    do {
      System.out.printf("\n\nHowdy, welcome to Higher or Lower! What do you want to do?\n\n" +

              "-Start Game\n" +
              "-Change Settings\n" +
              "-Exit Game\n\n");

      response = sc.nextLine();
      switch (response) {
        case "Start Game": 
          char repeat = 'Y';
          
          do {
            
            int random = (int) Math.floor(Math.random()*range) + min;
            guesses = 3;
            winGame = false;
            
            for(int remaining = guesses; remaining>0; remaining--) {
              System.out.printf("\nYou have %d guess(es) remaining. What is your guess? \n", remaining) ;
              float guess = sc.nextFloat();

              if (random < guess) {
                System.out.println("\nGuess lower!\n");
                guesses--;
              }

              else if (random > guess) {
                System.out.println("\nGuess higher!\n");
                guesses--;
              }
                
              else if (random == guess) {
                System.out.println("\nYou win!\n");
                winGame = true;
                break;
              }
            }

            if (winGame == false) {
              System.out.println("\nYou lose!\n");
            }
            
            System.out.println("\nPlay again? (Y/N) \n");
            repeat = sc.next().charAt(0);
            
          } while(repeat == 'Y');
          break;
            
      case "Change Settings":
          
          System.out.println("\nWhat do you want the upper limit to be?\n");
          String newmax = sc.nextLine();
          max = Integer.parseInt(newmax);

          System.out.println("\nWhat do you want the lower limit to be?\n");
          String newlow = sc.nextLine();
          min = Integer.parseInt(newlow);

          range = max - min;
          break;
          
      default: 
          System.out.println("Invalid.");
          break;
      }
    } while(!response.equalsIgnoreCase("Exit Game"));
  }
}