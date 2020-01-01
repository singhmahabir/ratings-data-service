/**
 *
 */
package singh.mahabir.rds.zipkin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mahabir Singh
 *
 */
@RestController
public class CustomerVehicleDetails {

    @GetMapping(value = "/customer/{cid}/vehicledetails")
    public @ResponseBody String getCustomerVehicleDetails(@PathVariable Integer cid) {

	final Map<Integer, String> vehicles = new HashMap<>();
	vehicles.put(100, "Lincoln Continental; Plate SNUG30");
	vehicles.put(101, "Chevrolet Camaro; Plate R7TYR43");
	vehicles.put(102, "Volkswagen Beetle; Plate 6CVI3E2");

	return vehicles.get(cid);

    }
}
