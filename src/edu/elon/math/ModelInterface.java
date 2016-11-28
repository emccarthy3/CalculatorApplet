package edu.elon.math;

import java.util.Observer;

public interface ModelInterface {

public void registerObserver(Observer o);

public void removeObserver(Observer o);

public void notifyObserver(Observer o);

}
