package classroom.class_26_03_04.ex02;

public class Team {
    String name;
    int wins;
    int defeats;
    int tie;

    int getScore(){
        int winStrengh = 3;
        int tieStrengh = 1;
        int defeatStrengh = 0;

        return (wins * winStrengh) +
                (tie * tieStrengh) +
                (defeats * defeatStrengh);
    }
}
