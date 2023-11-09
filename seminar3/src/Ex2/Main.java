package Ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV("cheap", List.of("Digi Sport 1", "Antena3", "KanalD"));

        RemoteFactory rf = new RemoteFactory();
        Remote basic = (Remote) rf.createRemote("basic", tv);
        tv.setRemote(basic);

        Remote smart = (Remote) rf.createRemote("smart", tv);
        tv.setRemote(smart);

        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();

        System.out.println(tv);

        Remote remote = (Remote) tv.iterator();
        remote.next();
    }
}
