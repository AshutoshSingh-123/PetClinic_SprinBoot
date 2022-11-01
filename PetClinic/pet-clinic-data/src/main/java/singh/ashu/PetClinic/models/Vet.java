package singh.ashu.PetClinic.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specilities",joinColumns = @JoinColumn(name="vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specility_id"))
    private Set<Specility> specilities=new HashSet<>();

    public Set<Specility> getSpecilities() {
        return specilities;
    }

    public void setSpecilities(Set<Specility> specilities) {
        this.specilities = specilities;
    }
}
