package com.usm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usm.model.PortfolioDetails;

@Repository
public interface PortfolioDetailRepo extends JpaRepository<PortfolioDetails, Integer> {

}
