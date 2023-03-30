package OOP.catchTheKiller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game extends catchTheKiller{

    public static void main(String[] args) {
        Investigator investigator = whoIsOurInvestigator();
        Victim victim = whoWasKilled();
        Suspect killer = whoIsTheKiller();
        List<Suspect> suspects = getSuspects();
        suspects.add(killer);

        System.out.println("It was a peaceful morning until another body was found. A crime was commited. You can help the investigator find the criminal.");
        System.out.println(investigator + "\n" + victim);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int numberOfActions = 0;
        List<String> thoseWithEvidenceChecked = new ArrayList<>();
        while (!input.toLowerCase().contains("the killer is")) {
            //printing info about all suspects
            if (input.contains("see suspects")) {
                for (Suspect suspect : suspects) {
                    System.out.println(suspect);
                }
            //asking the investigator to conduct the interrogation
            } else if (input.toLowerCase().contains("interrogation")) {
                input = sc.nextLine();
                if (numberOfActions < 12) {
                    for (Suspect suspect : suspects) {
                        if (suspect.getName().equals(input)) {
                            System.out.println(investigator.conductTheInterrogation(suspect));
                            numberOfActions++;
                        } else {
                            System.out.println("Wrong name");
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
                        } else {
                            System.out.println("Wrong name");
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
                                } else {
                                    System.out.println("Wrong name");
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
                        } else {
                            System.out.println("Wrong name");
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
                        } else {
                            System.out.println("Wrong name");
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
