package cd.monga.gest_api.domain.service;

import cd.monga.gest_api.domain.model.Endpoint;

import java.util.List;

public interface EndpointService {
Endpoint createEndpoint(Endpoint endpoint);
List<Endpoint> getByGroup(String groupId);
}
