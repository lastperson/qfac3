package Helper;

/**
 * Created by user on 8/11/14.
 */
public class RandomedValue {

    public static String AA(String gen){
        String[] Letters = {"A","B", "C"};
        String[] Characters = {"1", "2", "3", "4"};
        String[] SpecialCharacters = {"!","@","#","$","%","^","&"};
        String[] Calambur = {"asd","qwe","rty", "poiu"};

        int FirstLetter = Letters.length;
        int SecondCharacters = Characters.length;
        int TherdSpecialCharacters = SpecialCharacters.length;
        int ForthCalambur = Calambur.length;

        int RandomLetters = (int)(Math.random() * FirstLetter);
        int RandomCharacters = (int)(Math.random()*SecondCharacters);
        int RandomSpecialCharacters = (int)(Math.random()*TherdSpecialCharacters);
        int RandomCalambur = (int)(Math.random()*ForthCalambur);

        String Name = Letters[RandomLetters]+Calambur[RandomCalambur]+Calambur[RandomCalambur]+Letters[RandomLetters];
        String Password = Letters[RandomLetters]+SpecialCharacters[RandomSpecialCharacters]+Characters[RandomCharacters]+Calambur[RandomCalambur];

        if (gen.equals("Name")){
            return Name;
        }else {
            return Password;
        }
    }
}
