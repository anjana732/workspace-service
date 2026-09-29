
package com.workspace.service.controller;

import com.workspace.service.dto.CreateWorkspaceRequest;
import com.workspace.service.dto.WorkspaceResponse;
import com.workspace.service.service.WorkspaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/workspaces")
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    public WorkspaceController(WorkspaceService workspaceService) {
        this.workspaceService = workspaceService;
    }

    @PostMapping
    public ResponseEntity<WorkspaceResponse> createWorkspace(
            @RequestBody CreateWorkspaceRequest request
    ) {
        WorkspaceResponse response = workspaceService.createWorkspace(
                request.name(),
                request.description()
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkspaceResponse> getWorkspace(
            @PathVariable UUID id
    ) {
        WorkspaceResponse response = workspaceService.getWorkspace(id);

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<WorkspaceResponse>> getAllWorkspaces() {

        List<WorkspaceResponse> response =
                workspaceService.getAllWorkspaces();

        return ResponseEntity.ok(response);
    }
}