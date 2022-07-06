import java.util.ArrayList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner keyboard = new Scanner(System.in);
    

        ArrayList<Song> top10 = new ArrayList<Song>();

        top10.add(new Song(1, "Running Up That Hill", "Kate Bush", "Fish People"));
        top10.add(new Song(2, "Afraid to Feel", "LF System", "Warner Records"));
        top10.add(new Song(3, "As it Was", "Harry Styles", "Columbia"));
        top10.add(new Song(4, "Break my Soui", "Beyonce", "Columbia"));
        top10.add(new Song(5, "Green Green Grass", "George Ezra", "Columbia"));
        top10.add(new Song(6, "Go", "Cat Burns", "RCA/Since 93"));
        top10.add(new Song(7, "About damn Time", "Lizzo", "Atlantic"));
        top10.add(new Song(8, "Massive", "Drake", "Ovo/Republic Records"));
        top10.add(new Song(9, "IFTK", "Tion Wayne & La Roux", "Atlantic"));
        top10.add(new Song(10, "Late Night Talking", "Harry Styles", "Columbia"));

        System.out.println("Choose a song by its chart position number: ");
        
        String response = keyboard.nextLine();
        Integer selectedSong = Integer.parseInt(response);

        for (Song song:top10){
            if (song.chartPosition == selectedSong){
                System.out.println("You selected: " + song.title);
            }
        }
    }
}
