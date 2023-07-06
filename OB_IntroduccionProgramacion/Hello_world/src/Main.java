// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Paladin Perk = new Paladin();
        Perk.healthPoints = 890;
        Perk.mainWeapon = "Great Sword";

        Ogre Brutus = new Ogre();
        Brutus.healthPoints = 950;
        Brutus.mainWeapon = "Fire Haxe";

        //Perk
        System.out.printf("Perk HP: %d\n", Perk.healthPoints);
        RestoreCharacterHp(Perk);
        System.out.printf("Perk HP: %d\n", Perk.healthPoints);

        //Brutus
        System.out.printf("Brutus HP: %d\n", Brutus.healthPoints);
        RestoreCharacterHp(Brutus);
        System.out.printf("BrutusHP: %d\n", Brutus.healthPoints);

        System.out.println(iAmRecursive(0, 0));
    }

    public static void RestoreCharacterHp(CharacterInterface Character){
        Character.restoreHealth();
    }

    public static void ChangeCharacterWeapon(CharacterInterface Character){
        Character.changeWeapon();
    }

    public static void DisplayCharacterStats(CharacterInterface Character){
        Character.displayStats();
    }

    public static int iAmRecursive(int a, int counter){
        a += 15;
        counter += 1;
        if(a < 100) {
            return iAmRecursive(a, counter);
        }
        else {
            return counter;
        }
    }
}

interface CharacterInterface{
    public void restoreHealth();
    public void displayStats();
    public void changeWeapon();
}

class Character{
    int healthPoints;
    String mainWeapon;
}

class Paladin extends Character implements CharacterInterface{
    public void restoreHealth(){
        this.healthPoints += 500;
    }

    public void displayStats(){
        System.out.printf("HP: %d\nMain Weapon: %s", this.healthPoints, this.mainWeapon);
    }

    public void changeWeapon(){
        this.mainWeapon = "Holy Spear";
    }
}

class Ogre extends Character implements CharacterInterface{
    public void restoreHealth(){
        this.healthPoints += 700;
    }

    public void displayStats(){
        System.out.printf("HP: %d\nMain Weapon: %s", this.healthPoints, this.mainWeapon);
    }

    public void changeWeapon(){
        this.mainWeapon = "Spikes Hammer";
    }
}


