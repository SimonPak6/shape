
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class SeventeenSides implements Shape
{
  private int sideLength;
  private String color;
  private
  /**
   * Constructor for objects of class Circle
   */
  public SeventeenSides(int sideLength, String color, int radius)
  {
    this.sideLength = sideLength;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return 17/2 * this.sideLength *this.radius;
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return this.sideLength * 17;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}
