package arrayLists;
// import all the required packages
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Album {
//Data fields for Album
String albumName;
int numOfSongs;
String albumArtist;

//Constructor for album

public Album (String albumName , int numOfSongs , String albumArtist){

    this.albumName = albumName;
    this.numOfSongs = numOfSongs;
    this.albumArtist = albumArtist;
}

//Setters for the album

public void setAlbumName (String albumName){
    this.albumName = albumName;
}

public void setNumOfSongs (int numOfSongs){
    this.numOfSongs = numOfSongs;
}

public void setAlbumArtist ( String albumArtist){
    this.albumArtist = albumArtist;
}

//Getters for the album

public String getAlbumName(){
    return albumName;
}

public int getNumOfSongs(){
    return numOfSongs;
}
public String getAlbumArtist(){
    return albumArtist;
}

//To string method that represents the album

public String toString(){
    String output = "Album name: " + albumName;
    output += "Artist: " + albumArtist;
    output += "Number of songs: " + numOfSongs; 

    return output;
}

//Main method
public static void main(String[] args) {

    //Declare the new Arraylist

    List<Album> albums1 = new ArrayList<Album>();

    //add 5 albums to the array list

    albums1.add(new Album("A last night", 5, "Black eye peas"));
    albums1.add(new Album("Lost soul", 10, "MVP"));
    albums1.add(new Album("Everytime we touch", 12, "Christina"));
    albums1.add(new Album("The King", 14, "2Pac"));
    albums1.add(new Album("Dawn", 4, "Emma"));

    //Display all albums to the console
    System.out.println("List of albums in album1: ");
    for (Album stringObject : albums1) {
        System.out.println(stringObject);
    }

    	// Sort formula gotten assistance from
		// https://stackoverflow.com/questions/4066538/sort-an-arraylist-based-on-an-object-field
		Collections.sort(albums1, new Comparator<Album>() {
			public int compare(Album a, Album b) {
				if (a.numOfSongs == b.numOfSongs)
					return 0;
				return a.numOfSongs < b.numOfSongs ? -1 : 1;
			}
		});

        // Display the albums in console after it is sorted by the number of songs
		System.out.println("\nAlbums sorted according to number of songs:");
		for (Album stringObject : albums1) {
			System.out.println(stringObject);
		}

        // Swap position 1 and 2
		Collections.swap(albums1, 0, 1);

        // Display the albums in console after position 1 and 2 is swapped
		System.out.println("\nAlbums after album position 1 and 2 are swapped:");
		for (Album stringObject : albums1) {
			System.out.println(stringObject);
		}

        //Declare a new ArrayList 

        List<Album> albums2 = new ArrayList<Album>();

        //use the addAll method to add 5 albums

        albums2.addAll(Arrays.asList(new Album ("The pitch" , 13 , "Rihanna") , new Album ("Sundown" , 11 , "Nicole") , 
        new Album("Sunkiss", 15, "Pitbull") , new Album ("Around the world" , 7 , "Gerry") , 
        new Album ("Heart peace" , 9 , "Taylor")));

        	// Display the albums2 in console
		System.out.println("\nalbums2 addAll method used to add 5 albums:");
		for (Album stringObject : albums2) {
			System.out.println(stringObject);
		}

        // Copy all the albums from albums1 over to albums2
		albums2.addAll(albums1);

        // Display the albums in console after albums1 copied over to albums2
		System.out.println("\nalbums2 after items are copied over from albums1:");
		for (Album stringObject : albums2) {
			System.out.println(stringObject);
		}

        // Add 2 elements to albums2
		albums2.add(new Album("Dark Side of the Moon", 9, "Pink Floyd"));
		albums2.add(new Album("Oops!... I Did It Again", 16, "Britney Spears"));

        // Sort albums2 according to album name
		Collections.sort(albums2, new Comparator<Album>() {
			public int compare(Album a, Album b) {
				return a.getAlbumName().compareTo(b.getAlbumName());
			}
		});

        // Display the albums in console after albums2 is sorted according to album name
		System.out.println("\nalbums2 sorted by album name:");
		for (Album stringObject : albums2) {
			System.out.println(stringObject);
		}

        	// Search for a specific album
		int index = -1;
		String searchItem = "Dark Side of the Moon";
		for (int i = 0; i < albums2.size(); i++) {
			if (albums2.get(i).albumName == searchItem) {
				index = i;
				break;
			}
		}

        // Display in console the index of the album
		if (index == -1) {
			System.out.println("\n" + searchItem + " could not be found");
		} else{
			System.out.println("\n" + searchItem + " - is at index: " + index);
		}
	}
    
}
   



