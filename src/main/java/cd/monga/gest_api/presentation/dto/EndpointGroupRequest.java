package cd.monga.gest_api.presentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Schema(name = "EndpointGroupRequest", description = "Request to create an endpoint group")
public class EndpointGroupRequest {

    @NotBlank(message = "Name is required")
    @Schema(example = "User APIs")
    private String name;

    @NotBlank(message = "PageId is required")
    @Schema(example = "page1")
    private String pageId;
}