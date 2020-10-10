package TheRoad.Events;

import TheRoad.Characters.CharacterStrategy;
import TheRoad.Characters.EnemyBandits;
import TheRoad.Locations.BossEnd.RoadBoss;
import TheRoad.Locations.Location;
import TheRoad.Locations.SleepChoice.RoadBanditAttackDeath;
import TheRoad.Writer.ConsoleWriter;
import TheRoad.Writer.Writer;

public class BanditAttackEvent implements Event {

    private final Writer consoleOutput = new ConsoleWriter();


    @Override
    public Location runEvent(CharacterStrategy playerCharacter, Location gameLocation) {

        CharacterStrategy enemy = new EnemyBandits();
        System.out.println(gameLocation.getLocation());

        //battle loop
        while (true){
            //player always gets to go first (this is a nice game)
            enemy.setHealth(enemy.getHealth() - playerCharacter.getDamage());
            consoleOutput.writeln("You hit " + enemy.getName() + " for " + playerCharacter.getDamage());
            consoleOutput.writeln("The health of the " + enemy.getName() + " is now " + enemy.getHealth());
            if (enemy.getHealth() <= 0) {
                return new Location(new RoadBoss());
            }

            playerCharacter.setHealth(playerCharacter.getHealth() - enemy.getDamage());
            consoleOutput.writeln("You got hit for " + enemy.getDamage());
            consoleOutput.writeln("your health is now " + playerCharacter.getHealth());
            if (playerCharacter.getHealth() <= 0) {
                return new Location(new RoadBanditAttackDeath());
            }
        }


    }

}
