package Ex2;

import java.util.Iterator;

public class Remote implements Iterator<String> {
    private int index;
    protected TV tv;

    public Remote(TV tv) {
        this.index = 0;
        this.tv = tv;
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
