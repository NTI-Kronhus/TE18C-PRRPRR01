package com.company;

public class Model {

    private Integer _answer;

    public Integer get_answer() {
        return _answer;
    }

    public void set_answer(Integer _answer) {
        this._answer = _answer;
    }

    private Integer _difficulty;

    public Integer get_difficulty() {
        return _difficulty;
    }

    public void set_difficulty(Integer _difficulty) {
        this._difficulty = _difficulty;
    }

    private Integer[] _interval = new Integer[2];

    public Integer get_interval_index(int index) {
        return _interval[index];
    }

    public void set_interval_index(int index, Integer value) {
        this._interval[index] = value;
    }
}
