package legoset;

import jaxb.JAXBHelper;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        LegoSet legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setNumber("75211");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        legoSet.setWeight(new Weight(0.89, "kg"));

        Set<String> tags = new HashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtroopers");
        tags.add("Star Wars");
        tags.add("Solo");
        legoSet.setTags(tags);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("ImperialMudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban StormTrooper", 1));
        legoSet.setMinifigs(minifigs);

        JAXBHelper.toXML(legoSet, System.out);

    }

}
