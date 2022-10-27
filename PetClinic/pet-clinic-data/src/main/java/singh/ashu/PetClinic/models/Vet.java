package singh.ashu.PetClinic.models;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{

    private Set<Specility> specilities=new HashSet<>();

    public Set<Specility> getSpecilities() {
        return specilities;
    }

    public void setSpecilities(Set<Specility> specilities) {
        this.specilities = specilities;
    }
}
