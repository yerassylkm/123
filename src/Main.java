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

    public void displayRoomInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Night: " + pricePerNight + " KZT");
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayGuestInfo() {
        System.out.println("Guest Name: " + name);
        System.out.println("Age: " + age);
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

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void displayBookingInfo() {
        System.out.println("Guest Name: " + guest.getName());
        System.out.println("Age: " + guest.getAge());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Price per Night: " + room.getPricePerNight() + " KZT");
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
    }
}

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(101, "Single", 50000.0);
        Room room2 = new Room(102, "Double", 80000.0);

        Guest guest1 = new Guest("Alina", 30);
        Guest guest2 = new Guest("Dauren", 25);

        Booking booking1 = new Booking(guest1, room1, "2024-12-16", "2024-12-18");
        Booking booking2 = new Booking(guest2, room2, "2024-12-17", "2024-12-20");

        System.out.println("Booking 1:");
        booking1.displayBookingInfo();
        System.out.println("\nBooking 2:");
        booking2.displayBookingInfo();
    }
}