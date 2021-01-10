import java.util.Scanner;
public class Tictoc {
  char tictoc[][]=new char[3][3];
  //Display Fuction
  public static void display(char tictoc[][]) {
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    System.out.print(tictoc[i][j]+" ");
   }
   System.out.println();
  }
 }
}
Tictoc game=new Tictoc();

int counter=0;
for(int i=0 ; i<3; i++)
{
  for(int j=0 ; j<3 ; j++)
  {
    game.tictoc[i][j]=Character.forDigit(++counter,10);
  }
}
//Display Board
display(game.tictoc);
char input;
  for(int i=0;i<4;i++)
  {
   System.out.print(user1+" Turn: ");
   input=in.next().charAt(0);
   replace(game.tictoc,input,user1mark);
   display(game.tictoc);
   System.out.print(user2+" Turn: ");
   input=in.next().charAt(0);
   replace(game.tictoc,input,user2mark);
   display(game.tictoc);
  }
  System.out.print("User "+user1+": ");
  input=in.next().charAt(0);
  replace(game.tictoc,input,user1mark);
  display(game.tictoc);
    if(game.checkForWin())
    System.out.print("We have a Winner");
else
    System.out.print("Match is Draw");

