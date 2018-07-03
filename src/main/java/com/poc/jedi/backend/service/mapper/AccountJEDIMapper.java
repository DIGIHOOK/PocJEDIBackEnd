package com.poc.jedi.backend.service.mapper;

import com.poc.jedi.backend.domain.*;
import com.poc.jedi.backend.service.dto.AccountJEDIDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity AccountJEDI and its DTO AccountJEDIDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AccountJEDIMapper extends EntityMapper<AccountJEDIDTO, AccountJEDI> {



    default AccountJEDI fromId(Long id) {
        if (id == null) {
            return null;
        }
        AccountJEDI accountJEDI = new AccountJEDI();
        accountJEDI.setId(id);
        return accountJEDI;
    }
}
