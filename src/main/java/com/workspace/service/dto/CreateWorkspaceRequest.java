package com.workspace.service.dto;

public record CreateWorkspaceRequest(
        String name,
        String description
) {
}
