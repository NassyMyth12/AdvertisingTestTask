import exceptions.NotFoundVendorException;
import vendors.Advertising;
import vendors.GalaryVendor;
import vendors.RussoutdoorVendor;

//заменила Фабрику на Стратегию (см VendorContext)
public class VendorFactory {

    public Advertising getVendor(String vendorName) throws NotFoundVendorException {
        if(vendorName.equals("russoutdoorVendor")) {
            return new RussoutdoorVendor();
        } else if(vendorName.equals("galaryVendor")) {
            return new GalaryVendor();
        } else {
            throw new NotFoundVendorException();
        }
    }
}
