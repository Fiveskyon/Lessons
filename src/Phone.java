public class Phone {
    private String name;
    private String model;
    private int IMEI;
    private String modeIn;
    private String number;
    private int sels;
    private int whidth;



    public Phone (){}

    public Phone(String name, String model, int IMEI, String modeIn, String number, int sels, int whidth) {
        this.name = name;
        this.model = model;
        this.IMEI = IMEI;
        this.modeIn = modeIn;
        this.number = number;
        this.sels = sels;
        this.whidth = whidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIMEI() {
        return IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public String getModeIn() {
        return modeIn;
    }

    public void setModeIn(String modeIn) {
        this.modeIn = modeIn;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSels() {
        return sels;
    }

    public void setSels(int sels) {
        this.sels = sels;
    }

    public int getWhidth() {
        return whidth;
    }

    public void setWhidth(int whidth) {
        this.whidth = whidth;
    }


    public void actionCall(){
        System.out.println ("Я звоню куда то" );
    }

    public String apredelitelNomera(Phone phone){
        return phone.getNumber ();
    }
}
