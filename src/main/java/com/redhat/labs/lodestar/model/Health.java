package com.redhat.labs.lodestar.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Health {

    private String status;
    @Builder.Default
    private List<Check> checks = new ArrayList();;

}
