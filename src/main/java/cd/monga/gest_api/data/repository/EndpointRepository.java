package cd.monga.gest_api.data.repository;

import cd.monga.gest_api.data.entity.EndpointEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface EndpointRepository extends MongoRepository<EndpointEntity, String> {

    Optional<EndpointEntity> findByNameAndMethodAndGroupId(String name, String method, String groupId);
    List<EndpointEntity> findByGroupId(String groupId);
}
