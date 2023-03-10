/*
 * Creare un oggetto appartenente alla classe Day e valorizzarlo 
 * con giorno, mese e anno tramite il suo costruttore. 
 * Successivamente, creare un secondo oggetto di tipo Day, 
 * la cui data sarà a 10 giorni di distanza dalla precedente. 
 * Una volta che i due oggetti sono stati creati, calcolare 
 * la loro distanza in giorni e stamparla a video, accertandosi 
 * che il valore restituito sia pari a 10.
3
Consiglio: l’esercizio fornisce una una classe Day che ne faciliterà 
la risoluzione grazie alla presenza:
• di un costruttore che accetta un giorno, un mese e un anno
• dei metodi addDays() e daysFrom() per effettuare il calcolo
 della distanza tra date.

 */
public class Day {
	
	public int day;
	public int month;
	public int year;
	
	
	//constructor
	public  Day(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public void addDays() {
		
	}
	

	
}
