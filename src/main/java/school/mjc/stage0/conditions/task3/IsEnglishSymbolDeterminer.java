package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        // Check if the character is in the English alphabet range (A-Z or a-z)
        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}