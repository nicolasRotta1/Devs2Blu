//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> processo01());
        Thread t2 = new Thread(() -> processo02());

        t1.start();
        t2.start();
    }

    public static void processo01() {
        try {
            Thread.sleep(3000);
            System.out.println("Processo 01 ficou pronto");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        public static void processo02 () {
            try {
                Thread.sleep(1500);
                System.out.println("Processo 02 ficou pronto");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
