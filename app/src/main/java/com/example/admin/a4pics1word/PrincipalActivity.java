package com.example.admin.a4pics1word;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Switch;
import android.app.AlertDialog;
import android.content.DialogInterface;

import static com.example.admin.a4pics1word.R.id.BAide;
import static com.example.admin.a4pics1word.R.id.BQuit;


@TargetApi(Build.VERSION_CODES.GINGERBREAD)
public class PrincipalActivity extends Activity {

    Switch simpleSwitch;
    Switch btnSwitch;
    Button btnjouer;
    Button btn1;
    Button btn2;
    MediaPlayer mps;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity);
        btnjouer = (Button)findViewById(R.id.BJouer);
        btn1 = (Button)findViewById(BQuit);
        btn2 = (Button)findViewById(BAide);
        btnSwitch = (Switch)findViewById(R.id.switchSON);
        simpleSwitch = (Switch) findViewById(R.id.switchSON);
        /********************************************************************/
        /********************************************************************/
        /********************************************************************/
        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (simpleSwitch.isChecked()){
                    mps=new MediaPlayer();
                    mps=MediaPlayer.create(getApplicationContext(),R.raw.jingle_bells);
                    mps.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    mps.setLooping(false);
                    mps.start();
                }else{
                    mps.stop();
                }
            }
        });
        /********************************************************************/
        /********************************************************************/
        /********************************************************************/
        btnjouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent secondeActivite = new Intent(PrincipalActivity.this, ChoixNiveau.class);
                    startActivity(secondeActivite);
                    }
        });
        /********************************************************************/
        /********************************************************************/
        /********************************************************************/
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(PrincipalActivity.this);
                builder.setMessage("voulez-vous vraiment quitter?");
                builder.setCancelable(false);
                builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        onDestroy();
                    }
                });
                builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert=builder.create();
                alert.show();

            }
        });
        /********************************************************************/
        /********************************************************************/
        /********************************************************************/
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(PrincipalActivity.this);
                builder.setMessage(
                        /***********************************************************************************************************************************************************************************************************************************************/
                        "Regardez 4 images et deviner le mot qui est caché. Trouver chaque mot que vous savez, pour cela, vous gagnez des pièces de monnaie qui peuvent aider à atteindre de nouveaux niveaux. Par ailleurs, il est libre.\n" +
                        "\n" +
                        "La solution des 4 Images 1 Mot de chaque question est disponible gratuitement sur l’application. Êtes vous prêt à relever le défi et trouver le Mot correct ? \n" +
                        "\n" +
                        "Testez votre QI dans la lutte contre le temps. Avec chaque Mot que vous devinez, vous gagnez des points pour les utiliser quand les mots te sembleront difficiles. La difficulté des questions s'accroît avec le nombre de points gagnée.\n" +
                        "\n" +
                        "4 Images 1 Mot en commun, Pouvez-vous les toutes deviner ? Des nombreux puzzles avec réponses vous attendent, du plus facile au plus complexe.\n" +
                        "\n" +
                        "Le jeu 4 Photos 1 Mot est entièrement gratuit, des puzzles en français, pour des moments de plaisir infini.\n" +
                        "\n" +
                        "★ Beaucoup de nouveaux niveaux en français!\n" +
                        "★ Comment jouer ? Regardez 4 images et devinez le mot qui les relie. Pour chaque mot que vous devinez, vous gagnez des pièces qui vous aideront à atteindre de nouveaux niveaux.\n" +
                        "★ Jouez à des centaines de puzzles qui deviendront plus difficiles comme vous avancez.\n" +
                        "★ Mode défi original avec des images cachées. Utilisez vos pièces avec sagesse pour les révéler. \n" +
                        "★ Vous ne perdrez jamais votre partie en cours, le jeu est sauvegardé automomatiquement pour que vous puissiez continuer juste là où vous vous êtes arreté.\n" +
                        "★ Disponible pour votre téléphone portable, tablette 7 pouces ou appareil HD 10 pouces et les appareils petits ou de faible résolution.\n" +
                        "★ Plus de niveaux mis en ligne régulièrement. Préparez-vous pour un nouveau défi à chaque fois.\n" +
                        "\n" +
                        "Profitez de centaines d'images hautes en couleur à deviner. Si vous aimez les Jeux de Mots vous devez essayer celui-là !\n" +
                        "\n" +
                        "Devinez le mot avec l'image plus petits et plus puces Gagne!");
                        /******************************************************************************************************************************************************************************************************************************************************/
                builder.setCancelable(false);
                builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert=builder.create();
                alert.show();
            }
        });

    }
        /********************************************************************/
        /********************************************************************/
    @Override
    protected void onStart() {
        super.onStart();
    }

    /********************************************************************/

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences preferences =getSharedPreferences("pref", 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(Niveau1_3.FAV, "00");

        editor.putString(Niveau1_2.bol2, "00");
        editor.putString(Niveau1_1.bol1, "00");
        editor.putString(Niveau1_3.bol3, "00");



        editor.commit();
        try{
        if(mps.isPlaying()==true){
        mps.stop();}}catch (Exception e){e.printStackTrace();}
        finish();

    }


};
