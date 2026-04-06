package cd.monga.gest_api.data.implementation;

import cd.monga.gest_api.data.entity.EndpointEntity;
import cd.monga.gest_api.data.entity.EndpointGroupEntity;
import cd.monga.gest_api.data.repository.EndpointRepository;
import cd.monga.gest_api.domain.model.Endpoint;
import cd.monga.gest_api.domain.service.EndpointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EndpointServiceImpl implements EndpointService {

    final private EndpointRepository repository;

    @Override
    public Endpoint createEndpoint(Endpoint endpoint) {
        repository.findByNameAndMethodAndGroupId(
                endpoint.getName(),
                endpoint.getMethod(),
                endpoint.getGroupId()
        ).ifPresent(e -> {
            throw new RuntimeException("Endpoint  exists ");
        });

        EndpointEntity entity = new EndpointEntity();
        entity.setName(endpoint.getName());
        entity.setMethod(endpoint.getMethod());
        entity.setUrl(endpoint.getUrl());
        entity.setGroupId(endpoint.getGroupId());

        return map(repository.save(entity));
    }

    @Override
    public List<Endpoint> getByGroup(String groupId) {
        return repository.findByGroupId(groupId)
                .stream()
                .map(this::map)
                .toList();
    }

    private Endpoint map(EndpointEntity entity) {
        return Endpoint.builder()
                .id(entity.getId())
                .name(entity.getName())
                .method(entity.getMethod())
                .url(entity.getUrl())
                .groupId(entity.getGroupId())
                .build();
    }
}
