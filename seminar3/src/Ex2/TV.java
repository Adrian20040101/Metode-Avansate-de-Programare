package Ex2;

import java.util.Iterator;
import java.util.List;

public class TV {
    private  String brand;
    private List<String> channels;

    private Remote remote;

    private int index;

    public TV(String brand, List<String> channels) {
        this.brand = brand;
        this.channels = channels;
        this.index = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", channels=" + channels +
                '}';
    }

    public String channelUp(){
        if (index < channels.size() - 1) this.index += 1;
        if (index > channels.size() - 1) this.index = 0;
        return channels.get(index);
    }

    public String channelDown(){
        if (index > 0) this.index -= 1;
        if (index < 0) this.index = channels.size() - 1;
        return channels.get(index);
    }

    public Iterator<String> iterator(){
        return remote;
    }
}
