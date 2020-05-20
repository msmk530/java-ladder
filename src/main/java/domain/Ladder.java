package domain;

import java.util.List;

public class Ladder {
    private List<Line> ladder;

    public Ladder(List<Line> ladder) {
        this.ladder = ladder;
    }

    public Line getLine(int point){
        return ladder.get(point);
    }

    public int getHeight(){
        return ladder.size();
    }
}
