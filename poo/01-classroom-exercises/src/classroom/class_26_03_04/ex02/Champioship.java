package classroom.class_26_03_04.ex02;

public class Champioship {
    String name;
    int year;
    Team team1;
    Team team2;

    Team getWinner(){
        int team1Score = team1.getScore();
        int team2Score = team2.getScore();

        if (team1Score > team2Score){
            return team1;
        }
        else if (team1Score < team2Score)
        {
            return team2;
        }
        else { // Tie
            return null;
        }
    }
}
