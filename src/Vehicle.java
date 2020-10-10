public class Vehicle {
    protected String plat;
    protected String merk;
    protected String color;
    protected double distance;
    double total;
    int pil;

    public Vehicle(){};

    public Vehicle(String plat, String merk, String color, double distance, double total, int pil) {
        this.plat = plat;
        this.merk = merk;
        this.color = color;
        this.distance = distance;
        this.total = total;
        this.pil = pil;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getPil() {
        return pil;
    }

    public void setPil(int pil) {
        this.pil = pil;
    }

    public void tarif () {
        if (pil == 1) {
            total = distance * 20000;
        }
        else if (pil ==  2) {
            total = distance * 10000;
        }
        else {
            System.out.println("ERROR!");
        }
    }
}
