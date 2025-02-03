
    public class TriangleValidator {
        public static void main(String[] args) {
            int angle1 = 60;
            int angle2 = 60;
            int angle3 = 60;
    
            if (isTriangleValid(angle1, angle2, angle3)) {
                System.out.println("The angles form a valid triangle.");
            } else {
                System.out.println("The angles do not form a valid triangle.");
            }
        }
        public static boolean isTriangleValid(int angle1, int angle2, int angle3) {
            return (angle1 > 0 && angle2 > 0 && angle3 > 0) && (angle1 + angle2 + angle3 == 180);
        }
    }
    

