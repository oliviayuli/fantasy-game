/**
 * This program is meant to complete the Fantasy OOP 3 game
 * It is responsible for creating a castle location
 *
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 21.06.10
 * @author Olivia Chan
 */

import java.util.ArrayList;

public class Castle
{
   /** castle contains rooms */
   private ArrayList<DarkRoom> rooms;
	
   /**
    * {@link Castle} default constructor.
    * Creates rooms in the castle  
    */
   public Castle()
   {
      rooms = new ArrayList<DarkRoom>();
   }
	
	/**
	 * Adds a DarkRoom to the Castle level
	 * @param room
	 */
   public void addRoom(DarkRoom room)
   {
      rooms.add(room);
   }
	
	/**
	 * Occurs when an Elf enters a DarkRoom
	 * @param elf The Elf
	 * @param room The DarkRoom
	 */
   public void enterRoom(Elf elf, DarkRoom room)
   {
      System.out.println(elf.getName() + " enters the " + room.getName() );
      room.enter(elf);
   	
      
   }
	
	/**
	 * Occurs when an Elf leaves a DarkRoom.
	 * @param elf The Elf.
	 * @param room The DarkRoom
	 */
   public void exitRoom(Elf elf, DarkRoom room)
   {
      System.out.println(elf.getName() + " leaves the " + room.getName() );
      room.exit(elf);
   	
      
   }
	
	/**
	 * Returns the number of DarkRooms.
	 * @return The number of DarkRooms.
	 */
   public int getRoomCount()
   {
      return rooms.size();
   }

	/**
	 * Returns a DarkRoom according to index.
	 * @param index
	 * @return
	 */
   public DarkRoom getRoom(int index) {
      return rooms.get(index);
   }
}
