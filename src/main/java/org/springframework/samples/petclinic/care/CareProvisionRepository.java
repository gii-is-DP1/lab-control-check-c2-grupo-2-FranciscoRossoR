package org.springframework.samples.petclinic.care;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CareProvisionRepository extends CrudRepository<CareProvision,Integer>{
    List<CareProvision> findAll();        
    Optional<CareProvision> findById(int id);
    CareProvision save(CareProvision p);

    @Query("SELECT care FROM cares care")
	List<Care> findAllCares();

    @Query("SELECT cp FROM care_provisions cp")
	List<CareProvision> findAllCaresProvided();
    //List<Care> findCompatibleCares(PetType petType, Care additionalCare);
    //Care findCareByName(String name);
    //List<CareProvision> findCaresProvidedByVisitId(Integer visitId);
    //Page<CareProvision> findAllPaginatedCareProvisions(Pageable p);
}
