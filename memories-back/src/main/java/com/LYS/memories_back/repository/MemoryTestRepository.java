package com.LYS.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LYS.memories_back.common.entity.MemoryTestEntity;
import com.LYS.memories_back.common.entity.pk.MemoryTestPk;

@Repository
public interface MemoryTestRepository extends JpaRepository<MemoryTestEntity, MemoryTestPk> {
  
}
