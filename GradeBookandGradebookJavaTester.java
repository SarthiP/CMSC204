import java.util.ArrayList;

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      
      double smallest = -99;
      
	  // STUDENT TODO: Implement your logic here
	  
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
public int getScoreSize ();
{
return scoreSize;
}
Public string toString()
{
String result= "  ";
For (int i=0; i<scoreSize;i++)
{
result+= scores[I]+" ";
}
return result;
}



GradeBookTester.java

/

import static org.junit.Assert.*;

import org.junit.Test;



public class GradeBookTester

{

  

      GradeBook g1;

      

    

      public void setUp() 

      {

            g1 = new GradeBook(5);

            g1.addScore(50.0);

            g1.addScore(75.0);

      }

     

      public void tearDown() 

      {

            g1 = null;

      }


     
      public void testSum()

      {    

            assertEquals(125, g1.sum(), .0001);

      }

    

      public void testMinimum()

      {

            assertEquals(50.0, g1.minimum(), .0001);

      }

      

      public void addScoreTest();

      {

            assertTrue(g1.toString().equals(“50.0 75.0 ”);

      }

}