
/**
 * Write a description of class MusicLibrary here.
 *
 * @author Michael Taylor
 * @version 5/3/21
 */
import java.util.Scanner;
    public class music{
    public static void main(String[] args){
    Scanner first = new Scanner(System.in);
    Scanner second = new Scanner(System.in);
    Scanner third = new Scanner(System.in);
    Scanner fourth = new Scanner(System.in);
    Scanner fifth = new Scanner(System.in);
    Scanner sixth = new Scanner(System.in);
    String title1, artist1;
    int playTime, numSongs, delete1;
    int x = 1;
    String[] playTimemIn = {"60 min ", "90 min ", "33 min ", "59 min ", "81 min "};
    String[] songCount = {" 16 songs ", " 25 songs ", " 14 songs ", " 20 songs ", " 22 songs "};
    String[] Title = {"title: 44 more ", "title: Erase your social ", "title: Stay high ", "title: The climb back ", "title: Follow God "};
    String[] Artist = {"by Logic ", "by Lil Uzi Vert ", "juice wrld ", "by J. Cole ", "by Kanye West "};
    String album1 = Title[0] +  Artist[0] + songCount[0]+ playTimemIn[0];
    String album2 = Title[1] +  Artist[1] + songCount[1]+ playTimemIn[1];
    String album3 = Title[2] +  Artist[2] + songCount[2]+ playTimemIn[2];
    String album4 = Title[3] +  Artist[3] + songCount[3]+ playTimemIn[3];
    String album5 = Title[4] +  Artist[4] + songCount[4]+ playTimemIn[4];
    String library = ("Library: |"+album1+"|"+album2+"|"+album3+"|"+album4+"|"+album5+"|");
   while(x == 1){
    System.out.println(library);
    System.out.println("Add an album press 1. Delete an album press 2. Double the albums in the library press 3. End and display the final library press 4");
    int response = first.nextInt();
    if(response == 1){
       System.out.println("what is the title of new album?");
       title1 = second.nextLine();
       System.out.println("who is the artist?");
       artist1 = third.nextLine();
       System.out.println("how many songs?");
       numSongs = fourth.nextInt();
       System.out.println("How many min?");
       playTime = second.nextInt();
       String album6 = ("title: " + title1 + " by " + artist1 + " " + numSongs + " songs "+ playTime + " min");
       String newlibrary = library+album6;
       System.out.println("Your new library: "+newlibrary);
       x+=1;
    }
    if(response == 2){
       System.out.println("which album would you like to delete press 1, 2, 3, 4, or 5");
       delete1= sixth.nextInt();
       if(delete1==1){
       library = ("Library: |"+album2+"|"+album3+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==2){
       library = ("Library: |"+album1+"|"+album3+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==3){
       library = ("Library: |"+album1+"|"+album2+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==4){
       library = ("Library: |"+album1+"|"+album2+"|"+album3+"|"+album5+"|");
       System.out.println(library);}
       if(delete1==5){
       library = ("Library: |"+album1+"|"+album2+"|"+album3+"|"+album4+"|"+album5+"|");
       System.out.println(library);}
       x+=1;
    }
    if(response == 3){
        int y = (int)((Math.random()*4) +1);
        int z = (int)((Math.random()*4) +1);
        int c = (int)((Math.random()*4) +1);
        int r = (int)((Math.random()*4) +1);
    String album6 = Title[y] +  Artist[z] + songCount[c]+ playTimemIn[r];
    String album7 = Title[r] +  Artist[y] + songCount[z]+ playTimemIn[c];
    String album8 = Title[c] +  Artist[r] + songCount[y]+ playTimemIn[z];
    String album9 = Title[y] +  Artist[y] + songCount[y]+ playTimemIn[y];
    String album10 = Title[y] +  Artist[y] + songCount[c]+ playTimemIn[c];
    String doubleLibrary = library+ "|"+album6+"|"+album7+"|"+album8+"|"+album9+"|"+album10+"|";
    System.out.println(doubleLibrary);
    x+=1;}
    if(response == 4){
       x+=1;
    }
   }
   Scanner seventh = new Scanner(System.in);
   Scanner eighth = new Scanner(System.in);
   Scanner nine = new Scanner(System.in);
   int w=1;
   while(w == 1){
    System.out.println("To search by album name press 1. To search by artist press 2. To end press 3");
    int answer = seventh.nextInt();
    if(answer == 1){
    System.out.println("Name of the album?");
    String name = eighth.nextLine();
    int found = 0;
    for (int i = 0; i < Title.length; i++){
     if(Title[i].equals(name)) {
     found++;
    }
     if(found > 0)
     {
     System.out.println(name + " was found in this library");
     }
   
     else
     {
     System.out.println(name +" is not a valid album in the library");
     w+=1;
    }
   }
   }  
   if(answer == 2){
   System.out.println("Name of the artist?");
    String artist = nine.nextLine();
    int found =0;
    for (int i = 0; i < Title.length; i++){
     if(Artist[i].equals(artist)) {
     found++;
     }
     if(found > 0)
     {
     System.out.println(artist+ " was found in this library");
     }
     else
     {
     System.out.println(artist+" is not an artist in the library");
     w+=1;
    }
   }
    }
   if(answer == 3){
    w+=1;
    System.out.println("See you next time");
} 
  }
 }
}
