public class Bird {
    private String name;
    private String latinName;
    private int observed;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }
    
    public Bird(String name){
        
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLatinName(String latinName){
        this.latinName = latinName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public void Observed(){
        observed++;
    }
}
