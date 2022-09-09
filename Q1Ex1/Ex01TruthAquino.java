package Q1Ex1;

public class Ex01TruthAquino {
    public static void main(String[] args) {
       /*Declaring Variables*/
       String a = "So What?";
       String b = "Paint the Town";
       String c = "Flip That";
       
       int winsA = 1;
       int winsB = 1;
       int winsC = 2;
       
       int viewsA = 32000000;
       int viewsB = 61000000;
       int viewsC = 36000000;
       
       int winsSum = winsA + winsB + winsC;
       int viewsSum = viewsA + viewsB + viewsC;
       
       /*Displaying Prints*/
       System.out.println("Title 1:");
       System.out.printf("Song: ");
       System.out.println(a);
       System.out.printf("Wins: ");
       System.out.println(winsA);
       System.out.printf("YT Views: ");
       System.out.println(viewsA);
       
       System.out.println();
       
       System.out.println("Title 2: ");
       System.out.printf("Song: ");
       System.out.println(b);
       System.out.printf("Song: ");
       System.out.println(winsB);
       System.out.printf("Song: ");
       System.out.println(viewsB);
       
       System.out.println();
       
       System.out.println("Title 3: ");
       System.out.printf("Song: ");
       System.out.println(c);
       System.out.printf("Song: ");
       System.out.println(winsC);
       System.out.printf("Song: ");
       System.out.println(viewsC);
       
       System.out.println();
       
       /*Summation*/
       System.out.printf("Total Number of wins: ");
       System.out.println(winsSum);
       System.out.printf("Total Number of views: ");
       System.out.println(viewsSum);
       
       /*Comparison*/
       if (winsA == winsB) {
           System.out.println("So What? has the same number of wins as Paint the Town.");
       }
       else {
           System.out.println("So What? does not have the same number of wins as Paint the Town.");
       }
       
       if (winsC > winsA || winsC > winsB) {
           System.out.println("Flip That has the most number of wins among the three.");
       }
       else {
           System.out.println("Flip That does not have the most number of wins among the three.");
       }
    }
  }