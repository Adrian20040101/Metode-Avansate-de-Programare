import java.util.ArrayList;

public class Ubung2 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Patrick Stewart");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Adam Sandler");

        Movie starTrek = new SciFi(list1, 50);
        Movie exorcist = new Horror(list1, 45);
        Movie grownUps = new Comedy(list1, 40);
        Movie fiveGang = new Comedy(list2, 60);

        OrderLine order1 = new OrderLine(starTrek, 5);
        OrderLine order2 = new OrderLine(exorcist, 10);
        OrderLine order3 = new OrderLine(fiveGang, 2);
        OrderLine order4 = new OrderLine(grownUps, 9);

        System.out.println(order1.calculatePrice());
        System.out.println(order2.calculatePrice());
        System.out.println(order3.calculatePrice());
        System.out.println(order4.calculatePrice());
    }
}

interface Movie{
    ArrayList<String> getActors();
    int calculatePrice();
}

class SciFi implements Movie {
    ArrayList<String> actors;
    int price;
    public SciFi(ArrayList<String> actors, int price) {
        this.actors = actors;
        this.price = price;
    }

    @Override
    public ArrayList<String> getActors() {
        return actors;
    }

    @Override
    public int calculatePrice() {
        return price;
    }
}

class Horror implements Movie {
    ArrayList<String> actors;
    int price;
    public Horror(ArrayList<String> actors, int price) {
        this.actors = actors;
        this.price = price;
    }

    @Override
    public ArrayList<String> getActors() {
        return actors;
    }

    @Override
    public int calculatePrice() {
        return price * 9/10;
    }
}

class Comedy implements Movie{
    ArrayList<String> actors;
    int price;
    public Comedy(ArrayList<String> actors, int price) {
        this.actors = actors;
        this.price = price;
    }

    @Override
    public ArrayList<String> getActors() {
        return actors;
    }

    @Override
    public int calculatePrice() {
        if (actors.contains("Adam Sandler")) return price / 2;
        return price;
    }
}

class OrderLine{
    Movie movie;
    int quantity;

    public OrderLine(Movie movie, int quantity) {
        this.movie = movie;
        this.quantity = quantity;
    }

    public int calculatePrice(){
        return quantity * movie.calculatePrice();
    }
}
