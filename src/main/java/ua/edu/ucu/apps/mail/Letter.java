package ua.edu.ucu.apps.mail;

public class Letter implements MailCode {
    private static final String TEMPLATE = "Dear %s, deadlines is coming! " +
            "Prepare yourself " +
            "Sleep well) " +
            "Please, visit krysova poradnia UCU: %s";

    @Override
    public String generate(Client client) {
        return String.format(TEMPLATE, client.getName(), "https://www.ucu.edu.ua");
    }
}