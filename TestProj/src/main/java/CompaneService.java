import vendors.Advertising;

public class CompaneService {

    public String start(String vendorName, String creative, ResponseEntity response) {
        VendorContext context = new VendorContext();
        try {
            Advertising vendor = context.getVendorByName(vendorName); //сделала получение вендора Стратегией
            vendor.validation(creative);//Цепочка обязанностей как по мне здесь излишне усложняет архитектуру
            vendor.activateAd(creative);
            vendor.start(creative);
        } catch (Exception e) {
            ResponseEntity resp = new ResponseEntity("ERROR", e.getMessage());
            return resp.getUrl();
        }
        return response.getUrl();
    }

    public String stop(String vendorName, String creative, ResponseEntity response) {
        VendorContext context = new VendorContext();
        try {
            Advertising vendor = context.getVendorByName(vendorName);
            vendor.activateAd(creative);
            vendor.deactivate(creative);
            vendor.stop(creative);
        } catch (Exception e) {
            ResponseEntity resp = new ResponseEntity("ERROR", e.getMessage());
            return resp.getUrl();
        }
        return response.getUrl();
    }
}
