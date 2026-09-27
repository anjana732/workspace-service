package com.workspace.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.service.entity.Workspace;

import java.util.UUID;

public interface WorkspaceRepository extends JpaRepository<Workspace, UUID> {
}
