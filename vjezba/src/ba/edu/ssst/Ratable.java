package ba.edu.ssst;

public interface Ratable {
   void setRange(int min,int max);
   void setRating(int rating);
   int getRating();
   String getRatingStars();
}
