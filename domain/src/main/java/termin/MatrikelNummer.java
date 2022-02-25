package termin;

import java.util.Optional;

class MatrikelNummer {
    private String nr;

    private MatrikelNummer(String nr) {
        this.nr = nr;
    }

    public static Optional<MatrikelNummer> getMatrikelNummer(String matrikelNr) {
        boolean b1 = hat_richtige_laenge(matrikelNr);
        boolean b2 = hat_nur_ziffern(matrikelNr);
        if (b1 && b2) {
            return Optional.of(new MatrikelNummer(matrikelNr));
        }
        return Optional.empty();
    }

    private static boolean hat_nur_ziffern(String matrikelNr) {
        try {
            int nr = Integer.parseInt(matrikelNr);
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    private static boolean hat_richtige_laenge(String matrikelNr) {
        return matrikelNr.length() == 6;
    }
}
