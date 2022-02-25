package termin;

class User {
    private String gihubHandle;
    private String name;
    private MatrikelNummer matrikelNummer;

    public User(String gihubHandle, String name, String matrikelNummer) {
        this.gihubHandle = gihubHandle;
        this.name = name;
        this.matrikelNummer = MatrikelNummer.getMatrikelNummer(matrikelNummer).get();
    }

    public String getGihubHandle() {
        return gihubHandle;
    }

    public void setGihubHandle(String gihubHandle) {
        this.gihubHandle = gihubHandle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MatrikelNummer getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(MatrikelNummer matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }
}
