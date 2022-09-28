package com.trendyol.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class SliderDto {
    private Long id;
    private String title;
    private String img;
    private Long creator_id;
}
