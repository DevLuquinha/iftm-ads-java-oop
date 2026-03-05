package classroom.class_26_03_04.ex02;

public class Main {
    static void main(String[] args) {
        // 1. Populate teams
        Team flamengo = new Team();
        flamengo.name = "Flamengo";
        flamengo.wins = 8;
        flamengo.defeats = 4;
        flamengo.tie = 1;

        Team cruzeiro = new Team();
        cruzeiro.name = "Cruzeiro";
        cruzeiro.wins = 3;
        cruzeiro.defeats = 5;
        cruzeiro.tie = 2;

        // 2. Add teams to championship
        Champioship champioship = new Champioship();
        champioship.name = "Brasileirão";
        champioship.year = 2020;
        champioship.team1 = flamengo;
        champioship.team2 = cruzeiro;

        Team winner = champioship.getWinner();
        if (winner == null)
        {
            System.out.println("It was a tie! Both teams have the same score");
        }
        else{
            System.out.printf("The championship winner was %s, with %d score", winner.name, winner.getScore());
        }

    }
}
