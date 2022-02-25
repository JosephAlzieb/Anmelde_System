package gruppe;

import java.util.Optional;

class MatrikelNummer {
    private final String nr;

    private MatrikelNummer(String nr) {
        this.nr = nr;
    }

    public static Optional<MatrikelNummer> getMatrikelNummer(String matrikelNr) {
        if (istMatrikelNr(matrikelNr.trim())) {
            return Optional.of(new MatrikelNummer(matrikelNr));
        }
        return Optional.empty();
    }

    private static boolean hat_nur_ziffern(String matrikelNr) {
        try {
            int nr = Integer.parseInt(matrikelNr);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static boolean hat_richtige_laenge(String matrikelNr) {
        return matrikelNr.length() == 6;
    }

    public static boolean istMatrikelNr (String matrikelNr){
        return hat_nur_ziffern(matrikelNr.trim()) && hat_richtige_laenge(matrikelNr.trim());
    }
}
