package com.example.repo;

import com.example.model.BitPay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BitPayRepository extends JpaRepository<BitPay,Long> {

    //derived method

}
