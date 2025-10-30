public class OnlineMeeting extends BaseEvent{
    private String platform;

    public OnlineMeeting(String name, String date, String platform) {
        super(name, date);
        this.platform = platform;
    }

    @Override
    public String getEventType() {
        return "Spotkanie onlilne";
    }

    @Override
    public String getLocation() {
        return "Platforma " + platform;
    }

    @Override
    public void notifyParticipants() {
        System.out.println("Powiadomienie: Wydarzenie " + name + " odbędzie się online na platformie " + platform);
    }


    @Override
    public boolean isVirtual() {
        return false;
}}