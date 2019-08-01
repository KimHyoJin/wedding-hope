package com.namukeu.weddinghope.controller;

import com.namukeu.weddinghope.controller.resource.V1Product;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/product")
public class ProductListController {

  @GetMapping("/list")
  public List<V1Product> getAllProductList() {
    return List.of(
        V1Product.builder()
            .cost(100).name("sample1")
            .productImageUrl("http://mommo.com")
            .productThumbnailUrl("http://momo.com")
            .build());
  }

}
