package com.exchangerate.repository;

import com.exchangerate.entity.CurrencyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<CurrencyModel, Long> {

}
