package edu.ytu.nerdle.core.model.stats;

import java.io.Serializable;

public class Stats implements Serializable {
    private final int leftOffCount;
    private final int lossCount;
    private final int winCount;
    private final int averageGuessCount;
    private final int averageWinTime;

    public Stats(int leftOffCount, int lossCount, int winCount, int averageGuessCount, int averageWinTime) {
        this.leftOffCount = leftOffCount;
        this.lossCount = lossCount;
        this.winCount = winCount;
        this.averageGuessCount = averageGuessCount;
        this.averageWinTime = averageWinTime;
    }

    public int getLeftOffCount() {
        return leftOffCount;
    }

    public int getLossCount() {
        return lossCount;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getAverageGuessCount() {
        return averageGuessCount;
    }

    public int getAverageWinTime() {
        return averageWinTime;
    }
}
