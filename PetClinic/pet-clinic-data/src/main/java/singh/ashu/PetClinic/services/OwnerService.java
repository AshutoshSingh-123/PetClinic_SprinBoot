package singh.ashu.PetClinic.services;

import singh.ashu.PetClinic.models.Owner;

public interface OwnerService {
    Owner findByLastName(String lastName);
}
