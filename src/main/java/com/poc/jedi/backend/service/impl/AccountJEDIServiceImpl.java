package com.poc.jedi.backend.service.impl;

import com.poc.jedi.backend.service.AccountJEDIService;
import com.poc.jedi.backend.domain.AccountJEDI;
import com.poc.jedi.backend.repository.AccountJEDIRepository;
import com.poc.jedi.backend.service.dto.AccountJEDIDTO;
import com.poc.jedi.backend.service.mapper.AccountJEDIMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
/**
 * Service Implementation for managing AccountJEDI.
 */
@Service
@Transactional
public class AccountJEDIServiceImpl implements AccountJEDIService {

    private final Logger log = LoggerFactory.getLogger(AccountJEDIServiceImpl.class);

    private final AccountJEDIRepository accountJEDIRepository;

    private final AccountJEDIMapper accountJEDIMapper;

    public AccountJEDIServiceImpl(AccountJEDIRepository accountJEDIRepository, AccountJEDIMapper accountJEDIMapper) {
        this.accountJEDIRepository = accountJEDIRepository;
        this.accountJEDIMapper = accountJEDIMapper;
    }

    /**
     * Save a accountJEDI.
     *
     * @param accountJEDIDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public AccountJEDIDTO save(AccountJEDIDTO accountJEDIDTO) {
        log.debug("Request to save AccountJEDI : {}", accountJEDIDTO);
        AccountJEDI accountJEDI = accountJEDIMapper.toEntity(accountJEDIDTO);
        accountJEDI = accountJEDIRepository.save(accountJEDI);
        return accountJEDIMapper.toDto(accountJEDI);
    }

    /**
     * Get all the accountJEDIS.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<AccountJEDIDTO> findAll(Pageable pageable) {
        log.debug("Request to get all AccountJEDIS");
        return accountJEDIRepository.findAll(pageable)
            .map(accountJEDIMapper::toDto);
    }


    /**
     * Get one accountJEDI by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<AccountJEDIDTO> findOne(Long id) {
        log.debug("Request to get AccountJEDI : {}", id);
        return accountJEDIRepository.findById(id)
            .map(accountJEDIMapper::toDto);
    }

    /**
     * Delete the accountJEDI by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete AccountJEDI : {}", id);
        accountJEDIRepository.deleteById(id);
    }
}
