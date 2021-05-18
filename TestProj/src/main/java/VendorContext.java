import exceptions.NotFoundVendorException;
import vendors.Advertising;
import vendors.GalaryVendor;
import vendors.RussoutdoorVendor;

import java.util.HashMap;
import java.util.Map;

public class VendorContext {

    RussoutdoorVendor russoutdoorVendor;
    GalaryVendor galaryVendor;

    private final Map<String, Advertising> allVendors = new HashMap<>();

    public VendorContext() {
        allVendors.put(russoutdoorVendor.getVendorName(), russoutdoorVendor);
        allVendors.put(galaryVendor.getVendorName(), galaryVendor);
    }

    public Advertising getVendorByName(String vendorName) {
        Advertising vendor = allVendors.get(vendorName);
        if(vendor == null) throw new NotFoundVendorException();
        return vendor;
    }
}
