
package robot;


public class main {
    public static void main(String[] args) {
        Robot R[] = new Robot[4];
        R[0] = new Robot("zinoo",1,2,"Est");
        R[1] = new RobotNG("yassine",0,0,"Nord");
        R[2] = new Robot("zaoui");
        R[3] = new RobotNG("daho",5,5,"Sud");
        for(int i=0;i<4;i++)
        R[i].afficher();
        }
        
    }
  

