package net.naji.bank_account_service.service;

import net.naji.bank_account_service.dto.BankAccountRequestDTO;
import net.naji.bank_account_service.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);


    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
