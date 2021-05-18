package vendors;

public class RussoutdoorVendor implements Advertising {

    @Override
    public boolean validation(String creative) {
        return false;
    }

    @Override
    public void activateAd(String creative) {

    }

    @Override
    public void start(String creative) {

    }

    @Override
    public void deactivate(String creative) {

    }

    @Override
    public void stop(String creative) {

    }

    @Override
    public String getVendorName() {
        return "vendors.RussoutdoorVendor";
    }
}
