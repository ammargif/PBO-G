import java.util.HashMap;

public class Responder {

    private HashMap<String, String> responses;

    public Responder() {
        responses = new HashMap<>();
        initializeResponses();
    }

    // Inisialisasi respon yang tersedia untuk beberapa masalah umum
    private void initializeResponses() {
        responses.put("internet tidak konek", "Cobalah restart modem atau router Anda.");
        responses.put("lupa password", "Gunakan fitur 'Lupa Password' pada halaman login untuk reset password.");
        responses.put("komputer lambat", "Bersihkan file sementara dan uninstall program yang tidak diperlukan.");
        responses.put("layar biru", "Layar biru mungkin disebabkan oleh masalah hardware atau driver. Cobalah update driver Anda.");
        responses.put("printer tidak bisa mencetak", "Pastikan printer terhubung dengan benar dan memiliki kertas serta tinta.");
    }

    // Metode untuk menghasilkan respon berdasarkan masalah yang diberikan
    public String generateResponse(String problem) {
        for (String keyword : responses.keySet()) {
            if (problem.toLowerCase().contains(keyword)) {
                return responses.get(keyword);
            }
        }
        return "Maaf, kami tidak memiliki jawaban untuk masalah tersebut. Silakan hubungi dukungan teknis.";
    }
}
