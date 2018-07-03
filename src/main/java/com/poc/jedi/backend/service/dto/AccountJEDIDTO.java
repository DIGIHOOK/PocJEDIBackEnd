package com.poc.jedi.backend.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the AccountJEDI entity.
 */
public class AccountJEDIDTO implements Serializable {

    private Long id;

    private Integer accountNum;

    private String accountLabel;

    private Long oldBalance;

    private Long balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountLabel() {
        return accountLabel;
    }

    public void setAccountLabel(String accountLabel) {
        this.accountLabel = accountLabel;
    }

    public Long getOldBalance() {
        return oldBalance;
    }

    public void setOldBalance(Long oldBalance) {
        this.oldBalance = oldBalance;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AccountJEDIDTO accountJEDIDTO = (AccountJEDIDTO) o;
        if (accountJEDIDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), accountJEDIDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AccountJEDIDTO{" +
            "id=" + getId() +
            ", accountNum=" + getAccountNum() +
            ", accountLabel='" + getAccountLabel() + "'" +
            ", oldBalance=" + getOldBalance() +
            ", balance=" + getBalance() +
            "}";
    }
}
