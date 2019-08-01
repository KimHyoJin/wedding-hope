package com.namukeu.weddinghope.controller.resource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class V1Product {

  private String name;
  private Integer cost;
  private String productThumbnailUrl;
  private String productImageUrl;
}
