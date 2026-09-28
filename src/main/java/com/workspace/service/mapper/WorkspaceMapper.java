package com.workspace.service.mapper;

import com.workspace.service.dto.CreateWorkspaceRequest;
import com.workspace.service.dto.WorkspaceResponse;
import com.workspace.service.entity.Workspace;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkspaceMapper {

    Workspace toEntity(CreateWorkspaceRequest request);

    WorkspaceResponse toResponse(Workspace workspace);
}