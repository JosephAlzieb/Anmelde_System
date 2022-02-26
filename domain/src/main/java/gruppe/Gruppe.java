package gruppe;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Gruppe {

    private Long id;
    private int anzahlPlaeze;
    private Set<User> users = new HashSet<>();


    public Gruppe(Long id) {
        this.id = id;
        this.anzahlPlaeze = 3;
    }

    public Gruppe addUser(String gihubHandle, String name, String matrikelNummer){
        if(hat_noch_plaeze()){
            users.add(new User(gihubHandle,name,matrikelNummer));
            anzahlPlaeze --;
            return new Gruppe(id);
        }
        else {
            System.out.println("Gruppe ist voll");
            return null;
        }
    }

    public boolean hat_noch_plaeze() {
        return anzahlPlaeze > 0;
    }

    public int getGruppenGroeße(){
        return users.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gruppe)) return false;
        Gruppe gruppe = (Gruppe) o;
        return id.equals(gruppe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
