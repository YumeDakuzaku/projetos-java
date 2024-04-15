import java.util.Scanner;

public class GradeMedia {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int grade1, grade2, grade3;
        int media, i, countStudent = 0;
        
        for(i = 0; i < 3; i++){
            
            countStudent++;
            // first grade
            System.out.println("Student " + countStudent + ", enter your 1st grade");
            grade1 = ent.nextInt();
            
            // second grade
            System.out.println("Student" + countStudent + ", enter your 2ª grade");
            grade2 = ent.nextInt();
            
            // third grade
            System.out.println("Student " + countStudent + ", enter your 3ª grade");
            grade3 = ent.nextInt();
            
            // media
            media = (grade1 + grade2 + grade3) / 3;
            System.out.println("The student's average " + countStudent + " is" + media);
            
            // show student grade
            if( (media >= 0) && (media <4) ){
                System.out.println("Grade E");
            } else if(media < 5){
                System.out.println("Grade D");
            } else if(media < 7){
                System.out.println("Grade C");
            } else if(media < 8){
                System.out.println("Grade B");
            } else if(media <= 10){
                System.out.println("Grade A");
            }
        }       
    }
}