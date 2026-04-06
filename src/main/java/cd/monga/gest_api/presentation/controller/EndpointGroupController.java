package cd.monga.gest_api.presentation.controller;

import cd.monga.gest_api.domain.model.EndpointGroup;
import cd.monga.gest_api.domain.service.EndpointGroupService;
import cd.monga.gest_api.domain.service.EndpointService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@RequiredArgsConstructor
public class EndpointGroupController {
    private final EndpointGroupService service;

    @PostMapping
    public EndpointGroup createGroup(EndpointGroup group) {
        return service.createEndpointGroup(group);
    }


    @GetMapping("/page/{pageId}")
    public List<EndpointGroup> getGroupsByPage(String pageId) {
        return service.getByPage(pageId);}
}
