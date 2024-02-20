package com.jyujyu.review.api;

import com.jyujyu.review.api.request.CreateAndEditRestaurantRequest;
import com.jyujyu.review.model.RestaurantEntity;
import com.jyujyu.review.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class RestaurantApi {
    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "This is getResturants";
    }

    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurant(
            @PathVariable Long restaurantId
    ) {
        return "This is get Restaurant, " + restaurantId;
    }

    @PostMapping("/restaurant")
    public RestaurantEntity createRestaurant(
            @RequestBody CreateAndEditRestaurantRequest request
            ) {
        return restaurantService.createRestaurant(request);
    }

    @PutMapping("/restaurant/{restaurantId}")
    public String editRestaurant(
            @PathVariable Long restaurantId,
            @RequestBody CreateAndEditRestaurantRequest request
    ) {
        return "This is editRestaurant, " + restaurantId + ", name=" + request.getName() + ", address=" + request.getAddress();
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaurant(
            @PathVariable Long restaurantId
    ) {
        return "This is deleteRestaurant, " + restaurantId;
    }

}
