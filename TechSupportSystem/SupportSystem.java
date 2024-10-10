public class SupportSystem {

    private Responder responder;
    private InputReader inputReader;

    public SupportSystem() {
        responder = new Responder();
        inputReader = new InputReader();
    }

    // Metode utama untuk menjalankan sistem dukungan
    public void start() {
        System.out.println("Selamat datang di sistem dukungan teknis.");
        System.out.println("Ketik 'exit' untuk keluar.");

        // Loop untuk terus menerima masalah dari pengguna sampai mereka mengetik "exit"
        while (true) {
            System.out.println("\nSilakan ketikkan masalah Anda:");
            String problem = inputReader.getInput();

            if (problem.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah menggunakan layanan dukungan kami.");
                break;
            }

            String response = responder.generateResponse(problem);
            System.out.println("Jawaban: " + response);
        }
    }

    public static void main(String[] args) {
        SupportSystem supportSystem = new SupportSystem();
        supportSystem.start();
    }
}
