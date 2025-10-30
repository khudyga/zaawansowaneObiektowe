public interface Event{
    String getEventType();
    void notifyParticipants();
    boolean isVirtual();
}
