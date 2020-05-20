package org.sid.dao;
  
import org.sid.entities.Communication;
import org.springframework.data.jpa.repository.JpaRepository;

  public interface CommunicationRepository extends JpaRepository<Communication, Long>{
   
  }
 