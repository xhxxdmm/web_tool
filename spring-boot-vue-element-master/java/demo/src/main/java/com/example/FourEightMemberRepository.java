package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FourEightMemberRepository extends JpaRepository<FourEightMember, Long>, JpaSpecificationExecutor<FourEightMember> {

}