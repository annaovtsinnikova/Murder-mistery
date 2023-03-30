package OOP.catchTheKiller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game extends catchTheKiller{

    public static void main(String[] args) {
        Investigator investigator = whoIsOurInvestigator();
        Victim victim = whoWasKilled();
        Suspect killer = whoIsTheKiller();
        List<Suspect> suspects = getSuspects();
        suspects.add(killer);
        Collections.shuffle(suspects);

        System.out.println("It was a peaceful morning until another body was found. A crime was commited. You can help the investigator find the criminal.");
        System.out.println("------------------------------------------");
        System.out.println(investigator + "\n" + "The victim: " + victim);
        System.out.println("------------------------------------------");
        System.out.println("You have to find, who is the killer. To start the game firstly press 'enter'. " +
                "Then when you need to see the suspects type 'see suspects'. \nThe information is printed like " +
                "<Name>, <age>, <occupation>, <their alibi>. One of them is the real killer. \nKiller is the only one, " +
                "who has the fake alibi, evidence against him, murder motive and was acting suspicious during the " +
                "interrogation, \nwhile other suspects have only 2 of those things. \nYou can to ask the investigator to: \n" +
                "'interrogation' 'suspect's name' - to conduct the interrogation and get their character traits; \n" +
                "'check the alibi' 'suspect's name' - get to know is the alibi is fake, \n" +
                "'murder motive' 'suspect's name' - whether they know person's motive to kill; \n" +
                "'any evidence' 'suspect's name' - if there is any evidence against the suspect or not \n and if there is you can consult " +
                "with the detective by 'any evidence' 'enough evidence' 'suspect's name' if he believes the evidence is enough \nto think that is the real killer. " +
                "\nBut remember, that you only have 12 available actions, then the game will end. \nAnd you also can not ask" +
                "about the same suspect 2 times in a row. \nIf you feel like you are ready " +
                "to say who the killer is then type 'the killer is'. \nYou also have to press 'enter' after every action");

        Scanner sc = new Scanner(System.in);
        int numberOfActions = 0;
        String input = sc.nextLine();
        List<String> thoseWithEvidenceChecked = new ArrayList<>();
        while (!input.toLowerCase().contains("the killer is") && numberOfActions != 12) {
            input = sc.nextLine();
            //printing info about all suspects
            if (input.contains("see suspects")) {
                int howManySuspects = 0;
                for (Suspect suspect : suspects) {
                    if (howManySuspects <= 5) {
                        System.out.println(suspect);
                        howManySuspects++;
                    }
                }
            //asking the investigator to conduct the interrogation
            } else if (input.toLowerCase().contains("interrogation")) {
                input = sc.nextLine();
                if (numberOfActions < 12) {
                    for (Suspect suspect : suspects) {
                        if (suspect.getName().equals(input)) {
                            System.out.println(investigator.conductTheInterrogation(suspect));
                            numberOfActions++;
                        }
                    }
                }
            //asking the investigator to check the alibi
            } else if (input.toLowerCase().contains("check the alibi")) {
                input = sc.nextLine();
                if (numberOfActions < 12) {
                    for (Suspect suspect : suspects) {
                        if (suspect.getName().equals(input)) {
                            investigator.checkTheAlibi(suspect);
                            numberOfActions++;
                        }
                    }
                }

            } else if (input.toLowerCase().contains("any evidence")) {
                input = sc.nextLine();
                //asking the investigator if there is enough evidence
                if (input.toLowerCase().contains("enough evidence")) {
                    input = sc.nextLine();
                    if (thoseWithEvidenceChecked.contains(input)) {
                        if (numberOfActions < 12) {
                            for (Suspect suspect : suspects) {
                                if (suspect.getName().equals(input)) {
                                    investigator.isTheEvidenceEnough(suspect);
                                    numberOfActions++;
                                }
                            }
                        }
                    } else {
                        System.out.println("First you should check if there is any evidence against that person at all");
                    }
                    //asking the investigator if there is any evidence
                } else if (numberOfActions < 12) {
                    for (Suspect suspect : suspects) {
                        if (suspect.getName().equals(input)) {
                            investigator.isThereAnyEvidence(suspect);
                            numberOfActions++;
                            thoseWithEvidenceChecked.add(suspect.getName());
                        }
                    }
                }
            //asking the investigator if they know person's motive to kill
            } else if (input.toLowerCase().contains("murder motive")) {
                input = sc.nextLine();
                if (numberOfActions < 12) {
                    for (Suspect suspect : suspects) {
                        if (suspect.getName().equals(input)) {
                            investigator.isThereAMurderMotive(suspect);
                            numberOfActions++;
                        }
                    }
                }
            }
        }
        if (input.toLowerCase().contains("the killer is") || numberOfActions==12) {
            System.out.println("Do you know who the killer is?...");
            input = sc.nextLine();
            investigator.checkTheKiller(input, killer);
        }
        sc.close();
    }

}
