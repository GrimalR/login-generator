package geco;

import java.util.Random;

/**
 * Classe représentant un générateur de mots de passe.
 */
public class PasswordGeneration {

    /**
     * Longueur des mots de passe.
     * */
    private static final int PASSWORD_LENGTH = 8;

    /**
     * Génère un mot de passe aléatoire.
     * @return un mot de passe
     * */
    public String getRandomPassword() {
        int leftLimit = 32;
        int rightLimit = 126;
        Random random = new Random();
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomLimitedInt = leftLimit + (random.nextInt(rightLimit - leftLimit + 1));
            password.append((char) randomLimitedInt);
        }
        return password.toString();
    }

}
