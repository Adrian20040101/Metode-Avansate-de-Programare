package Ex2;

public class SmartRemote extends Remote {
    private int index;
    private TV tv;

    public SmartRemote(TV tv) {
        super(tv);
        this.index = 0;
    }


    @Override
    //not a good implementation since there is no foreach possible
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        System.out.println("Changing channel...");
        return tv.channelUp();
    }
}
