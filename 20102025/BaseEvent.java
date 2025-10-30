import java.util.Scanner;

abstract public class BaseEvent implements Event {
    protected String name;
    protected String date;
    protected String[] participants;

    public BaseEvent(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void addParticipants(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilu chcesz zaprosić uczestników na " + name  + "? ");
        int numOfParticipants = sc.nextInt();
        sc.nextLine();
        participants = new String[numOfParticipants];
        for (int i = 0; i < participants.length; i++) {
            System.out.println("Podaj nazwę " + (i+1) + " uczestnika");
            participants[i] = sc.nextLine();
        }
    }
    public abstract String getLocation();
    public void getDetails(){
        System.out.println("Nazwa wydarzenia " + name);
        System.out.println("Data " + date);
        System.out.println("Typ wydarzenia " + getEventType());
        System.out.println("Lokalizacja wydarzenia " + getLocation());
        System.out.println("Uczestnicy");
        for (String participant : participants){
            System.out.println(" - " + participant);
        }
    }
}
