package cd.monga.gest_api.presentation.controller;

import cd.monga.gest_api.domain.model.EndpointGroup;
import cd.monga.gest_api.domain.service.EndpointGroupService;
import cd.monga.gest_api.presentation.dto.EndpointGroupRequest;
import cd.monga.gest_api.presentation.dto.EndpointGroupResponse;
import cd.monga.gest_api.presentation.mapper.EndpointGroupMapper;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@RequiredArgsConstructor
public class EndpointGroupController {

    private final EndpointGroupService service;

    @Operation(summary = "Create a new endpoint group")
    @PostMapping
    public EndpointGroupResponse createGroup(@Valid @RequestBody EndpointGroupRequest request) {

        EndpointGroup model = EndpointGroup.builder()
                .name(request.getName())
                .pageId(request.getPageId())
                .build();

        return EndpointGroupMapper.toResponse(
                service.createEndpointGroup(model)
        );
    }

    @Operation(summary = "Get all groups by pageId")
    @GetMapping("/page/{pageId}")
    public List<EndpointGroupResponse> getGroupsByPage(@PathVariable String pageId) {

        return service.getByPage(pageId)
                .stream()
                .map(EndpointGroupMapper::toResponse)
                .toList();
    }
}