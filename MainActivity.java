package studio2ds.rapsimulator;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {


    private Button btn_n_game;

    private Button btn_c_game;

    private Button btn_settings;

    private Button btn_exit;

    static ExecutorService executorService;
    {
executorService = Executors.newCachedThreadPool();



    }


      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   final  CharacterGenerationActivity  s = new CharacterGenerationActivity();


        btn_n_game = (Button) findViewById(R.id.btn_n_game);
        btn_c_game = (Button) findViewById(R.id.btn_c_game);
        btn_settings = (Button) findViewById(R.id.btn_settings);
        btn_exit = (Button) findViewById(R.id.btn_exit);

        btn_n_game.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void goToNewActivity(View view){
        Intent n_Gintent = new Intent(this,CharacterGenerationActivity.class);
        startActivity(n_Gintent);
    }

}



