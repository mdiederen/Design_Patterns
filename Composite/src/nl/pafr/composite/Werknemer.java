package nl.pafr.composite;

public interface Werknemer {
	
	public void add(Werknemer werknemer);
    public void remove(Werknemer werknemer);
    public Werknemer getChild(int i);
    public String getNaam();
    public double getSalaris();
    public void print();
    
}