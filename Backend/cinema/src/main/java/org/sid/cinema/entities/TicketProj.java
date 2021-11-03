package org.sid.cinema.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketProj",types=Ticket.class)
public interface TicketProj {
	
	public Long getId();
	public String getNomClient();
	public Integer getCodePayement();
	public boolean getReserve();
	public double getPrix();
	public Place getPlace();
}
