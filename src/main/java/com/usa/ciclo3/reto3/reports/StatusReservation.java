package com.usa.ciclo3.reto3.reports;

import com.usa.ciclo3.reto3.model.Client;

public class StatusReservation {
    private int completed;
    private int cancelled;

    public StatusReservation(int completed, int cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getCancelled() {
        return cancelled;
    }

    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }

}
