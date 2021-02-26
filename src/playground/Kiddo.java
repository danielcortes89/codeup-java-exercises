package playground;

public class Kiddo {
    private Boolean isBully;
    public String name;

    Kiddo(String name){
        this.name = name;
    }

    public void setBully(Boolean bully) {
        this.isBully = bully;
    }

    public Boolean getBully() {
        return this.isBully;
    }

    public String getName() {
        return this.name;
    }

}
