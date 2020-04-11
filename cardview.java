package kaygrafix.com.transformapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class cardview extends Activity {
  GridLayout mainGrid;


    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview);

        mainGrid=(GridLayout)findViewById(R.id.mainGrid);
        //set  event
        setSingleEvent(mainGrid);



    }
    private void setSingleEvent (GridLayout mainGrid){
        for (int i=0; i<mainGrid.getChildCount();i++)
        {
           CardView one=(CardView)mainGrid.getChildAt(0);
           //access the elements in the card view using the index
            CardView two=(CardView)mainGrid.getChildAt(1);
            CardView three=(CardView)mainGrid.getChildAt(2);
            CardView four=(CardView)mainGrid.getChildAt(3);
           one.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
          Intent intent=new Intent(cardview.this,profile.class);
          startActivity(intent);
                   Toast.makeText(cardview.this, "profile", Toast.LENGTH_SHORT).show();
               }


           });
           two.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(cardview.this,finance.class);
                   startActivity(intent);

                   Toast.makeText(cardview.this, "finance", Toast.LENGTH_SHORT).show();
               }
           });
           three.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(cardview.this,results.class);
                   startActivity(intent);
                   Toast.makeText(cardview.this, "results", Toast.LENGTH_SHORT).show();
               }
           });
           four.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(cardview.this,course.class);
                   startActivity(intent);
                   Toast.makeText(cardview.this, "course outline", Toast.LENGTH_SHORT).show();
               }
           });
        }
    }
}
