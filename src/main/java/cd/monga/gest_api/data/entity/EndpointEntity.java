package cd.monga.gest_api.data.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "endpoints")
@Data
public class EndpointEntity {
    @Id
    private String id;
    private String name;
    private String method;
    private String url;
    private String groupId;
}
