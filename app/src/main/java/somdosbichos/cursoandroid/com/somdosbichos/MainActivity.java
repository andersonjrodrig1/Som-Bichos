package somdosbichos.cursoandroid.com.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private ImageView imagemCao, imagemGato, imagemVaca, imagemOvelha, imagemLeao, imagemMacaco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagemCao = (ImageView) findViewById(R.id.imageCao);
        imagemCao.setOnClickListener(this);

        imagemGato = (ImageView) findViewById(R.id.imageGato);
        imagemGato.setOnClickListener(this);

        imagemVaca = (ImageView) findViewById(R.id.imageVaca);
        imagemVaca.setOnClickListener(this);

        imagemOvelha = (ImageView) findViewById(R.id.imagemOvelha);
        imagemOvelha.setOnClickListener(this);

        imagemLeao = (ImageView) findViewById(R.id.imageLeao);
        imagemLeao.setOnClickListener(this);

        imagemMacaco = (ImageView) findViewById(R.id.imageMacaco);
        imagemMacaco.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();

            mediaPlayer = null;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageCao:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cao);
                break;
            case R.id.imageGato:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gato);
                break;
            case R.id.imageLeao:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.leao);
                break;
            case R.id.imageMacaco:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.macaco);
                break;
            case R.id.imagemOvelha:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ovelha);
                break;
            case R.id.imageVaca:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vaca);
                break;
        }

        tocarSom();
    }

    private void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }
}
