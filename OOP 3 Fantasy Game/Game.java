/**
 * This program is meant to complete the Fantasy OOP 3 game
 * It is responsible for constructing levels and coordinating interaction of
 * Elves with Darkrooms.
 *
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 21.06.10
 * @author Olivia Chan
 */
public class Game 
{
	/**
	 * Initiates the start of game play.
	 */
   public void play() 
   {
      Castle castle = new Castle();
      Castle castle2 = new Castle();
      Castle castle3 = new Castle();
      Castle castle4 = new Castle();
      MotelHQ motel = new MotelHQ();
      createLevel1(castle);
      createLevel2(castle2);
      createLevel3(castle3);
      createLevel4(castle4);
      Elf elf1 = new Elf("Maya", 50);
      Elf elf2 = new Elf("Vicky", 55);
      Elf elf3 = new Elf("Bob", 35);
      CriminalElf cri1 = new CriminalElf ("Olivia", 10000);
      CriminalElf cri2 = new CriminalElf ("Patricia", 20000);
      
      for (int i = 0; i < castle.getRoomCount(); i++)
      {
         DarkRoom room = castle.getRoom(i);
         castle.enterRoom(elf1, room);
         castle.exitRoom(elf1, room);     
      }
      for (int i = 0; i < castle2.getRoomCount(); i++)
      {
         DarkRoom room = castle2.getRoom(i);
         castle.enterRoom(elf2, room);
         castle.exitRoom(elf2, room); 
      }
      for (int i = 0; i < castle3.getRoomCount(); i++)
      {
         DarkRoom room = castle3.getRoom(i);
         castle.enterRoom(elf3, room);
         castle.exitRoom(elf3, room); 
      }
      for (int i = 0; i < castle4.getRoomCount(); i++)
      {
         DarkRoom room = castle4.getRoom(i);
         castle.enterRoom(cri2, room);
         castle.exitRoom(cri2, room); 
      }
      
      cri1.holdRansom(elf1);
      motel.enter(elf2, cri1);      
      motel.exit(cri1);
      cri2.holdRansom(elf3);
   }

	/**
	 * Constructs one level of the game for a character.
	 * @param castle
	 */
   public void createLevel1(Castle castle)
   {
      DarkRoom room = new DarkRoom("foyer", 10, true);
      castle.addRoom(room);
   	
      room = new DarkRoom("kitchen", 20, false);
      castle.addRoom(room);
   	
      room = new DarkRoom("living room", 15, true);
      castle.addRoom(room);
   }
   
   /**
	 * Constructs second level of the game for a character.
	 * @param castle
	 */
   public void createLevel2(Castle castle)
   {
      DarkRoom room = new DarkRoom("bedroom", 30, true);
      castle.addRoom(room);
   	
      room = new DarkRoom("bathroom", 20, false);
      castle.addRoom(room);
   	
      room = new DarkRoom("dining room", 35, true);
      castle.addRoom(room);
   }
   
   /**
	 * Constructs third level of the game for a character.
	 * @param castle
	 */
   public void createLevel3(Castle castle)
   {
      DarkRoom room = new DarkRoom("basement", 50, true);
      castle.addRoom(room);
   	
      room = new DarkRoom("closet", 60, false);
      castle.addRoom(room);
   	
      room = new DarkRoom("sparring room", 25, true);
      castle.addRoom(room);
   }
   
   /**
	 * Constructs fourth level of the game for a character.
	 * @param castle
	 */
   public void createLevel4(Castle castle)
   {
      DarkRoom room = new DarkRoom("auditorium", 50, true);
      castle.addRoom(room);
   	
      room = new DarkRoom("bunker", 60, false);
      castle.addRoom(room);
   }
 
}
