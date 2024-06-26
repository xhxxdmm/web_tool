package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FourtyMemberRepository extends JpaRepository<FourtyMember, Long>, JpaSpecificationExecutor<FourtyMember> {

}