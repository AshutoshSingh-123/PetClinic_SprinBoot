package singh.ashu.PetClinic.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specilities")
public class Specility extends BaseEntity{

    @Column(name = "description")
    private String desc;


}
