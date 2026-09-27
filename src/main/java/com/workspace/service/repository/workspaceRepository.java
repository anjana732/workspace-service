package com.workspace.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.service.entity.workspace;

import java.util.UUID;

public interface workspaceRepository extends JpaRepository<workspace, UUID> {
}
