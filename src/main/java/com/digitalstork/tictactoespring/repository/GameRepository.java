package com.digitalstork.tictactoespring.repository;

import com.digitalstork.tictactoespring.model.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameRepository extends JpaRepository<GameEntity, UUID> {
}
