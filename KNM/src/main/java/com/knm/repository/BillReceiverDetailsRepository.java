package com.knm.repository;

import com.knm.entity.BillReceiverDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillReceiverDetailsRepository extends JpaRepository<BillReceiverDetails,Integer> {
}
