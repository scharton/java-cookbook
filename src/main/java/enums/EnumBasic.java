package enums;

public class EnumBasic {
    private enum Foo {
        FOO, BAR, BAZ
    }

    public enum Farm {
        PIG("pig", "oink"), HORSE("horse", "nay"), COW("cow", "moo");

        String db;
        String sound;

        Farm(final String db, final String sound) {
            this.db = db;
            this.sound = sound;
        }

        String getDb() {
            return db;
        }

        String getSound() {
            return sound;
        }
    }

    public static Farm getAnimalFromFarm(final String animal) {
        final EnumBasic eb = new EnumBasic();
        final Farm[] animals = Farm.values();
        for (final Farm a : animals) { 
            if (a.getDb().equals(animal)) {
                return a;
            }
        } 

        return null;
    }

}