package singh.ashu.PetClinic.models;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "owners")
public class Owner extends Person {


  @NotBlank
  @Column(name = "address")
  private String address;

  @NotBlank
  @Column(name = "city")
  private String city;

  @Length(max = 10,min = 10)
  @Column(name = "telephone")
  private String telephone;

  @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
  private Set<Pet> pets=new HashSet<>();




}
