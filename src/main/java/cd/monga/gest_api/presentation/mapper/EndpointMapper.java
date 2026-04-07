package cd.monga.gest_api.presentation.mapper;

import cd.monga.gest_api.domain.model.Endpoint;
import cd.monga.gest_api.presentation.dto.EndpointResponse;

public class EndpointMapper {

    public static EndpointResponse toResponse(Endpoint model) {
        return EndpointResponse.builder()
                .id(model.getId())
                .name(model.getName())
                .method(model.getMethod())
                .url(model.getUrl())
                .groupId(model.getGroupId())
                .build();
    }
}