package com.company;

import java.util.Scanner;

public class Controller {

    private Scanner _input;
    private Model _model;

    public Controller(){
        _model = new Model();
        _input = new Scanner(System.in);
    }

    public void start() {

        View.printStartup();

        _input.nextLine();

        while (true) {
            View.displayMenu();
            int menuChoice = getValidIntegerInput();
            switch (menuChoice) {
                case 1:
                    play();
                    break;
                case 2:
                    goodByeSequence();
                    break;
                default:
                    View.printInvalidInput();
                    continue;
            }
            promptReplay();
        }
    }

    private void play() {
        View.displayDifficultySelection();
        _model.set_difficulty(getValidIntegerInput());
        switch (_model.get_difficulty()) {
            case 1:
                theGame(20);
                break;
            case 2:
                theGame(10);
                break;
            case 3:
                theGame(5);
                break;
            default:
                View.printInvalidInput();
                break;
        }
    }

    private void theGame(int numberOfTries) {
        getInterval();
        setAnswer();
        for (int i = 0; i < numberOfTries; i++) {
            View.printSwag();
            int guess = getValidIntegerInput();
            if (guess == _model.get_answer()) {
                View.printWin(numberOfTries, i);
                return;
            } else if (guess > _model.get_interval_index(1) || guess < _model.get_interval_index(0)) {
                View.printInterval(_model.get_interval_index(0), _model.get_interval_index(0));
            } else {
                View.printHint(guess, _model.get_answer(), _model.get_difficulty());
            }
            View.printNumberOfTries(numberOfTries-1);
        }
    }

    private void setAnswer() {
        int range = (_model.get_interval_index(1) - _model.get_interval_index(0)) + 1;
        _model.set_answer((int) (Math.random() * range) + _model.get_interval_index(0));
    }

    private void getInterval() {
        View.printSetLowerIntervalPrompt();
        _model.set_interval_index(0, getValidIntegerInput()); //min
        View.printSetHigherIntervalPrompt();
        _model.set_interval_index(1, getValidIntegerInput()); //max
    }

    private void promptReplay() {
        _input.nextLine();
        View.replayPrompt();
        String goAgain = _input.nextLine();
        if (!(goAgain.toLowerCase().equals("y"))) {
            goodByeSequence();
        }
    }

    private void goodByeSequence() {
        View.printGoodBye();
        _input.close();
        System.exit(0);
    }

    private int getValidIntegerInput() {
        while (true) {
            if (!_input.hasNextInt()) {
                _input.nextLine();
                continue;
            }
            return _input.nextInt();
        }
    }
}
