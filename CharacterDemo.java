
/**
 * Write a description of CharacterDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterDemo {
    public void digitTest(String test){
        for(int k=0; k<test.length(); k++) {
            char ch = test.charAt(k);
            if(Character.isDigit(ch)) System.out.println(ch + " is a digit.");
            if (Character.isAlphabetic(ch)) System.out.println(ch + " is alphabetic.");
        }
    }
}
