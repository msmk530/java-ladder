package domain;

import java.util.List;

public class Line {
    private final List<Boolean> points;

    public Line(List<Boolean> points) {
        this.points = points;
    }

    public Boolean checkHorizonFlag(int point){
        return points.get(point);
    }

    public List<Boolean> getLine(){
        return points;
    }

}
