package cd.monga.gest_api.data.repository;

import cd.monga.gest_api.data.entity.EndpointGroupEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EndpointGroupRepository extends MongoRepository<EndpointGroupEntity, String> {
    Optional<EndpointGroupEntity> findByNameAndPageId(String name, String pageId);
    List<EndpointGroupEntity> findByPageId(String pageId);
}
