package ex2;

public class Computer {
    private VGAPort vgaport;
    private HDMIPort hdmiPort;

    public Computer(VGAPort vgaport) {
        this.vgaport = vgaport;
    }

    public Computer(HDMIPort hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    public void display(){
        vgaport.connectVGA();
    }
}
