public class Point {
 private int x;
 private int y;

 public Point() {
  x= 0;
  y= 0;
 }
 public void setX(int x) {
  this.x = x;
 }
 public void setY(int y) {
  this.y = y;
 }
 public int getX() {
  return x;
 }
 public int getY() {
  return y;
 }
 public String toString() {
  String s = "(" + x;
  s = s + "," + y + ")";
  return s;
 }
}