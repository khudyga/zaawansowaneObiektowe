import java.util.ArrayList;

public class CalendarApp {
    public static void main(String[] args) {
        ArrayList<BaseEvent> events = new ArrayList<>();
        events.add(new OnlineMeeting("Zespól projektowy","12-12-2024","Zoom"));
        events.add(new OnlineMeeting("Szkolenie java","11-11-2011","Teams"));
        events.add(new OnlineMeeting("Podsumowanie projektu","13-12-2029","Meet"));
        for (BaseEvent event : events){
            event.getDetails();
            event.notifyParticipants();
        }
    }
}
