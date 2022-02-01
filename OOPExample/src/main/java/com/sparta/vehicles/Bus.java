package com.sparta.vehicles;

public class Bus extends Vehicle
{
    private boolean ticketSystem;

    public Bus()
    {
        super();
    }

    public boolean isTicketSystem()
    {
        return ticketSystem;
    }

    public void setTicketSystem(boolean ticketSystem)
    {
        this.ticketSystem = ticketSystem;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "ticketSystem=" + ticketSystem +
                '}';
    }
}
