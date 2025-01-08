import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String toString() {
        return "Room Number: " + roomNumber +
                ", Room Type: " + roomType +
                ", Price per Night: " + pricePerNight + " KZT";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber;
    }

    public int hashCode() {
        return Objects.hash(roomNumber);
    }
}

class Guest {
    private String name;
    private int age;

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Guest Name: " + name + ", Age: " + age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(name, guest.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}

class Booking {
    private Guest guest;
    private Room room;
    private String checkInDate;
    private String checkOutDate;

    public Booking(Guest guest, Room room, String checkInDate, String checkOutDate) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public String toString() {
        return "Booking Details:\n" +
                "  " + guest + "\n" +
                "  " + room + "\n" +
                "  Check-in Date: " + checkInDate + "\n" +
                "  Check-out Date: " + checkOutDate;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, "Single", 50000.0));
        rooms.add(new Room(102, "Double", 80000.0));
        rooms.add(new Room(103, "Suite", 120000.0));

        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Alina", 30));
        guests.add(new Guest("Dauren", 25));
        guests.add(new Guest("Marat", 28));

        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(guests.get(0), rooms.get(0), "2024-12-16", "2024-12-18"));
        bookings.add(new Booking(guests.get(1), rooms.get(1), "2024-12-17", "2024-12-20"));

        System.out.println("Поиск бронирования по имени 'Alina':");
        for (Booking booking : bookings) {
            if (booking.getGuest().getName().equals("Alina")) {
                System.out.println(booking);
            }
        }

        System.out.println("\nСортировка комнат по цене:");
        Collections.sort(rooms, Comparator.comparingDouble(Room::getPricePerNight));
        for (Room room : rooms) {
            System.out.println(room);
        }

        System.out.println("\nПоиск комнаты с номером 102:");
        Room foundRoom = null;
        for (Room room : rooms) {
            if (room.getRoomNumber() == 102) {
                foundRoom = room;
                break;
            }
        }
        System.out.println(foundRoom);
    }
}
