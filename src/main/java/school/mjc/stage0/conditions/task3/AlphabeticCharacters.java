package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character >= 'A' && character <= 'z') {
            if (character == 'a' || character =='A' ||
                character == 'e' || character == 'E' ||
                character == 'u' || character == 'U' ||
                character == 'o' || character == 'O' ||
                character == 'i' || character == 'I' ||
                character == 'y' || character == 'Y') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else
        {
            System.out.println("wrong alphabet!");
        }
    }
}
