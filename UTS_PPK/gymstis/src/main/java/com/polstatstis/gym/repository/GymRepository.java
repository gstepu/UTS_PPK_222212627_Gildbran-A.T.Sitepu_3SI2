package com.polstatstis.gym.repository;

/**
 * @author gildbran
 */

import com.polstatstis.gym.entity.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "gym", path = "gym")
public interface GymRepository extends PagingAndSortingRepository<Gym,Long>,
CrudRepository<Gym,Long>, JpaRepository<Gym, Long>{
    
}
