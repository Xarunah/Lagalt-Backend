package com.example.lagaltbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PutProjectApplication {
    private long projectId;
    private long userId;
    private boolean reviewed;
    private boolean accepted;
}
