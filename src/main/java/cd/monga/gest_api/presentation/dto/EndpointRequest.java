package cd.monga.gest_api.presentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Schema(name = "EndpointRequest", description = "Request to create an endpoint")
public class EndpointRequest {

    @NotBlank(message = "Name is required")
    @Schema(example = "Get Users")
    private String name;

    @NotBlank(message = "HTTP method is required")
    @Schema(example = "GET")
    private String method;

    @NotBlank(message = "URL is required")
    @Schema(example = "/api/users")
    private String url;

    @NotBlank(message = "GroupId is required")
    @Schema(example = "group123")
    private String groupId;
}