package cd.monga.gest_api.data.repository;

import cd.monga.gest_api.data.entity.EndpointEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface EndpointRepository extends MongoRepository<EndpointEntity, String> {
    List<EndpointEntity> findByGroupId(String groupId);
}
