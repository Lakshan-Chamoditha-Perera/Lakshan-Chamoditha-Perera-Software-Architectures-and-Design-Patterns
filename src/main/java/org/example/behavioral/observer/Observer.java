package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
  protected Subject subject;
  abstract   void update();
}
