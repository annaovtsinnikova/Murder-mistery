package OOP.catchTheKiller;

public class Investigator extends Person{

    private static final String occupation = "investigator";
    public Investigator(String name, int age) {
        super(name, age, occupation);

    }
    public void checkTheAlibi(Suspect suspect) {
        if (suspect.isTheAlibiTrue()) {
            System.out.println(getName() + ": Yes, the person's alibi checked out.");
        } else {
            System.out.println(getName() + ": The person has lied about his alibi");
        }
    }
    public void isThereAnyEvidence(Suspect suspect) {
        if (suspect.getEvidence() != null) {
            System.out.println(getName() + ": the evidence - " + suspect.getEvidence());
        } else {
            System.out.println(getName() + ": There is no particular evidence against this person");
        }
    }
    public void isTheEvidenceEnough(Suspect suspect) {
        if (suspect.isTheEvidenceTrue()) {
            System.out.println(getName() + ": Oh yes, I believe that means this person might be guilty");
        } else {
            System.out.println(getName() + ": Well, I'm not sure this is enough to accuse this person of murder");
        }
    }
    public void isThereAMurderMotive(Suspect suspect) {
        if (suspect.getMurderMotive() != null) {
            System.out.println(suspect.getMurderMotive());
        } else {
            System.out.println(getName() + ": We don't know if this person had any murder motive");
        }
    }
    public String conductTheInterrogation(Suspect suspect) {
        return suspect.getCharacterTrait();
    }
    public void checkTheKiller(String suspectName, Suspect killer) {
        if (suspectName.equals(killer.getName())) {
            System.out.println(getName() + ": Let me check......" + "\n" + "Oh yes, you caught the killer, congratulations!" +
                    "Now this person will be arrested and the case will soon be submitted to the court");
        } else {
            System.out.println(getName() + ": Oh no, that's not the culprit. The real killer avoided punishment. It was: " +
                    killer + ", " + killer.getEvidence() + ", " + killer.getMurderMotive() + ", " + killer.getCharacterTrait());
        }
    }

    public String toString() {
        return getName() + ", " + occupation;
    }

}
