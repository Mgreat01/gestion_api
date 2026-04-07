package cd.monga.gest_api.presentation.controller;

import cd.monga.gest_api.domain.model.Endpoint;
import cd.monga.gest_api.domain.service.EndpointService;
import cd.monga.gest_api.presentation.dto.EndpointRequest;
import cd.monga.gest_api.presentation.dto.EndpointResponse;
import cd.monga.gest_api.presentation.mapper.EndpointMapper;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/endpoints")
@RequiredArgsConstructor
public class EndpointController {

    private final EndpointService service;

    @Operation(summary = "Create a new endpoint")
    @PostMapping
    public EndpointResponse createEndpoint(@Valid @RequestBody EndpointRequest request) {

        Endpoint model = Endpoint.builder()
                .name(request.getName())
                .method(request.getMethod())
                .url(request.getUrl())
                .groupId(request.getGroupId())
                .build();

        return EndpointMapper.toResponse(service.createEndpoint(model));
    }

    @Operation(summary = "Get endpoints by groupId")
    @GetMapping("/group/{groupId}")
    public List<EndpointResponse> getEndpointsByGroup(@PathVariable String groupId) {

        return service.getByGroup(groupId)
                .stream()
                .map(EndpointMapper::toResponse)
                .toList();
    }
}