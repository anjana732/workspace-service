package com.workspace.service.service;


import com.workspace.service.repository.WorkspaceRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkspaceService {
    private final WorkspaceRepository workspaceRepository;

    public WorkspaceService(WorkspaceRepository workspaceRepository){
        this.workspaceRepository = workspaceRepository;
    }
}
