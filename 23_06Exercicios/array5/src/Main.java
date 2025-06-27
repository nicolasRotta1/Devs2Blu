import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> musicas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas 5 músicas favoritas");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma música");
            musicas.add(sc.next());
        }
        for (String musica : musicas) {
            System.out.println(musicas.indexOf(musica) + " - " + musica);
        }
        while (true) {
            System.out.println("Deseja mudar uma música de lugar?(S/N)");
            String quer = sc.next().toLowerCase();
            if (quer.equalsIgnoreCase("s")) {
                System.out.println("Selecione uma música pelo ID");
                int music1 = sc.nextInt();
                System.out.println("Deseja botar ela em que lugar?");
                int music2 = sc.nextInt();
                String backup1 = musicas.get(music1);
                String backup2 = musicas.get(music2);
                musicas.set(music1, backup2);
                musicas.set(music2, backup1);
                for (String musica : musicas) {
                    System.out.println(musicas.indexOf(musica) + " - " + musica);
                }
            } else if (quer.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("ID não existe");
            }

        }
    }
}
