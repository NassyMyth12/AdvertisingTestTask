package vendors;

public interface Advertising {

    boolean validation(String creative);
    void activateAd(String creative);
    void start(String creative);
    void deactivate(String creative);
    void stop(String creative);
    String getVendorName();
}
