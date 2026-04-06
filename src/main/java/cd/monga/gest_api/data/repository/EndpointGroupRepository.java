package cd.monga.gest_api.data.repository;

import cd.monga.gest_api.data.entity.EndpointGroupEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EndpointGroupRepository extends MongoRepository<EndpointGroupEntity, String> {
    List<EndpointGroupEntity> findByPageId(String pageId);
}
