import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return name;
    }
    
    public void addPlayer(Player player){
        if (players.size() < maxSize)
        players.add(player);
    }
    
    public void printPlayers(){
        String eachPlayer;
        
        for (Player player : players){
            eachPlayer = player.getName();
            System.out.println(eachPlayer + ", goals " + player.goals());
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return players.size();
    }
    
    public int goals(){
        int goals = 0;
        
        for(Player player : players){
            goals += player.goals();
        }
        return goals;
    }
}
