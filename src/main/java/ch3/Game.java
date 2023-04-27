package ch3;

import ch3.animal.Animal;
import ch3.animal.Rabbit;
import ch3.trump.Gardener;
import ch3.trump.King;
import ch3.trump.Queen;
import ch3.trump.Servant;
import ch3.trump.Shape;
import ch3.trump.Soldier;
import ch3.trump.Trump;
import ch3.trump.TrumpHuman;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private static final int GARDENER_OPTION_NUMBER = 1;
    private static final int KING_OPTION_NUMBER = 2;
    private static final int QUEEN_OPTION_NUMBER = 3;
    private static final int SERVANT_OPTION_NUMBER = 4;
    private static final int SOLDIER_OPTION_NUMBER = 5;
    private static final int TRUMP_HUMAN_OPTION_NUMBER = 6;
    private static final int RABBIT_OPTION_NUMBER = 7;

    public static void main(String[] args) {
        int optionNumber = chooseCharacterOptionNumber();
        playGame(optionNumber);
    }

    private static int chooseCharacterOptionNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 캐릭터를 선택해주세요.(1:정원사, 2:왕, 3:여왕, 4:신하, 5:병사, 6:트럼프인간, 7:토끼)");
        int inputCharacterOptionNumber = scanner.nextInt();
        return inputCharacterOptionNumber;
    }

    private static void playGame(int characterOptionNumber) {
        checkOptionNumberAboutGardener(characterOptionNumber);
        checkOptionNumberAboutKing(characterOptionNumber);
        checkOptionNumberAboutQueen(characterOptionNumber);
        checkOptionNumberAboutServant(characterOptionNumber);
        checkOptionNumberAboutSoldier(characterOptionNumber);
        checkOptionNumberAboutTrumpHuman(characterOptionNumber);
        checkOptionNumberAboutRabbit(characterOptionNumber);
    }

    private static void checkOptionNumberAboutGardener(int characterOptionNumber) {
        if(characterOptionNumber == GARDENER_OPTION_NUMBER) {
            Trump gardener = Gardener.getInstance();
            gardener.act();
        }
    }

    private static void checkOptionNumberAboutKing(int characterOptionNumber) {
        if(characterOptionNumber == KING_OPTION_NUMBER) {
            Trump king = King.getInstance();
            king.act();
        }
    }

    private static void checkOptionNumberAboutQueen(int characterOptionNumber) {
        if(characterOptionNumber == QUEEN_OPTION_NUMBER) {
            Trump queen = Queen.getInstance();
            queen.act();
        }
    }

    private static void checkOptionNumberAboutServant(int characterOptionNumber) {
        if(characterOptionNumber == SERVANT_OPTION_NUMBER) {
            Trump servant = Servant.getInstance();
            servant.act();
        }
    }

    private static void checkOptionNumberAboutSoldier(int characterOptionNumber) {
        if(characterOptionNumber == SOLDIER_OPTION_NUMBER) {
            Trump soldier = Soldier.getInstance();
            soldier.act();
        }
    }

    private static void checkOptionNumberAboutTrumpHuman(int characterOptionNumber) {
        if(characterOptionNumber == TRUMP_HUMAN_OPTION_NUMBER) {
            Trump trumpHuman = TrumpHuman.getInstance();
            trumpHuman.act();
        }
    }

    private static void checkOptionNumberAboutRabbit(int characterOptionNumber) {
        if(characterOptionNumber == RABBIT_OPTION_NUMBER) {
            Animal rabbit = Rabbit.getInstance();
            rabbit.act();
        }
    }
}
