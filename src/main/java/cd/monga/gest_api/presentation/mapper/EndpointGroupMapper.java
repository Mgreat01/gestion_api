package cd.monga.gest_api.presentation.mapper;

import cd.monga.gest_api.domain.model.EndpointGroup;
import cd.monga.gest_api.presentation.dto.EndpointGroupResponse;

public class EndpointGroupMapper {

    public static EndpointGroupResponse toResponse(EndpointGroup model) {
        return EndpointGroupResponse.builder()
                .id(model.getId())
                .name(model.getName())
                .pageId(model.getPageId())
                .build();
    }
}