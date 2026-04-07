package cd.monga.gest_api.presentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(name = "EndpointGroupResponse", description = "Response of endpoint group")
public class EndpointGroupResponse {

    @Schema(example = "65f123abc")
    private String id;

    @Schema(example = "User APIs")
    private String name;

    @Schema(example = "page1")
    private String pageId;
}