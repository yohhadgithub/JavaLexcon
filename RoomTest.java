package chapter2;


public class RoomTest {


    public static void main(String[] args) {

        Room room = Room.Kunskap;

        for (Room r : Room.values()) {
            System.out.println(r);
        }

        SmartRoom r2 = SmartRoom.Kunskap;

        for (SmartRoom r : SmartRoom.values()) {
            System.out.println(r + ": " + r.getSeats()  + " seats");
        }
    }
}

enum Room{
    Effekt,Kunskap,Engagemang
}

enum SmartRoom{
    Effekt (20),Kunskap(15),Engagemang(10);

    private final int seats;

    SmartRoom(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
}