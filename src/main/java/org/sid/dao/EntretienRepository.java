package org.sid.dao;
  
import org.sid.entities.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;

  public interface EntretienRepository extends JpaRepository<Entretien, Long>{
   
  }
 