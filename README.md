# Murder-mistery

The idea is that "Catch the killer" is a game, where the player can try and guess who is the killer. In the beginning it should randomly choose the identity of the victim, killer and other suspects. Killer is the only one, who has the fake alibi, evidence against him, murder motive and was acting suspicious during the interrogation, while other suspects have only 2 of those things. The player can ask the investigator to reveal something about the suspect, but has limited amount of hints. When the limit is reached or the player is ready to guess, he can type the possible killer's name and check, whether he was right. 


Programm peab vastama järgmistele tingimustele.

Programm käsitleb mingit (inimlikku) tegevust, näiteks mängimist, kliendile vastamist, kodumasina kasutamist vm. Eriti tore aga oleks, kui programm oleks teile kasulik oma erialaste ülesannete lahendamisel.
Programm peab kasutajalt midagi küsima (võib-olla ka korduvalt). Võib eeldada, et kasutaja sisestab vastuse nõutud kujul.
Programm peaks olema kasutatav ilma, et programmi kohta oleks erilisi eelteadmisi. Küsimused peavad vajaliku info andma. Hea oleks, kui programm käivitamisel annab vajaliku üldtutvustava lühiinfo.
Programm peab sisaldama juhusliku suuruse kasutamist (soovitavalt klassi Random abil). Kui programm on mõeldud näiteks erialaste andmete töötlemiseks, siis võib sellest ka loobuda. Kuigi näiteks sobivas vahemikus juhuslike andmete genereerimine võib olla kasulik programmi testimiseks.
Programm peab koosnema mitmest klassist (sh. peaklass). Andmete kasutamine peaks käima erinevate objektide abil. Selleks loodud klassid peaksid sisaldama isendivälju, konstruktoreid, get- ja set-meetodeid ja teisi vajalikke meetodeid.
Programm peab olema endi kirjutatud.
Programm peab olema mõistlikult kommenteeritud.
Programm ei tohiks olla liiga keeruline. Vajadusel konsulteerige praktikumi juhendajaga enne programmeerimist.
Kasutajaga suhtlemine peaks olema väga elementaarselt kujundatud. Vältida (veel) graafilist kasutajaliidest. Ekraanile kuvatav info (ka näiteks mänguseis) võib olla tekstiridadena (System.out.println). Kasutajaga dialoogi võib realiseerida mitmeti. Näiteks klassi Scanner (vt. Praktikum 1) kasutades või alltoodud JOptionPane meetodeid kasutades. Programmi käivitamiseks vajalikku alginfot võib nõuda ka käsurea argumentidena (vt. Nädal 2).
Kasutajaga dialoogi korraldamisel on abiks, kui programmi algusesse, lausa enne klassi kirjelduse algust, panna rida import javax.swing.JOptionPane;
Kohale, kus programm peaks kasutajalt sõne küsima, tuleb panna rida
String sisestatakse = JOptionPane.showInputDialog(null, "Sisesta midagi ", "Andmete sisestamine",
                                                  JOptionPane.QUESTION_MESSAGE);
