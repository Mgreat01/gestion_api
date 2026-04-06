package cd.monga.gest_api.data.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "endpoint_groups")
@Data
public class EndpointGroupEntity {
    @Id
    private String id;
    private String name;
    private String pageId;
}
