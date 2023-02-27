/**
 * This program is meant to complete the Fantasy OOP 3 game
 * It is responsible for creating the MotelHQ location, which is the headquarters for criminals
 *
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 21.06.10
 * @author Olivia Chan
 */
import java.util.ArrayList;

public class MotelHQ
{
   /** Stores elves that enter the MotelHQ */
   private ArrayList<Elf> numElves;
   
   /** Stores the criminal elves that enter the MotelHQ */
   private ArrayList<CriminalElf> numOutlaws;
   
   /**
    * {@link MotelHQ} default constructor.
    * Creates arrays to store number of elves leaving and entering MotelHQ
    */
   public MotelHQ()
   {
      numElves = new ArrayList<Elf>();
      numOutlaws = new ArrayList<CriminalElf>();
   }
   
   /**
	 * Have Elf and Criminal Elf enter MotelHQ.
	 * @param elf
	 */
   public void enter(Elf elf, CriminalElf cri)
   {
      System.out.println(elf.getName() + " and " + cri.getName() + " have entered Motel HQ");
      numElves.add(elf);
      int ranPhrase = (int) (Math.random() * 3);
      if (ranPhrase == 0)
         System.out.println(elf.getName() + " has walked into a sticky situation");
      else if (ranPhrase == 1)
         System.out.println(elf.getName() + " may not see the light at the end of the tunnel");
      else if (ranPhrase == 2)
         System.out.println(elf.getName() + " is about get bamboozled");
         
      int fateChoice = (int) (Math.random() * 2);
      if (fateChoice == 0)
      {
         cri.mugElf(elf);
      }
      else if (fateChoice == 1)
         cri.convertBad(elf);
   }
   
   /**
	 * Have Criminal Elf exit MotelHQ.
	 * @param outlaw
	 */
   public void exit(CriminalElf outlaw)
   {
      System.out.println(outlaw.getName() + " has left Motel HQ");
      numOutlaws.remove(outlaw);
   }
}
