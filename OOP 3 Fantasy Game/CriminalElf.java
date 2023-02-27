/**
 * This program is meant to complete the Fantasy OOP 3 game
 * It is responsible for creating a criminal elf, which is a subclass of the Elf class.
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 21.06.10
 * @author Olivia Chan
 */
import java.util.ArrayList;
public class CriminalElf extends Elf
{
   /** total balance of criminal elves (Note: personal money is different from total criminal balance - criminal balance is money gained by illegal activities)*/
   private static int totalBalance = 0;
   
   /** array to store all criminal elves */
   private static ArrayList<CriminalElf> outlaws = new ArrayList<CriminalElf>();
   
   /**
    * {@link CriminalElf} default constructor.
    * Sets values of variables in superclass.
    * 
    *@param name - Criminal Elf's name
    */
   public CriminalElf(String name, int maxGold)
   {
      super(name, maxGold);
      outlaws.add(this);
   }
   
   /**
    * Method to eliminate an elf
    *@param elf the elf to be eliminated
    */
   public void eliminateElf(Elf elf)
   {
      System.out.println(elf.getName() + " is no longer");
      super.removeElf(elf);
   }
   
   /**
    * Method to hold an elf ransom
    * @param elf - the elf to be held ransom
    */
   public void holdRansom(Elf elf)
   {
      int ransomNum = (int) ((elf.getGold() / 2) + Math.random() * (elf.getGold() - (elf.getGold() / 2) + 1));
      System.out.println(getName() + " is holding " + elf.getName() + " for ransom of " + ransomNum + " gold bars");
      int choiceRansom = (int) (Math.random() * 2);
      if (choiceRansom == 0)
      {
         totalBalance += ransomNum;
         elf.setGold(elf.getGold() - ransomNum);
         System.out.println(elf.getName() + " has chosen to give in and has " + elf.getGold() + " gold now :(");
      }
      else if (choiceRansom == 1)
      {
         System.out.println(elf.getName() + " tries to escape the ransom!");
         eliminateElf(elf);
      }
      System.out.println("Total Criminal balance: " + totalBalance + " gold bars");
   
   }
   
   /**
    * Method to mug an elf
    * @param elf - the elf to be mugged
    */
   public void mugElf(Elf elf)
   {
      totalBalance += elf.getGold();
      elf.setGold(0);
      System.out.println(elf.getName() + " has been looted and left with 0 gold");
      eliminateElf(elf);
      System.out.println("Total Criminal balance: " + totalBalance + " gold bars");
   }
   
   /**
    * Method to convert elf to a criminal
    * @param elf - the elf to be held ransom
    */
   public void convertBad(Elf elf)
   {
      System.out.println(elf.getName() + " has been turned into a Criminal Elf");
      super.removeElf(elf);
      outlaws.add(new CriminalElf(elf.getName(), 10000));
   }

   /**
	 * Returns name of criminal elf
	 * @return 
	 */
   public String getName() 
   {
      return super.getOnlyName() + " the Criminal Elf";
   }
}
