package com.polstatstis.gym.repository;

/**
 * @author gildbran
 */

import com.polstatstis.gym.entity.Alat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "alat", path = "alat")
public interface AlatRepository extends PagingAndSortingRepository<Alat,Long>,
CrudRepository<Alat,Long>, JpaRepository<Alat, Long>{
    
}
