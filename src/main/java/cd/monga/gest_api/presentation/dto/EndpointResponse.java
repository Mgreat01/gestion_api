package cd.monga.gest_api.presentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(name = "EndpointResponse", description = "Response of endpoint")
public class EndpointResponse {

    private String id;
    private String name;
    private String method;
    private String url;
    private String groupId;
}