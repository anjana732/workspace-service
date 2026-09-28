package com.workspace.service.dto;

import java.time.Instant;
import java.util.UUID;

public record WorkspaceResponse(
        UUID id,
        String name,
        String description,
        Instant createdAt,
        Instant updatedAt
) {
}
