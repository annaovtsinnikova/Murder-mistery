package OOP.catchTheKiller;

import java.util.ArrayList;
import java.util.List;

public class Library {

    //to make the game funnier, the characters involved have the names of famous people and characters from films/books
    static String[] names = {
            "Astrid Hofferson",
            "Patrick Bateman",
            "Tywin Lannister",
            "Sansa Stark",
            "Paul Bäumer",
            "Robert Lohkamp",
            "Samwise Gamgee",
            "Jennifer Lopez",
            "Arwen Undómiel",
            "Ron Weasley",
            "Susan Pevensie",
            "Vito Corleone",
            "David Copperfield",
            "Jyn Erso",
            "Lando Calrissian",
            "Rick Deckard",
            "Austin Butler",
            "Andrew Garfield",
            "Melanie Griffith",
            "Maeve Wiley",
            "Benedict Cumberbatch",
            "Cillian Murphy",
            "Lili Reinhart",
            "Thom Yorke",
            "Billie Joe Armstrong",
            "Teresa Lisbon",
            "Patrick Jane",
            "Chloe Decker",
            "Lucifer Morningstar",
            "Chandler Bing",
            "Gregory House",
            "Walter White",
            "Daphne Blake",
            "Emma Watson",
            "Luna Lovegood",
            "Will Turner",
            "Keira Knightley",
            "Audrey Hepburn",
            "Ryan Gosling",
            "Dorian Grey",
            "Jane Eyre",
            "Dwight Schrute",
            "Theodore Roosevelt",
            "Lewis Carroll"
    };
    public static String[] getNames() {
        return names;
    }

    static String[] occupation = {
            "actor",
            "entrepreneur",
            "banker",
            "youtube blogger",
            "politician",
            "babysitter",
            "janitor",
            "software engineer",
            "baker",
            "musician",
            "beer brewer",
            "medical student",
            "art dealer",
            "high school teacher",
            "molecular biology professor",
            "drug dealer",
            "news channel reporter",
            "mortician",
            "criminal attorney",
            "school meals supervisor",
            "car dealer",
            "hypnotherapist",
            "aircraft engineer",
            "pawnbroker",
            "clairvoyant",
            "pig farm owner",
            "unemployed"
    };
    static public String[] getOccupation() {
        return occupation;
    }

    static String[] causesOfDeath = {
            "was poisoned",
            "was shot dead",
            "got a drug overdose",
            "was hit by a car",
            "fell or was pushed off the bridge and drowned in the river",
            "was drowned in the bath",
            "got stabbed",
            "was buried alive",
            "was found hanged in his/her flat",
            "was suffocated",
            "was robbed and beaten",
            "blunt force trauma to the head"

    };

    public static String[] getCausesOfDeath() {
        return causesOfDeath;
    }

    static String[] murderMotive = {
            "The victim had a lot of money and the person stood to inherit it",
            "The victim had a collection of rare diamonds",
            "The victim was a significant other of the person who was controlling or abusing them",
            "The person and the victim were in business together and the person didn't want to share the profits",
            "The person could have been motivated by revenge. Specifically, the victim told someone a secret about the person, and the person might have killed them out of revenge",
            "The victim was blackmailing the person, threatening to reveal details of a crime the person did",
            "The victim was the person's spouse and was going to leave the person",
            "The person wanted to collect the life insurance money, that was given to him after the victim's death",
            "The person and the victim were rivals and the person might have decided to finally get rid of the rival",
            "The victim drove the killer's son to suicide, so this person wanted revenge",
            "The person has been suffering from a mental illness that caused them to commit the murder",
            "The victim had information that would humiliate person and maybe ruin their career"
    };

    public static String[] getMurderMotive() {
        return murderMotive;
    }


    public static String evidence(boolean ifEvidenceFromTheKiller) {
        String evidence = "";
        for (String s : causesOfDeath) {
            if (ifEvidenceFromTheKiller) {
                switch (s) {
                    case "was poisoned" -> evidence = "the bottle of cyanide was found in person's possession";
                    case "was shot dead" ->
                            evidence = "Browning 1911-22, which was used to kill, belongs to the person";
                    case "got a drug overdose" ->
                            evidence = "fingerprints on the 'Cymbalta' bottle, antidepressants, the overdose of which caused death";
                    case "was hit by a car" ->
                            evidence = "the person eas caught on camera at the gas station with the car that a witness saw at the crime scene.";
                    case "fell or was pushed off the bridge was drowned in the river" ->
                            evidence = "the shoe of the victim was found in person's possession";
                    case "was drowned in the bath" ->
                            evidence = "there was a fight and person's dna was found under the victim's fingernails";
                    case "got stabbed" -> evidence = "a knife with victim's blood was found at person's house";
                    case "was buried alive" ->
                            evidence = "person's hair and blood drops with the same blood type were found on the victim";
                    case "blunt force trauma to the head" -> evidence = "baseball bat with victim's blood";
                    case "was robbed and beaten" -> evidence = "victim's possessions found at person's house";
                    case "was found hanged in his/her flat" ->
                            evidence = "clothing fibers and a partial shoe print found at the crime scene that belonged to that person";
                    case "was suffocated" ->
                            evidence = "the scarf, with which the crime was committed, was found in person's possession";
                }
            } else {
                switch (s) {
                    case "was poisoned" -> evidence = "person has been working with chemicals for a while";
                    case "was shot dead" -> evidence = "person sent a threatening message to the victim 2 weeks ago";
                    case "got a drug overdose" -> evidence = "the person was a drug addict in the past";
                    case "was hit by a car" ->
                            evidence = "a witness saw a car with a license plate number that belongs to the person";
                    case "fell or was pushed off the bridge was drowned in the river" ->
                            evidence = "the person works close to the crime scene";
                    case "was drowned in the bath", "was suffocated" ->
                            evidence = "person's fingerprints were found at victim's house";
                    case "got stabbed" ->
                            evidence = "the person had a meeting with the victim planned on the day of the murder";
                    case "was buried alive" ->
                            evidence = "a witness claimed that has seen somebody who looked like the person";
                    case "blunt force trauma to the head" -> evidence = "the person is a baseball player";
                    case "was robbed and beaten" -> evidence = "the person really needed money";
                    case "was found hanged in his/her flat" ->
                            evidence = "the person had recently had an argument with the victim";
                }

            }
        }
        return evidence;
    }
    static String[] Alibi = {
            "had a meeting at work",
            "was out of town on vacation with family",
            "was at the bar with some friends",
            "was at home watching TV",
            "was at the gym working out",
            "was at the hospital",
            "had a food poisoning and was at home sleeping all day",
            "was at the restaurant having dinner",
            "was at the hospital visiting a sick relative"

    };
    public static String[] getAlibi() {
        return Alibi;
    }
    static String[] suspiciousCharacterTraits = {
            "impatient",
            "impolite",
            "stressed",
            "cunning",
            "resourceful",
            "ruthless",
            "secretive",
            "emotionally detached",
            "narcissistic",
            "manipulative",
            "cheerful",
            "disrespectful",
            "sarcastic",
            "really calm",
            "angry",
            "mysterious",
            "jealous"
    };
    public static String[] getSuspiciousCharacterTraits() {
        return suspiciousCharacterTraits;
    }
    static String[] positiveCharacterTraits = {
            "grieving",
            "anxious",
            "depressive",
            "polite",
            "loyal",
            "intelligent",
            "caring",
            "upset",
            "feeling guilty",
            "eccentric and conceited",
            "kind",
            "selfless",
            "benevolent",
            "charismatic and curious",
            "empathetic",
            "honest"
    };
    public static String[] getPositiveCharacterTraits() {
        return positiveCharacterTraits;
    }

}
