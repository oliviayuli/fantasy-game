/**
 * This program is meant to complete the Fantasy OOP 3 game
 * It is responsible for creating an elf character
 *
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 21.06.10
 * @author Olivia Chan
 */
import java.util.ArrayList;
public class Elf
{
   /** Name of Elf */
   private String name;
   
   /** Health level of Elf */
   private int health;
   
   /** Amount of gold of Elf */
   private int gold;
   
   /** Energy level of Elf */
   private int energy;
   
   /** max gold amount of Elf */
   private int maxGold;
   
   /** ArrayList to store all elves */
   private static ArrayList<Elf> elves = new ArrayList<Elf>();
   
   /**
    * {@link Elf} default constructor.
    * Sets values of {@link #name} and {@link #maxGold}
    *
    * @param name - Elf's name
    * @param maxGold - Elf's max gold
    */
   public Elf(String name, int maxGold)
   {
      this.name = name;
      this.maxGold = maxGold;
      health = 100;
      gold = 0;
      energy = 100;
      elves.add(this);
   }
	
	/**
	 * Takes the maximum amount of gold and returns the leftover amount.
	 * @param available The amount of gold available to be taken.
	 * @return The amount of gold leftover.
	 */
   public int takeGold(int available)
   {
      int taken = 0;
      if (available + gold <= maxGold)
      {
         gold += available;
         taken = available;
      }
      else if (available + gold > maxGold && maxGold > gold)
      {
         taken = maxGold - gold;
         gold = maxGold;  
      }
      else
      {
         taken = 0;
      }
      energy -= 5;
      
      System.out.println(getName() + " takes " + taken + " gold. Gold: " + gold + " bars. Energy Level: " + energy);
      return available - taken;
   }
	
	/**
	 * Drinking potion restores health.
	 */
   public void drinkPotion()
   {
      health = 100;
      energy -= 5;
      
      System.out.println(getName() + " drinks potion. Health: " + health + "%. Energy Level: " + energy);
   }
	
	/**
	 * Reduce the health by 10%.
	 */
   public void exposeToRadiation()
   {
      health = (int)(health * 0.9);
      energy -= 15;
      
      System.out.println(getName() + " is exposed to radiation. Health: " + health + "%. Energy Level: " + energy);
   }
   
   /**
    * Method to make elf sleep
    */
   public void sleep()
   {
      if (energy < 30)
      {
         energy = 100;
         System.out.println(getName() + " took a nap and has fully regained their energy to 100%");
      }
   }

	/**
	 * The name of this Elf.
	 * @return
	 */
   public String getName() 
   {
      return "Elf " + name;
   }
   
   /**
	 * Returns only the name of the elf, not the type.
	 * @return
	 */
   public String getOnlyName()
   {
      return name;
   }
   
   /**
	 * Amount of gold elf has.
	 * @return
	 */
   public int getGold()
   {
      return gold;
   }
   
   /**
	 * Method to set gold to a different amount
	 *@param amount - amount of gold to set
	 */
   public void setGold(int amount)
   {
      gold = amount;
   }
   
   /**
	 * removes elf from list of elves
	 * @param elf - the elf to be removed
	 */
   public void removeElf(Elf elf)
   {
      elves.remove(elf);
   }
   
  
}



