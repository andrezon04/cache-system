import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> banco = new ArrayList<Pessoa>();
        ArrayList<Pessoa> cache = new ArrayList<Pessoa>();
        cache.add(new Pessoa("empty", 0, 0));
        banco.add(new Pessoa("Carol", 23, 22));
        banco.add(new Pessoa("Cris", 43, 12));
        banco.add(new Pessoa("Marcio", 52, 37));

        System.out.print("Digite seu ID: ");
        int id = sc.nextInt();

        for (Pessoa p : cache) {
            if (p.getId() == id) {
                System.out.println("Pessoa encontrada no cache: ...");
                break;
            } else {
                for (Pessoa pessoa : banco) {
                    if (pessoa.getId() == id) {
                        System.out.println("Pessoa buscada no banco e adicionada ao cache:...");
                        System.out.println(pessoa);
                    } else {
                        System.out.println("ID não encontrado. ");
                    }
                    break;
                }
            }
        }
    }
}