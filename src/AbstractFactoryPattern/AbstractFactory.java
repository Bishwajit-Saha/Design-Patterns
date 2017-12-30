package AbstractFactoryPattern;

import FactoryModel.Color;
import FactoryModel.Shape;

public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}