package com.poc.jedi.backend.repository;

import com.poc.jedi.backend.domain.AccountJEDI;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AccountJEDI entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AccountJEDIRepository extends JpaRepository<AccountJEDI, Long> {

}
