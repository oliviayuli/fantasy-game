/**
 * This program is meant to complete the Fantasy OOP 3 game
 * It is responsible for dark rooms within the castle
 * with certain properties that Elves can interact with
 *
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 21.06.10
 * @author Olivia Chan
 */
import java.util.ArrayList;

public class DarkRoom 
{
   /** name of room */
   private String name;
   
   /** amount of gold in room */
   private int gold;
   
   /**whether or not room is radioactive */
   private boolean radioactive;
	
   /** stores elves in a room */
   private ArrayList<Elf> elves;
	
	
   /**
    * {@link DarkRoom} default constructor.
    * @param name The name of the room.
	 * @param gold The amount of the gold.
	 * @param radioactive If radioactivity is present   
    */
   public DarkRoom(String name, int gold, boolean radioactive)
   {
      this.name = name;
      this.gold = gold;
      this.radioactive = radioactive;
      elves = new ArrayList<Elf>();
   }
	
	/**
	 * Have Elf interact with DarkRoom.
	 * @param elf
	 */
   public void enter(Elf elf)
   {
      elves.add(elf);
   	
      if (radioactive)
         elf.exposeToRadiation();
   	
      gold = elf.takeGold(gold);
      if(name.equals("bedroom"))
      {
         elf.sleep();
      }
      else if(name.equals("kitchen"))
      {
         elf.drinkPotion();
      }
   }
	
	/**
	 * Remove Elf from room.
	 * @param elf
	 */
   public void exit(Elf elf)
   {
      elves.remove(elf);
   }

	/**
	 * A description of this DarkRoom
	 * @return
	 */
   public String getName() {
   	
      return name;
   }
}
