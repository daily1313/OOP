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
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        System.out.println("게임을 시작합니다.");
        System.out.println("원하는 캐릭터를 선정해주세요.(1:정원사, 2:왕, 3:여왕, 4:신하, 5:병사, 6:트럼프인간, 7:토끼)");
        int optionNumber = chooseCharacterOptionNumber();
        playGame(optionNumber);
    }

    private static int chooseCharacterOptionNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputCharacter = scanner.nextInt();
        return inputCharacter;
    }

    private static void playGame(int characterOptionNumber) {
        if(characterOptionNumber == 1) {
            Trump gardener = Gardener.getInstance();
            gardener.act();
        }
        if(characterOptionNumber == 2) {
            Trump king = King.getInstance();
            king.act();
        }
        if(characterOptionNumber == 3) {
            Trump queen = Queen.getInstance();
            queen.act();
        }
        if(characterOptionNumber == 4) {
            Trump servant = Servant.getInstance();
            servant.act();
        }
        if(characterOptionNumber == 5) {
            Trump soldier = Soldier.getInstance();
            soldier.act();
        }
        if(characterOptionNumber == 6) {
            Trump trumpHuman = TrumpHuman.getInstance();
            trumpHuman.act();
        }
        if(characterOptionNumber == 7) {
            Animal rabbit = Rabbit.getInstance();
            rabbit.act();
        }
    }
}
