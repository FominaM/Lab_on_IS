public class Point3d {

/** координата X **/
private double xCoord;

/** координата Y **/
private double yCoord;

/** координата Z **/
private double zCoord;


/**  онструктор дл€ инициализации точки со значением (x, y, z) **/ 
public Point3d(double x, double y, double z) {
xCoord = x;
yCoord = y;
zCoord = z;
}

/**  онструктор без аргументов: по умолчанию используетс€ точка в начале координат **/
public Point3d() {
this(0, 0, 0);
}

/** ¬озвращает координату X **/
public double getX() {
return xCoord;
}

/** ¬озвращает координату Y **/
public double getY() {
return yCoord;
}

/** ¬озвращает координату Z **/
public double getZ() {
return zCoord;
}

/** ”станавливает значение координаты X **/ 
public void setX(double val) {
xCoord = val;
}

/** ”станавливает значение координаты Y **/ 
public void setY(double val) {
yCoord = val;
}

/** ”станавливает значение координаты Z **/ 
public void setZ(double val) {
zCoord = val;
}

/** –асто€ние до точки SPoint **/
public double distanceTo(Point3d SPoint) {
return Math.sqrt(Math.pow(SPoint.xCoord - this.xCoord, 2)
+ Math.pow( SPoint.yCoord - this.yCoord, 2)
+ Math.pow(SPoint.zCoord - this.zCoord, 2));
}

public boolean equals(Point3d SPoint) 
{ 
if(SPoint.xCoord == this.xCoord &&
SPoint.yCoord == this.yCoord &&
SPoint.zCoord == this.zCoord) return true;
else return false;
}

}
