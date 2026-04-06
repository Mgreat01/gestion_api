package cd.monga.gest_api.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Endpoint {
    private String id;
    private String name;
    private String method;
    private  String url;
    private String groupId;
}
