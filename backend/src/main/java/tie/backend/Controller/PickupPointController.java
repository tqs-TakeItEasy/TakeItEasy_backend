package tie.backend.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tie.backend.model.Delivery;
import tie.backend.model.PickupPoint;
import tie.backend.service.DeliveryService;
import tie.backend.service.PickupPointService;

import java.util.List;

@RestController
@CrossOrigin(origins={"http://localhost:3000", "http://127.0.0.1:3000"})
@RequestMapping("/api/v1/")
public class PickupPointController {

    @Autowired
    PickupPointService pickupPointService;


    // POST - NEW PICKUP POINT
    @PostMapping("pickuppoint/add/")
    public ResponseEntity<PickupPoint> addNewPickupPoint(@RequestBody PickupPoint newPickupPoint) {
        PickupPoint pickupPoint = pickupPointService.addPickupPoint(newPickupPoint);
        pickupPoint.setId(pickupPointService.getNextId());
        return ResponseEntity.ok().body(pickupPoint);
    }
}