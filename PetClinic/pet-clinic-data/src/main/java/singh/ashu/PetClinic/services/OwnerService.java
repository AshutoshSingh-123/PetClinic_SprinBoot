package singh.ashu.PetClinic.services;

import singh.ashu.PetClinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
