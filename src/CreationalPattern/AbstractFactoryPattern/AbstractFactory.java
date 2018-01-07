package CreationalPattern.AbstractFactoryPattern;

import CreationalPattern.FactoryModel.Color;
import CreationalPattern.FactoryModel.Shape;

public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}