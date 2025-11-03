package com.small.service.smallRepo;

import com.small.service.entity.SmallEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmallReposit extends JpaRepository<SmallEntity, Long> {
}
