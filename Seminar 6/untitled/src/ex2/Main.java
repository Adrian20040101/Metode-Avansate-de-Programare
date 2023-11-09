package ex2;

public class Main {
    public static void main(String[] args) {
        VGAMonitor vgaMonitor = new VGAMonitor();
        Computer computer1 = new Computer(vgaMonitor);
        computer1.display();

        HDMIMonitor hdmiMonitor = new HDMIMonitor();
        Computer computer2 = new Computer(hdmiMonitor);
        computer2.display();
    }
}
