package problemstatement.librarymanagementsystem;

public interface Reservable{
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
