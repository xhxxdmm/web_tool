package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MuFourOneRepository extends JpaRepository<MuFourOneMember, Long>, JpaSpecificationExecutor<MuFourOneMember> {

}