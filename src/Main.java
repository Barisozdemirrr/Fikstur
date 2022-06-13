import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Lutfen takım sayisini giriniz : ");
        int n = in.nextInt();

        List<String> teams = new ArrayList<>();

        for (int i=0; i<n; i++) {
            System.out.println("Lutfen takım isimlerini giriniz : ");
            String team = in.next();
            teams.add(team);
        }

        if (n%2 != 0) {
            teams.add("BAY");
            n +=1;
        }

        List<String> tempTeams = new ArrayList<>();

        while (0 < teams.size()) {
            int indis = (int)(Math.random()*teams.size());
            tempTeams.add(teams.get(indis));
            teams.remove(teams.get(indis));
        }

        teams = tempTeams;

        int totalRound = n - 1;
        int numMatchPerRound = n / 2;

        LinkedHashMap<String, ArrayList<ArrayList<String>>> rounds = new LinkedHashMap<>();

        for (int i=0; i<totalRound; i++) {
            String round = String.valueOf(i + 1);
            rounds.put(round, new ArrayList<>());
        }

        for (int i=0; i<totalRound; i++) {
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();

            for (int j=0; j<numMatchPerRound; j++) {
                home.add(teams.get(j));
                away.add(teams.get((n - 1) - j));
            }

            String round = String.valueOf(i + 1);
            rounds.get(round).add(home);
            rounds.get(round).add(away);

            List<String> newTeams = new ArrayList<>();

            newTeams.add(teams.get(0));
            newTeams.add(teams.get((n - 1)));

            for (int k=1; k<teams.size() - 1; k++) {
                newTeams.add(teams.get(k));
            }

            teams = newTeams;
        }

        System.out.println();

        for (int i=0; i<2*totalRound; i++) {
            System.out.println((i + 1) + ". Hafta");
            for (int j=0; j<numMatchPerRound; j++) {
                if (i < totalRound) {
                    System.out.println(rounds.get(String.valueOf(i + 1)).get(0).get(j) + " vs " +  rounds.get(String.valueOf(i + 1)).get(1).get(j));
                } else {
                    System.out.println(rounds.get(String.valueOf(i + 1 - totalRound)).get(1).get(j) + " vs " +  rounds.get(String.valueOf(i + 1 - totalRound)).get(0).get(j));
                }
            }
            System.out.println();
        }



    }
}