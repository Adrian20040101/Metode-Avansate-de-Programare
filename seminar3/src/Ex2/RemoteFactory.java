package Ex2;

import java.util.Iterator;

public class RemoteFactory {
    //factory method
    public Iterator<String> createRemote(String type, TV tv){
        if (type.equals("basic")) return new Remote(tv);
        if (type.equals("smart")) return new SmartRemote(tv);
        return null;
    }
}
