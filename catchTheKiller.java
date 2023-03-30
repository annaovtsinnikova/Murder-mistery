package OOP.catchTheKiller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class catchTheKiller extends Library{

    static List<Suspect> suspects = new ArrayList<>();
    static List<String> namesNotUsed = new ArrayList<>(Arrays.asList(getNames()));
    static Random random = new Random();

    public static String getRandomUniqueName() {
        String name = namesNotUsed.get(random.nextInt(namesNotUsed.size()));
        namesNotUsed.remove(name);
        return name;
    }

    public static Investigator whoIsOurInvestigator() {
        return new Investigator(getRandomUniqueName(), random.nextInt(60 - 25) + 25);
    }

    public static Victim whoWasKilled() {
        Victim victim;
        int randomIndex1 = random.nextInt(getOccupation().length);
        int randomIndex2 = random.nextInt(getCausesOfDeath().length);
        victim = new Victim(getRandomUniqueName(), random.nextInt(95 - 16) + 16,
                getOccupation()[randomIndex1], getCausesOfDeath()[randomIndex2]);
        return victim;
    }

    //one of the suspects is the killer
    public static Suspect whoIsTheKiller() {
        Suspect killer;
        int randomIndex1 = random.nextInt(getOccupation().length);
        int randomIndex2 = random.nextInt(getAlibi().length);
        int randomIndex3 = random.nextInt(getMurderMotive().length);
        int randomIndex4 = random.nextInt(getSuspiciousCharacterTraits().length);
        killer = new Suspect(getRandomUniqueName(), random.nextInt(95 - 16) + 16, getOccupation()[randomIndex1],
                getAlibi()[randomIndex2], false, evidence(true), true,
                getMurderMotive()[randomIndex3], getSuspiciousCharacterTraits()[randomIndex4]);
        return killer;
    }

    public static List<Suspect> getSuspects() {
        Suspect suspect;
        //a suspect, who has some evidence against him and had some suspicious behaviour during the interrogation, but is not the killer
        int randomIndex1 = random.nextInt(getOccupation().length);
        int randomIndex2 = random.nextInt(getAlibi().length);
        int randomIndex3 = random.nextInt(getSuspiciousCharacterTraits().length);
        suspect = new Suspect(getRandomUniqueName(), random.nextInt(95 - 16) + 16, getOccupation()[randomIndex1],
                getAlibi()[randomIndex2], true, evidence(false), false,
                null, getSuspiciousCharacterTraits()[randomIndex3]);
        suspects.add(suspect);

        //a suspect, who has lied about his alibi and has a murder motive, but is not the killer
        int randomIndex4 = random.nextInt(getOccupation().length);
        int randomIndex5 = random.nextInt(getAlibi().length);
        int randomIndex6 = random.nextInt(getMurderMotive().length);
        int randomIndex7 = random.nextInt(getPositiveCharacterTraits().length);
        suspect = new Suspect(getRandomUniqueName(), random.nextInt(95 - 16) + 16, getOccupation()[randomIndex4],
                getAlibi()[randomIndex5], false, null, false,
                getMurderMotive()[randomIndex6], getPositiveCharacterTraits()[randomIndex7]);
        suspects.add(suspect);

        //a suspect, that has some evidence against him and has lied about his alibi, but is not the killer
        int randomIndex8 = random.nextInt(getOccupation().length);
        int randomIndex9 = random.nextInt(getAlibi().length);
        int randomIndex10 = random.nextInt(getPositiveCharacterTraits().length);
        suspect = new Suspect(getRandomUniqueName(), random.nextInt(95 - 16) + 16, getOccupation()[randomIndex8],
                getAlibi()[randomIndex9], false, evidence(false), false,
                null, getPositiveCharacterTraits()[randomIndex10]);
        suspects.add(suspect);

        //a suspect, that has a murder motive and had some suspicious behaviour during the interrogation, but is not the killer
        int randomIndex11 = random.nextInt(getOccupation().length);
        int randomIndex12 = random.nextInt(getAlibi().length);
        int randomIndex13 = random.nextInt(getMurderMotive().length);
        int randomIndex14 = random.nextInt(getSuspiciousCharacterTraits().length);
        suspect = new Suspect(getRandomUniqueName(), random.nextInt(95 - 16) + 16, getOccupation()[randomIndex11],
                getAlibi()[randomIndex12], true, null, false,
                getMurderMotive()[randomIndex13], getSuspiciousCharacterTraits()[randomIndex14]);
        suspects.add(suspect);

        return suspects;
    }


}
