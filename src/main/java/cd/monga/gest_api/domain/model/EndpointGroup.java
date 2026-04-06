package cd.monga.gest_api.domain.model;


import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class EndpointGroup {
    private String id;
    private String name;
    private String pageId;
    private List<Endpoint> endpoints = new ArrayList<>();
}
