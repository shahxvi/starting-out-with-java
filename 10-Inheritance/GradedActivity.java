/* A class that holds a grade for a graded activity */

public class GradedActivity {
        private double score; // numeric score

        /* The setScore method sets the score field
         * @param score The value to store in (this) score */
        public void setScore(double score) {
                this.score = score;
        }

        /* The getScore method returns the score
         * @return The value stored in the score */
        public double getScore() {
                return score;
        }

        /* The getGrade method returns a letter grade determined from the score field
         * @return The letter grade */
        public char getGrade() {
                if (score >= 90)
                        return 'A';
                if (score >= 80)
                        return 'B';
                if (score >= 70)
                        return 'C';
                if (score >= 60)
                        return 'D';
                else
                        return 'F';
        }
}
