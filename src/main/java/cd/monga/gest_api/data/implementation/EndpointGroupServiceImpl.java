package cd.monga.gest_api.data.implementation;

import cd.monga.gest_api.data.entity.EndpointGroupEntity;
import cd.monga.gest_api.data.repository.EndpointGroupRepository;
import cd.monga.gest_api.domain.model.EndpointGroup;
import cd.monga.gest_api.domain.service.EndpointGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EndpointGroupServiceImpl implements EndpointGroupService {

    private EndpointGroupRepository repository;
    @Override
    public EndpointGroup createEndpointGroup(EndpointGroup group) {
        repository.findByNameAndPageId(group.getName(), group.getPageId()).ifPresent(e -> {
            throw new RuntimeException("Endpoint group with the same name already exists in this page");
        });
        EndpointGroupEntity entity = new EndpointGroupEntity();
        entity.setName(group.getName());
        entity.setPageId(group.getPageId());

        return map(repository.save(entity));
    }

    @Override
    public List<EndpointGroup> getByPage(String pageId) {
        return repository.findByPageId(pageId)
                .stream()
                .map(this::map)
                .toList();
    }

    private EndpointGroup map(EndpointGroupEntity entity) {
        return EndpointGroup.builder()
                .id(entity.getId())
                .name(entity.getName())
                .pageId(entity.getPageId())
                .build();
    }
}