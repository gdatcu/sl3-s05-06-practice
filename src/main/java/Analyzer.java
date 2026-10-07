public class Analyzer {
    public static void main(String[] args) {
        // Datele noastre de intrare - rezultatele unei suite de teste
        String[] rezultate = {null,"","PASSED", "PASSED", "FAILED", "PASSED", "SKIPPED", "BLOCKED", "PASSED"};

        // Initializam contoarele
        int passedCount = 0;
        int failedCount = 0;
        int skippedCount = 0;

        System.out.println("--- Incepe analiza rezultatelor ---");

        // Bucla for-each pentru a parcurge fiecare rezultat
        for (String rezultat : rezultate) {
            if (rezultat == null || rezultat.isEmpty()) {
                System.out.println("Am gasit un rezultat invalid. Sarim peste el.");
                continue; // Sarim peste intrarile goale sau nule
            }

            System.out.println("Procesam statusul: " + rezultat);

            if (rezultat.equals("BLOCKED")) {
                System.out.println("EROARE CRITICA: Test blocat! Analiza se opreste.");
                break; // Oprim complet bucla
            } else if (rezultat.equals("PASSED")) {
                passedCount++;
            } else if (rezultat.equals("FAILED")) {
                failedCount++;
            } else if (rezultat.equals("SKIPPED")) {
                skippedCount++;
            }
        }

        // Afisam sumarul final
        System.out.println("\n--- Analiza finalizata ---");
        System.out.println("Teste trecute: " + passedCount);
        System.out.println("Teste picate: " + failedCount);
        System.out.println("Teste sarite: " + skippedCount);

}

}