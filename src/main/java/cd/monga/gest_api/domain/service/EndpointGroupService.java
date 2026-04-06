package cd.monga.gest_api.domain.service;

import cd.monga.gest_api.domain.model.EndpointGroup;

import java.util.List;

public interface EndpointGroupService {
    EndpointGroup createEndpointGroup(EndpointGroup group);
    List<EndpointGroup> getByPage(String pageId);
}
