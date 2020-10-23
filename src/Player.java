public class Player {
    private String name;
    private int num;
    private int numOfAttempts;

    public void setName (String playerName) {
        name = playerName;
    }

    public String getName () {
        return name;
    }

    public void setNum (int val) {
        num = val;
    }

    public int getNum () {
        return num;
    }

    public void setNumOfAttempts () {
        numOfAttempts = numOfAttempts + 1;
    }

    public int getNumOfAttempts () {
        return numOfAttempts;
    }

}
