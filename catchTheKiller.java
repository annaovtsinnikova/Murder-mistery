package OOP.catchTheKiller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class catchTheKiller extends Library{

    static List<Suspect> suspects = new ArrayList<>();
    static List<String> namesUsed = new ArrayList<>();

    public static Investigator whoIsOurInvestigator() {
        Random random = new Random();
        int randomIndex1 = random.nextInt(getNames().length);
        return new Investigator(getNames()[randomIndex1], random.nextInt(60 - 25) + 25);
    }

    public static Victim whoWasKilled() {
        Random random = new Random();
        Victim victim;
        do {
            int randomIndex1 = random.nextInt(getNames().length);
            int randomIndex2 = random.nextInt(getOccupation().length);
            int randomIndex3 = random.nextInt(getCausesOfDeath().length);
            victim = new Victim(getNames()[randomIndex1], random.nextInt(95 - 16) + 16,
                    getOccupation()[randomIndex2], getCausesOfDeath()[randomIndex3]);
            namesUsed.add(victim.getName());
        } while (namesUsed.contains(victim.getName()));

        return victim;
    }

    //one of the suspects is the killer
    public static Suspect whoIsTheKiller() {
        Random random = new Random();
        Suspect killer;
        do {
            int randomIndex1 = random.nextInt(getNames().length);
            int randomIndex2 = random.nextInt(getOccupation().length);
            int randomIndex3 = random.nextInt(getAlibi().length);
            int randomIndex4 = random.nextInt(getMurderMotive().length);
            int randomIndex5 = random.nextInt(getSuspiciousCharacterTraits().length);
            killer = new Suspect(getNames()[randomIndex1], random.nextInt(95 - 16) + 16,
                    getOccupation()[randomIndex2], getAlibi()[randomIndex3], false, evidence(true),
                    true, getMurderMotive()[randomIndex4], getSuspiciousCharacterTraits()[randomIndex5]);
            namesUsed.add(killer.getName());
        } while (namesUsed.contains(killer.getName()));

        return killer;
    }

    public static List<Suspect> getSuspects() {
        Random random = new Random();
        Suspect suspect;
        //a suspect, who has some evidence against him and had some suspicious behaviour during the interrogation, but is not the killer
        do {
            int randomIndex1 = random.nextInt(getNames().length);
            int randomIndex2 = random.nextInt(getOccupation().length);
            int randomIndex3 = random.nextInt(getAlibi().length);
            int randomIndex4 = random.nextInt(getSuspiciousCharacterTraits().length);
            suspect = new Suspect(getNames()[randomIndex1], random.nextInt(95 - 16) + 16,
                    getOccupation()[randomIndex2], getAlibi()[randomIndex3], true,
                    evidence(false), false, null,
                    getSuspiciousCharacterTraits()[randomIndex4]);
            namesUsed.add(suspect.getName());
            suspects.add(suspect);
        } while (namesUsed.contains(suspect.getName()));

        //a suspect, who lied about his alibi and has a murder motive, but is not the killer
        do {
            int randomIndex1 = random.nextInt(getNames().length);
            int randomIndex2 = random.nextInt(getOccupation().length);
            int randomIndex3 = random.nextInt(getAlibi().length);
            int randomIndex4 = random.nextInt(getMurderMotive().length);
            int randomIndex5 = random.nextInt(getPositiveCharacterTraits().length);
            suspect = new Suspect(getNames()[randomIndex1], random.nextInt(95 - 16) + 16,
                    getOccupation()[randomIndex2], getAlibi()[randomIndex3], false, null,
                    false, getMurderMotive()[randomIndex4], getPositiveCharacterTraits()[randomIndex5]);
            namesUsed.add(suspect.getName());
            suspects.add(suspect);
        } while (namesUsed.contains(suspect.getName()));

        //a suspect, that has some evidence against him and lied about his alibi, but is not the killer
        do {
            int randomIndex1 = random.nextInt(getNames().length);
            int randomIndex2 = random.nextInt(getOccupation().length);
            int randomIndex3 = random.nextInt(getAlibi().length);
            int randomIndex4 = random.nextInt(getPositiveCharacterTraits().length);
            suspect = new Suspect(getNames()[randomIndex1], random.nextInt(95 - 16) + 16,
                    getOccupation()[randomIndex2], getAlibi()[randomIndex3], false,
                    evidence(false), false, null,
                    getPositiveCharacterTraits()[randomIndex4]);
            namesUsed.add(suspect.getName());
            suspects.add(suspect);
        } while (namesUsed.contains(suspect.getName()));

        //a suspect, that has a murder motive and had some suspicious behaviour during the interrogation, but is not the killer
        do {
            int randomIndex1 = random.nextInt(getNames().length);
            int randomIndex2 = random.nextInt(getOccupation().length);
            int randomIndex3 = random.nextInt(getAlibi().length);
            int randomIndex4 = random.nextInt(getMurderMotive().length);
            int randomIndex5 = random.nextInt(getSuspiciousCharacterTraits().length);
            suspect = new Suspect(getNames()[randomIndex1], random.nextInt(95 - 16) + 16,
                    getOccupation()[randomIndex2], getAlibi()[randomIndex3], true, null,
                    false, getMurderMotive()[randomIndex4], getSuspiciousCharacterTraits()[randomIndex5]);
            namesUsed.add(suspect.getName());
            suspects.add(suspect);
        } while (namesUsed.contains(suspect.getName()));

        return suspects;
    }


}
