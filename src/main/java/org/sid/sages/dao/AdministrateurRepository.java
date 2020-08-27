package org.sid.sages.dao;

import org.sid.sages.entity.users.administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdministrateurRepository extends JpaRepository<administrateur,Long> {

}
