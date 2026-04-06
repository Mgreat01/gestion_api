package cd.monga.gest_api.presentation.controller;

import cd.monga.gest_api.domain.model.Endpoint;
import cd.monga.gest_api.domain.service.EndpointService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/endpoints")
@RequiredArgsConstructor
public class EndpointController {

    private final EndpointService service;

    @PostMapping
    public Endpoint createEndpoint(@RequestBody Endpoint endpoint) {
        return service.createEndpoint(endpoint);
    }

    @GetMapping("/group/{groupId}")
    public List<Endpoint> getEndpointsByGroup(@PathVariable String groupId) {
        return service.getByGroup(groupId);
    }
}
